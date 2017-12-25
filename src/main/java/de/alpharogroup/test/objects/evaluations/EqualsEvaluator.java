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
 * The class {@link EqualsEvaluator} provides algorithms for evaluate the equals contract of an
 * given object.
 */
@UtilityClass
public class EqualsEvaluator
{

	/**
	 * Evaluate reflexivity of the given object, that means according to
	 * {@link Object#equals(Object)} for any non-null reference value x, x.equals(x) should return
	 * true.
	 *
	 * @param object
	 *            the object
	 * @return true, if reflexivity is given otherwise false
	 */
	public static boolean evaluateReflexivity(Object object)
	{
		if (object == null)
		{
			return false;
		}
		return object.equals(object);
	}

}
