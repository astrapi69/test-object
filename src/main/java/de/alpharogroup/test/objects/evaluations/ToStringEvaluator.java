package de.alpharogroup.test.objects.evaluations;

import java.lang.reflect.Method;

import lombok.experimental.UtilityClass;

/**
 * The class {@link ToStringEvaluator} provides algorithms for evaluate the {@link Object#toString()} method.
 */
@UtilityClass
public class ToStringEvaluator
{

	/**
	 * Evaluate if the given class implements the toString method.
	 *
	 * @param clazz
	 *            the class
	 * @return true, if successful
	 */
	public static boolean evaluate(Class<?> clazz)
	{
		Method toString;
		try
		{
			toString = clazz.getDeclaredMethod("toString");
		}
		catch (NoSuchMethodException ex)
		{
			return false;
		}
		if (!String.class.equals(toString.getReturnType()))
		{
			return false;
		}
		return true;
	}

}
