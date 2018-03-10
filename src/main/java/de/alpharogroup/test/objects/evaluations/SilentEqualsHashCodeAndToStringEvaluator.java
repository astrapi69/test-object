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

import java.lang.reflect.InvocationTargetException;

import org.apache.commons.beanutils.BeanUtils;

import io.github.benas.randombeans.api.EnhancedRandom;

/**
 * The class {@link SilentEqualsHashCodeAndToStringEvaluator} is a combination of all evaluators.
 */
public class SilentEqualsHashCodeAndToStringEvaluator
{

	/**
	 * Evaluates all the contract conditions for the methods {@link Object#equals(Object)},
	 * {@link Object#hashCode()} and {@link Object#toString()} from the given {@link Class}.
	 *
	 * @param <T>
	 *            the generic type
	 * @param cls
	 *            the class
	 * @return true, if all contract conditions for the methods {@link Object#equals(Object)},
	 *         {@link Object#hashCode()} and {@link Object#toString()} is given otherwise false
	 */
	public static <T> boolean evaluateEqualsHashcodeAndToStringQuietly(Class<T> cls)
	{
		final T first = EnhancedRandom.random(cls);
		final T second = EnhancedRandom.random(cls);
		final T third = cloneBeanQuietly(first);
		final T fourth = cloneBeanQuietly(third);
		boolean evaluated;
		evaluated = EqualsHashCodeAndToStringEvaluator.evaluateEqualsHashcodeAndToString(first, second,
			third, fourth);
		return evaluated;
	}

	/**
	 * Clone the given bean quietly.
	 *
	 * @param <T>
	 *            the generic type of the given bean
	 * @param bean
	 *            the bean to clone
	 * @return the cloned bean or null if the clone process failed.
	 */
	@SuppressWarnings("unchecked")
	public static <T> T cloneBeanQuietly(T bean)
	{
		T clonedBean;
		try
		{
			clonedBean = (T)BeanUtils.cloneBean(bean);
		}
		catch (IllegalAccessException | InstantiationException | InvocationTargetException
			| NoSuchMethodException e)
		{
			clonedBean = null;
		}
		return clonedBean;
	}

}
