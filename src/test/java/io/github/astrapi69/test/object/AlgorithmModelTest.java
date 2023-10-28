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
package io.github.astrapi69.test.object;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.meanbean.test.BeanTester;

/**
 * The unit test class for the class {@link AlgorithmModel}.
 */
public class AlgorithmModelTest
{

	/**
	 * Test method for {@link AlgorithmModel#getA()}
	 */
	@Test
	public void testGetA()
	{
		int expected;
		int actual;
		expected = 2;
		AlgorithmModel model = AlgorithmModel.builder().a(expected).build();
		actual = model.getA();
		assertEquals(expected, actual);
	}

	/**
	 * Test method for {@link AlgorithmModel#getB()}
	 */
	@Test
	public void testGetB()
	{
		int expected;
		int actual;
		expected = 2;
		AlgorithmModel model = AlgorithmModel.builder().b(expected).build();
		actual = model.getB();
		assertEquals(expected, actual);

	}

	/**
	 * Test method for {@link AlgorithmModel}
	 */
	@Test
	public void testWithBeanTester()
	{
		final BeanTester beanTester = new BeanTester();
		beanTester.testBean(AlgorithmModel.class);
	}

}
