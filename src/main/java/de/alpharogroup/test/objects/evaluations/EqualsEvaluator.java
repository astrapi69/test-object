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
package de.alpharogroup.test.objects.evaluations;

import lombok.experimental.UtilityClass;

/**
 * The class {@link EqualsEvaluator} provides algorithms for evaluate the <a href=
 * "https://docs.oracle.com/javase/8/docs/api/java/lang/Object.html#equals-java.lang.Object-">equals
 * contract</a> of an given object.
 */
@UtilityClass
public class EqualsEvaluator
{

	/**
	 * Evaluate reflexivity of the given object, that means according to
	 * {@link Object#equals(Object)} that this method should evaluate the following contract condition:
	 * <ul>
	 * <li>It is <i>reflexive</i>: for any non-null reference value {@code x}, {@code x.equals(x)}
	 * should return {@code true}.
	 * </ul>
	 *
	 * Note: The upper list is taken from the javadoc from {@link Object#equals(Object)}
	 *
	 * @param object
	 *            the object
	 * @return true, if reflexivity contract condition is given otherwise false
	 */
	public static boolean evaluateReflexivity(Object object)
	{
		if (object == null)
		{
			return false;
		}
		return object.equals(object);
	}

	/**
	 * Evaluate symmetric of the given objects, that means according to
	 * {@link Object#equals(Object)} that this method should evaluate the following contract condition:
	 * <ul>
	 * <li>It is <i>symmetric</i>: for any non-null reference values {@code x} and {@code y},
	 * {@code x.equals(y)} should return {@code true} if and only if {@code y.equals(x)} returns
	 * {@code true}.
	 * </ul>
	 *
	 * Note: The upper list is taken from the javadoc from {@link Object#equals(Object)}
	 *
	 * @param object
	 *            the object
	 * @param anotherObject
	 *            the another object
	 * @return true, if symmetric contract condition is given otherwise false
	 */
	public static boolean evaluateSymmetric(Object object, Object anotherObject)
	{
		if (object == null)
		{
			return false;
		}
		boolean even = object.equals(anotherObject);
		boolean odd = anotherObject.equals(object);
		return even && odd;
	}

	/**
	 * Evaluate transitivity of the given objects, that means according to
	 * {@link Object#equals(Object)} that this method should evaluate the following contract condition:
	 * <ul>
	 * <li>It is <i>transitive</i>: for any non-null reference values {@code x}, {@code y}, and
	 * {@code z}, if {@code x.equals(y)} returns {@code true} and {@code y.equals(z)} returns
	 * {@code true}, then {@code x.equals(z)} should return {@code true}.
	 * </ul>
	 *
	 * Note: The upper list is taken from the javadoc from {@link Object#equals(Object)}
	 *
	 * @param a
	 *            the object
	 * @param b
	 *            other object
	 * @param c
	 *            another object
	 * @return true, if symmetric contract condition is given otherwise false
	 */
	public static boolean evaluateTransitivity(Object a, Object b, Object c)
	{
		if (a == null)
		{
			return false;
		}
		boolean aEqualsB = a.equals(b);
		boolean bEqualsC = b.equals(c);
		boolean aEqualsC = a.equals(c);
		return aEqualsB && bEqualsC && aEqualsC;
	}

	/**
	 * Evaluate non-null condition is given of the given object, that means according to
	 * {@link Object#equals(Object)} that this method should evaluate the following contract condition:
	 * <ul>
	 * <li>For any non-null reference value {@code x}, {@code x.equals(null)} should return
	 * {@code false}.
	 * </ul>
	 *
	 * Note: The upper list is taken from the javadoc from {@link Object#equals(Object)}
	 *
	 * @param object
	 *            the object
	 * @return true, if non-null contract condition is given otherwise false
	 */
	public static boolean evaluateNonNull(Object object)
	{
		if (object == null)
		{
			return false;
		}
		// negate because the valid result is false and if it is valid we want to return true...
		boolean result = !object.equals(null);
		return result;
	}

	/**
	 * Evaluate consistency of the given objects, that means according to
	 * {@link Object#equals(Object)} that this method should evaluate the following contract condition:
	 * <ul>
	 * <li>It is <i>consistent</i>: for any non-null reference values {@code x} and {@code y},
	 * multiple invocations of {@code x.equals(y)} consistently return {@code true} or consistently
	 * return {@code false}, provided no information used in {@code equals} comparisons on the
	 * objects is modified.
	 * </ul>
	 *
	 * Note: The upper list is taken from the javadoc from {@link Object#equals(Object)}<br><br>
	 * This method calls the same name method with default iterations of 7<br><br>
	 *
	 * @param <T>
	 *            the generic type
	 * @param object
	 *            the object
	 * @param anotherObject
	 *            the another object
	 * @param iterations
	 *            the iterations of call of equals method.
	 * @return true, if consistency contract condition is given otherwise false
	 */
	public static <T> boolean evaluateConsistency(T object, T anotherObject)
	{
		return evaluateConsistency(object, anotherObject, 7);
	}

	/**
	 * Evaluate consistency of the given objects, that means according to
	 * {@link Object#equals(Object)} that this method should evaluate the following contract condition:
	 * <ul>
	 * <li>It is <i>consistent</i>: for any non-null reference values {@code x} and {@code y},
	 * multiple invocations of {@code x.equals(y)} consistently return {@code true} or consistently
	 * return {@code false}, provided no information used in {@code equals} comparisons on the
	 * objects is modified.
	 * </ul>
	 *
	 * Note: The upper list is taken from the javadoc from {@link Object#equals(Object)}
	 *
	 * @param <T>
	 *            the generic type
	 * @param object
	 *            the object
	 * @param anotherObject
	 *            the another object
	 * @param iterations
	 *            the iterations of call of equals method.
	 * @return true, if consistency contract condition is given otherwise false
	 */
	public static <T> boolean evaluateConsistency(T object, T anotherObject, int iterations)
	{
		if (object == null)
		{
			return false;
		}
		final boolean initialEqualsResult = object.equals(anotherObject);
		boolean valid = true;
		for (int i = 0; i < iterations; i++)
		{
			boolean currentEqualsResult = object.equals(anotherObject);
			if (initialEqualsResult != currentEqualsResult)
			{
				return false;
			}
		}
		return valid;
	}

}
