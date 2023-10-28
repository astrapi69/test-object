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
package io.github.astrapi69.test.object.factory;

/**
 * The class {@link TestMessagesFactory} generates any messages that are needed in test classes.
 */
public final class TestMessagesFactory
{
	private TestMessagesFactory()
	{
	}

	/**
	 * Factory method for create a new fail message for a test as String object.
	 *
	 * @param expectedVariableName
	 *            the expected variable name
	 * @param expected
	 *            the expected
	 * @param actual
	 *            the actual
	 * @return the new fail message for a test as a String object
	 */
	public static String newFailMessage(final String expectedVariableName, final String expected,
		final String actual)
	{
		final String failMessage = "Expected " + expectedVariableName + " should be '" + expected
			+ "' but actual result is '" + actual + "'.";
		return failMessage;
	}

}
