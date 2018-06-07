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
import static org.testng.AssertJUnit.assertNotSame;
import static org.testng.AssertJUnit.assertTrue;

import org.meanbean.test.BeanTester;
import org.testng.annotations.Test;

import de.alpharogroup.evaluate.object.EqualsEvaluator;
import de.alpharogroup.evaluate.object.HashcodeEvaluator;

/**
 * The unit test class for the class {@link Light}.
 */
public class LightTest
{

	/**
	 * Test method for {@link Light} constructors
	 */
	@Test
	public final void testConstructors()
	{
		Light model = new Light();
		assertNotNull(model);
		model = new Light(true);
		assertNotNull(model);
		model = Light.builder().build();
		assertNotNull(model);
	}	

	/**
	 * Test method for {@link Light#equals(Object)}
	 */
	@Test
	public void testEqualsObject()
	{
		final Light expected = Light.builder().on(false).build();
		final Light actual = new Light(true);

		assertNotSame(expected, actual);
		final Light third = new Light(false);
		assertEquals(expected, third);
		assertTrue(
			EqualsEvaluator.evaluateReflexivityNonNullSymmetricAndConsistency(expected, actual));
		assertTrue(EqualsEvaluator.evaluateReflexivityNonNullSymmetricConsistencyAndTransitivity(
			expected, third, new Light(false)));
	}

	/**
	 * Test method for {@link Light#hashCode()}
	 */
	@Test
	public void testHashcode()
	{
		boolean expected;
		boolean actual;
		final Light first = Light.builder().on(false).build();
		Light second = new Light(true);
		actual = HashcodeEvaluator.evaluateEquality(first, new Light(false));
		expected = true;
		assertEquals(expected, actual);

		actual = HashcodeEvaluator.evaluateConsistency(first);
		expected = true;
		assertEquals(expected, actual);

		expected = true;
		actual = HashcodeEvaluator.evaluateUnequality(first, second);
		assertEquals(expected, actual);
	}


	/**
	 * Test method for {@link Light#switchOff()}
	 */
	@Test
	public void testSwitchOff()
	{
		Light light = new Light();
		boolean expected;
		boolean actual;
		actual = light.switchOff().isOn();
		expected = false;
		assertEquals(expected, actual);
	}

	/**
	 * Test method for {@link Light#switchOn()}
	 */
	@Test
	public void testSwitchOn()
	{
		Light light = new Light();
		boolean expected;
		boolean actual;
		actual = light.switchOn().isOn();
		expected = true;
		assertEquals(expected, actual);
	}

	/**
	 * Test method for {@link Light#switchOn()}
	 */
	@Test
	public void testWithBeanTester()
	{
		final BeanTester beanTester = new BeanTester();
		beanTester.testBean(Light.class);
	}
}
