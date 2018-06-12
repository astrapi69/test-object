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

import static org.testng.Assert.assertNotNull;
import static org.testng.AssertJUnit.assertEquals;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.meanbean.test.BeanTester;
import org.testng.annotations.Test;

import de.alpharogroup.evaluate.object.SilentEqualsHashCodeAndToStringEvaluator;
import de.alpharogroup.test.objects.enums.Gender;

/**
 * The unit test class for the class {@link Member}.
 */
public class MemberTest
{

	/**
	 * Test method for {@link Member} constructors
	 */
	@Test
	public void testConstructors()
	{
		Member model = new Member();
		assertNotNull(model);
		String name = "Foo";
		String nickname = "man";
		Gender gender = Gender.MALE;
		String about = "";
		Boolean married = false;
		Date dateofbirth = new Date();
		Date dateofMarriage = new Date();
		model = new Member(name, nickname, gender, about, married, dateofbirth, dateofMarriage);
		assertNotNull(model);
		model = Member.buildMember().build();
		assertNotNull(model);
	}

	/**
	 * Test method for {@link Member#equals(Object)} , {@link Member#hashCode()} and
	 * {@link Member#toString()}
	 */
	@Test
	public void testEqualsHashcodeAndToStringWithClassSilently()
	{
		boolean expected;
		boolean actual;
		actual = SilentEqualsHashCodeAndToStringEvaluator
			.evaluateEqualsHashcodeAndToStringQuietly(Member.class);
		expected = true;
		assertEquals(expected, actual);
	}

	/**
	 * Test method for {@link Member#setDateofbirth(Date)}
	 */
	@Test
	public void testSetDateofbirth()
	{
		Date expected;
		Date actual;
		Member model = new Member();
		assertNotNull(model);
		LocalDate.now();
		expected = new GregorianCalendar(2007, Calendar.NOVEMBER, 8).getTime();
		model.setDateofbirth(expected);
		actual = model.getDateofbirth();
		assertEquals(expected, actual);
	}

	/**
	 * Test method for {@link Member#setDateofMarriage(Date)}
	 */
	@Test
	public void testSetDateofMarriage()
	{
		Date expected;
		Date actual;
		Member model = new Member();
		assertNotNull(model);
		LocalDate.now();
		expected = new GregorianCalendar(2007, Calendar.NOVEMBER, 8).getTime();
		model.setDateofMarriage(expected);
		actual = model.getDateofMarriage();
		assertEquals(expected, actual);

	}

	/**
	 * Test method for {@link Member}
	 */
	public void testWithBeanTester()
	{
		final BeanTester beanTester = new BeanTester();
		beanTester.testBean(Member.class);
	}
}
