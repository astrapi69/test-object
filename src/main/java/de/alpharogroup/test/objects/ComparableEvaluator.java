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

import static java.lang.Math.signum;

/**
 * The class {@link ComparableEvaluator} is intended to evaluate {@link Comparable} objects.
 */
public class ComparableEvaluator
{

	/**
	 * Evaluates the reversal comparison of the given objects.<br>
	 * <br>
	 *
	 * reversal comparison should be: signum(object.compareTo(anotherObject)) ==
	 * -signum(anotherObject.compareTo(object))
	 *
	 * @param <T>
	 *            the generic type
	 * @param object
	 *            the object
	 * @param anotherObject
	 *            the another object
	 * @return true, if reversal comparison is given otherwise false
	 */
	public static <T extends Comparable<T>> boolean evaluateReversalComparison(T object,
		T anotherObject)
	{
		return signum(object.compareTo(anotherObject)) == -signum(anotherObject.compareTo(object));
	}

	/**
	 * Evaluate consistency of a comparator. Consistency is given if and only if
	 * object.compareTo(anotherObject) == 0 returns the same boolean value as
	 * object.equals(anotherObject).<br>
	 * <br>
	 * Note: The given objects should be equal.
	 *
	 * @param <T>
	 *            the generic type
	 * @param object
	 *            the object
	 * @param anotherObject
	 *            the another object
	 * @return true, , if consistency is given otherwise false
	 */
	public static <T extends Comparable<T>> boolean evaluateConsistency(T object, T anotherObject)
	{
		boolean equal = object.equals(anotherObject);
		boolean compareTo = object.compareTo(anotherObject) == 0;
		return equal && compareTo;
	}

	/**
	 * Evaluate transitivity. Transitivity is given if and only if (0 &lt; b.compareTo(a)) and (0
	 * &lt; c.compareTo(b)), then (0 &lt; c.compareTo(a)).
	 *
	 * @param <T>
	 *            the generic type
	 * @param a
	 *            the first object
	 * @param b
	 *            the second object
	 * @param c
	 *            the third object
	 * @return true, if transitivity is given otherwise false
	 */
	public static <T extends Comparable<T>> boolean evaluateTransitivity(T a, T b, T c)
	{
		return (0 <= b.compareTo(a)) && (0 <= c.compareTo(b)) && (0 <= c.compareTo(a));
	}

}