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

/**
 * The class {@link HashcodeEvaluator} provides algorithms for evaluate the <a href=
 * "https://docs.oracle.com/javase/8/docs/api/java/lang/Object.html#hashCode--">hashcode contract</a> of an
 * given object.
 */
public class HashcodeEvaluator
{

	/**
	 * Evaluate consistency, that means the call of {@link Object#hashCode()} of the given object
	 * should return always the same int value.
	 *
	 * @param object
	 *            the object
	 * @return true, if consistency is given otherwise false
	 */
	public static boolean evaluateConsistency(Object object)
	{

		if (object == null)
		{
			return false;
		}
		return object.hashCode() == object.hashCode();
	}

	/**
	 * Evaluate equality of hash code from the given objects that should be equal, if not an
	 * {@link IllegalArgumentException} will be thrown.
	 *
	 * @param object
	 *            the object
	 * @param anotherObject
	 *            the another object
	 * @return true, if equality of hash code from the given objects is given otherwise false
	 */
	public static boolean evaluateEqualityOfHashCode(Object object, Object anotherObject)
	{

		if (object.equals(anotherObject))
		{
			return object.hashCode() == object.hashCode();
		}
		throw new IllegalArgumentException(
			"Given arguments should be equal for evaluate equality of hash code");
	}

}
