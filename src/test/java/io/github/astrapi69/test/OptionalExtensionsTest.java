/**
 * The MIT License
 *
 * Copyright (C) 2015 Asterios Raptis
 *
 * Permission is hereby granted, free of charge, to any person obtaining
 * a copy of this software and associated documentation files (the
 * "Software"), to deal in the Software without restriction, including
 * without limitation the rights to use, copy, modify, merge, publish,
 * distribute, sublicense, and/or sell copies of the Software, and to
 * permit persons to whom the Software is furnished to do so, subject to
 * the following conditions:
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 *
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
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Optional;
import java.util.function.Supplier;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import io.github.astrapi69.test.object.CompanyGroup;
import io.github.astrapi69.test.object.Employee;
import io.github.astrapi69.test.object.Factory;
import io.github.astrapi69.test.object.Person;
import io.github.astrapi69.test.object.enumeration.Gender;

/**
 * The class {@code OptionalExtensionsTest} contains test methods for the {@link OptionalExtensions}
 * class
 */
public class OptionalExtensionsTest
{

	/**
	 * Test method for {@link OptionalExtensions#resolve(Supplier)}
	 */
	@Test
	public void testResolve()
	{
		Supplier<String> supplier = () -> "test";
		Optional<String> result = OptionalExtensions.resolve(supplier);
		assertTrue(result.isPresent());
		assertEquals("test", result.get());

		Supplier<String> nullSupplier = () -> null;
		Optional<String> nullResult = OptionalExtensions.resolve(nullSupplier);
		assertFalse(nullResult.isPresent());

		Supplier<String> exceptionSupplier = () -> {
			throw new NullPointerException();
		};
		Optional<String> exceptionResult = OptionalExtensions.resolve(exceptionSupplier);
		assertFalse(exceptionResult.isPresent());
	}

	/**
	 * Test method for {@link OptionalExtensions#getOptionalValue(Optional, Object)}
	 */
	@Test
	public void testGetOptionalValue()
	{
		Optional<String> presentValue = Optional.of("test");
		String result = OptionalExtensions.getOptionalValue(presentValue, "default");
		assertEquals("test", result);

		Optional<String> emptyValue = Optional.empty();
		String defaultResult = OptionalExtensions.getOptionalValue(emptyValue, "default");
		assertEquals("default", defaultResult);
	}

	/**
	 * Parameterized test method for {@link OptionalExtensions#getOptionalValue(Optional, Object)}
	 * using CSV file source
	 *
	 * @param optionalValue
	 *            the optional value as string
	 * @param defaultValue
	 *            the default value
	 * @param expected
	 *            the expected result
	 */
	@ParameterizedTest
	@CsvFileSource(resources = "/optional_values.csv", numLinesToSkip = 1)
	public void testGetOptionalValueParameterized(String optionalValue, String defaultValue,
		String expected)
	{
		Optional<String> value = optionalValue.equals("null")
			? Optional.empty()
			: Optional.of(optionalValue);
		String result = OptionalExtensions.getOptionalValue(value, defaultValue);
		assertEquals(expected, result);
	}

	/**
	 * Retrieves the gender of the CEO of the given {@link CompanyGroup} as a {@link String}
	 *
	 * @param companyGroup
	 *            the company group
	 * @return the gender of the CEO or {@link Gender#UNDEFINED} if not available
	 */
	public static String getCeoGender(CompanyGroup companyGroup)
	{
		return Optional.ofNullable(companyGroup).map(cg -> cg.getParent())
			.map(parentFactory -> parentFactory.getCeo()).map(ceo -> ceo.getPerson())
			.map(person -> person.getGender()).map(gender -> gender.name())
			.orElse(Gender.UNDEFINED.name());
	}

	/**
	 * Retrieves the nickname of the CEO of the given {@link CompanyGroup}
	 *
	 * @param companyGroup
	 *            the company group
	 * @return the nickname of the CEO or "bro" if not available
	 */
	public static String getCeoNickname(CompanyGroup companyGroup)
	{
		return Optional.ofNullable(companyGroup).map(CompanyGroup::getParent).map(Factory::getCeo)
			.map(Employee::getPerson).map(Person::getNickname).orElse("bro");
	}

	/**
	 * Tests the methods {@link OptionalExtensions#resolve(Supplier)},
	 * {@link #getCeoGender(CompanyGroup)}, and {@link #getCeoNickname(CompanyGroup)}
	 */
	@Test
	public void testNestedOptionalOfNullable()
	{
		CompanyGroup companyGroup = CompanyGroup.builder().build();
		Optional<String> optionalGenderName = OptionalExtensions
			.resolve(() -> companyGroup.getParent().getCeo().getPerson().getGender().name());

		assertFalse(optionalGenderName.isPresent());

		String undefinedGender = getCeoGender(companyGroup);
		assertEquals(undefinedGender, Gender.UNDEFINED.name());

		String ceoNickname = getCeoNickname(companyGroup);
		assertEquals(ceoNickname, "bro");
	}

}
