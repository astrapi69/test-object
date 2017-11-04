package de.alpharogroup.test.messages;

import lombok.experimental.UtilityClass;

/**
 * The class {@link TestMessagesExtensions} generates any messages that are needed in test classes.
 */
@UtilityClass
public class TestMessagesExtensions
{

	/**
	 * Factory method for create a new fail message for a test as String object.
	 *
	 * @param expectedVariableName
	 *            the expected variable name
	 * @param expected
	 *            the expected
	 * @param actual
	 *            the actual
	 * @return the new fail message for a test as String object
	 */
	public static String newFailMessage(final String expectedVariableName, final String expected,
		final String actual)
	{
		final String failMessage = "Expected " + expectedVariableName + " should be '" + expected
			+ "' but actual result is '" + actual + "'.";
		return failMessage;
	}

}
