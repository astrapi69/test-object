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

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertNotNull;

import org.meanbean.test.BeanTester;
import org.testng.annotations.Test;

import io.github.astrapi69.evaluate.object.verifier.ContractVerifier;

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

	/**
	 * Test method for {@link Employee#equals(Object)} , {@link Employee#hashCode()} and
	 * {@link Employee#toString()}
	 */
	@Test
	public void verifyEqualsHashcodeAndToStringContracts()
	{
		ContractVerifier.of(Light.class).verify();
	}
}
