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
 * The class {@link HashcodeEvaluator} provides algorithms for evaluate the
 * <a href= "https://docs.oracle.com/javase/8/docs/api/java/lang/Object.html#hashCode--">hashcode
 * contract</a> of an given object.
 */
@UtilityClass
public class HashcodeEvaluator
{

	/**
	 * Evaluate consistency of the given object, that means according to {@link Object#hashCode()}
	 * that this method should evaluate the following contract condition:
	 * <ul>
	 * <li>Whenever it is invoked on the same object more than once during an execution of a Java
	 * application, the {@code hashCode} method must consistently return the same integer, provided
	 * no information used in {@code equals} comparisons on the object is modified. This integer
	 * need not remain consistent from one execution of an application to another execution of the
	 * same application.
	 * </ul>
	 *
	 * Note: The upper list is taken from the javadoc from {@link Object#hashCode()}
	 *
	 * @param <T>
	 *            the generic type
	 * @param object
	 *            the object
	 * @return true, if consistency contract condition of {@link Object#hashCode()} is given
	 *         otherwise false
	 */
	public static <T> boolean evaluateConsistency(T object)
	{
		if (object == null)
		{
			return false;
		}
		return object.hashCode() == object.hashCode();
	}

	/**
	 * Evaluate equality of hash code from the given objects that should be equal(if not an
	 * {@link IllegalArgumentException} will be thrown), that means according to
	 * {@link Object#hashCode()} that this method should evaluate the following contract condition:
	 * <ul>
	 * <li>If two objects are equal according to the {@code equals(Object)} method, then calling the
	 * {@code hashCode} method on each of the two objects must produce the same integer result.
	 * </ul>
	 *
	 * @param <T>
	 *            the generic type
	 * @param object
	 *            the object
	 * @param anotherObject
	 *            the another object
	 * @return true, if equality of hash code from the given objects is given otherwise false
	 */
	public static <T> boolean evaluateEquality(T object, T anotherObject)
	{
		if (object == null)
		{
			return false;
		}
		if (object.equals(anotherObject))
		{
			return object.hashCode() == anotherObject.hashCode();
		}
		throw new IllegalArgumentException(
			"Given arguments should be equal for evaluate equality of hash code");
	}

	/**
	 * Evaluate unequality of hash code from the given objects that should be unequal(if not an
	 * {@link IllegalArgumentException} will be thrown), that means according to
	 * {@link Object#hashCode()} that this method should evaluate the following contract condition:
	 * <ul>
	 * <li>It is <em>not</em> required that if two objects are unequal according to the
	 * {@link java.lang.Object#equals(java.lang.Object)} method, then calling the {@code hashCode}
	 * method on each of the two objects must produce distinct integer results. However, the
	 * programmer should be aware that producing distinct integer results for unequal objects may
	 * improve the performance of hash tables.
	 * </ul>
	 *
	 * @param <T>
	 *            the generic type
	 * @param object
	 *            the object
	 * @param anotherObject
	 *            the another object
	 * @return true, if unequality of hash code from the given objects is given otherwise false
	 */
	public static <T> boolean evaluateUnequality(T object, T anotherObject)
	{
		if (object == null)
		{
			return false;
		}
		if (!object.equals(anotherObject))
		{
			return object.hashCode() != anotherObject.hashCode();
		}
		throw new IllegalArgumentException(
			"Given arguments should be unequal for evaluate unequality of hash code");
	}

}
