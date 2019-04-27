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
package de.alpharogroup.test.objects;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertNotNull;
import static org.testng.AssertJUnit.assertTrue;

import org.meanbean.test.BeanTester;
import org.testng.annotations.Test;

import de.alpharogroup.evaluate.object.evaluators.EqualsHashCodeAndToStringEvaluator;
import de.alpharogroup.test.objects.enums.Gender;
import io.github.benas.randombeans.api.EnhancedRandom;
import lombok.SneakyThrows;

/**
 * The unit test class for the class {@link Person}.
 */
public class PersonTest
{

	/**
	 * Test method for {@link Person#compareTo(Person)}.
	 */
	@Test
	public void testCompareTo()
	{
		/** For use of the expected result. */
		boolean expected;
		/** For use of the result of the comparison. */
		int actual;

		Person o1;
		Person o2;


		o1 = Person.builder().build();
		o2 = Person.builder().build();
		actual = o1.compareTo(o2);
		expected = actual == 0;
		assertTrue(expected);
	}

	/**
	 * Test method for {@link Person} constructors
	 */
	@Test
	public final void testConstructors()
	{
		Person model = new Person();
		assertNotNull(model);
		String name = "Foo";
		String nickname = "man";
		Gender gender = Gender.MALE;
		String about = "";
		Boolean married = false;
		model = new Person(about, gender, married, name, nickname);
		assertNotNull(model);
		model = Person.builder().build();
		assertNotNull(model);
	}

	/**
	 * Test method for {@link Person#equals(Object)} , {@link Person#hashCode()} and
	 * {@link Person#toString()}
	 */
	@Test
	@SneakyThrows
	public void testEqualsHashcodeAndToStringWithClassSilently()
	{
		boolean expected;
		boolean actual;
		actual = EqualsHashCodeAndToStringEvaluator.evaluateEqualsHashcodeAndToString(Person.class,
			clazz -> Person.builder().name(EnhancedRandom.random(String.class))
				.about(EnhancedRandom.random(String.class))
				.married(EnhancedRandom.random(Boolean.class))
				.nickname(EnhancedRandom.random(String.class)).build());
		expected = true;
		assertEquals(expected, actual);
	}

	/**
	 * Test method for {@link Person}
	 */
	@Test
	public void testWithBeanTester()
	{
		final BeanTester beanTester = new BeanTester();
		beanTester.testBean(Person.class);
	}
}
