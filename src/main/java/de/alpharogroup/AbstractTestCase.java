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
package de.alpharogroup;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

/**
 * The abstract class {@link AbstractTestCase} is for unit tests.
 *
 * @param <A>
 *            the generic type for the actual
 * @param <E>
 *            the element type for the expected
 */
public abstract class AbstractTestCase<A, E>
{

	/** The boolean actual result of the tests. */
	protected A actual;

	/** The boolean expected result of the tests. */
	protected E expected;

	/**
	 * Sets up method will be invoked before every unit test method
	 *
	 * @throws Exception
	 *             is thrown if an exception occurs
	 */
	@BeforeMethod
	protected void setUp() throws Exception
	{
	}

	/**
	 * Tear down method will be invoked after every unit test method <br>
	 * <br>
	 * Note: call {@code super.tearDown()} if you overwrite it for set actual and expected to null
	 *
	 * @throws Exception
	 *             is thrown if an exception occurs
	 */
	@AfterMethod
	protected void tearDown() throws Exception
	{
		actual = null;
		expected = null;
	}

}
