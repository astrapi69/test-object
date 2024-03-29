/**
 * The MIT License
 * <p>
 * Copyright (C) 2015 Asterios Raptis
 * <p>
 * Permission is hereby granted, free of charge, to any person obtaining
 * a copy of this software and associated documentation files (the
 * "Software"), to deal in the Software without restriction, including
 * without limitation the rights to use, copy, modify, merge, publish,
 * distribute, sublicense, and/or sell copies of the Software, and to
 * permit persons to whom the Software is furnished to do so, subject to
 * the following conditions:
 * <p>
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 * <p>
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
 * MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE
 * LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION
 * OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION
 * WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package io.github.astrapi69.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import java.util.Optional;
import java.util.function.Supplier;

import org.junit.jupiter.api.Test;

import io.github.astrapi69.test.object.CompanyGroup;
import io.github.astrapi69.test.object.Employee;
import io.github.astrapi69.test.object.Factory;
import io.github.astrapi69.test.object.Person;
import io.github.astrapi69.test.object.enumeration.Gender;

public class OptionalTest
{

	public static <T> Optional<T> resolve(Supplier<T> resolver)
	{
		try
		{
			T result = resolver.get();
			return Optional.ofNullable(result);
		}
		catch (NullPointerException e)
		{
			return Optional.empty();
		}
	}

	public static String getCeoGender(CompanyGroup companyGroup)
	{
		return Optional.ofNullable(companyGroup).map(cg -> cg.getParent())
			.map(parentFactory -> parentFactory.getCeo()).map(ceo -> ceo.getPerson())
			.map(person -> person.getGender()).map(gender -> gender.name())
			.orElse(Gender.UNDEFINED.name());
	}

	public static String getCeoNickname(CompanyGroup companyGroup)
	{
		return Optional.ofNullable(companyGroup).map(CompanyGroup::getParent).map(Factory::getCeo)
			.map(Employee::getPerson).map(Person::getNickname).orElse("bro");
	}

	public static <T> T getOptionalValue(final Optional<T> optionalValue, final T defaultValue)
	{
		if (optionalValue.isPresent())
		{
			return optionalValue.get();
		}
		return defaultValue;
	}

	@Test
	public void testNestedOptionalOfNullable()
	{
		CompanyGroup companyGroup = CompanyGroup.builder().build();
		Optional<String> optionalGenderName = resolve(
			() -> companyGroup.getParent().getCeo().getPerson().getGender().name());

		assertFalse(optionalGenderName.isPresent());

		String undefinedGender = getCeoGender(companyGroup);
		assertEquals(undefinedGender, Gender.UNDEFINED.name());

		String ceoNickname = getCeoNickname(companyGroup);
		assertEquals(ceoNickname, "bro");
	}

}
