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
package io.github.astrapi69.test.object.factory;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import io.github.astrapi69.meanbean.extension.MeanBeanExtensions;

/**
 * The unit test class for the class {@link TestMessagesFactory}.
 */
public class TestMessagesExtensionsTest
{

	/**
	 * Test method for {@link TestMessagesFactory#newFailMessage(String, String, String)}.
	 */
	@Test
	public void testNewFailMessage()
	{
		String expected;
		String actual;
		String expectedVariableName;
		String expectedInput;
		String actualInput;
		expectedVariableName = "fooPath";
		expectedInput = "bla";
		actualInput = "fasel";
		expected = "Expected " + expectedVariableName + " should be '" + expectedInput
			+ "' but actual result is '" + actualInput + "'.";
		actual = TestMessagesFactory.newFailMessage(expectedVariableName, expectedInput,
			actualInput);
		assertEquals(expected, actual);
	}

	/**
	 * Test method for {@link TestMessagesFactory}
	 */
	@Test
	public void testWithBeanTester()
	{
		MeanBeanExtensions.testWithBeanTester(TestMessagesFactory.class);
	}

}
