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
package io.github.astrapi69.test.object;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.Date;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.meanbean.test.BeanTester;

import io.github.astrapi69.test.object.enumtype.Gender;

/**
 * The unit test class for the class {@link PremiumMember}.
 */
public class PremiumMemberTest
{

	/**
	 * Test method for {@link PremiumMember} constructors
	 */
	@Test
	public final void testConstructors()
	{
		PremiumMember model = new PremiumMember();
		assertNotNull(model);
		String name = "Foo";
		String nickname = "man";
		Gender gender = Gender.MALE;
		String about = "";
		Boolean married = false;
		Date dateofbirth = new Date();
		Date dateofMarriage = new Date();
		String credits = "";
		model = new PremiumMember(about, gender, married, name, nickname, dateofbirth,
			dateofMarriage, credits);
		assertNotNull(model);
		model = PremiumMember.buildPremiumMember().build();
		assertNotNull(model);
	}

	/**
	 * Test method for {@link PremiumMember#setCredits(String)}
	 */
	@Test
	public void testSetCredit()
	{
		String expected;
		String actual;
		PremiumMember model = new PremiumMember();
		assertNotNull(model);
		expected = "1000";
		model.setCredits(expected);
		actual = model.getCredits();
		assertEquals(expected, actual);
	}

	/**
	 * Test method for {@link PremiumMember}
	 */
	public void testWithBeanTester()
	{
		final BeanTester beanTester = new BeanTester();
		beanTester.testBean(PremiumMember.class);
	}

}
