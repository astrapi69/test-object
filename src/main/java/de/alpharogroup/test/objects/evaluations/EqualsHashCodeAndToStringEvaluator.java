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
 * The class {@link EqualsHashCodeAndToStringEvaluator} is a combination of all evaluators.
 */
public class EqualsHashCodeAndToStringEvaluator
{

	/**
	 * Evaluates the contract conditions for reflexivity, non null, symmetric and consistency of the
	 * given objects, that means according to {@link Object#equals(Object)} that this method should
	 * evaluate the following contract condition:
	 * <ul>
	 * <li>It is <i>reflexive</i>: for any non-null reference value {@code x}, {@code x.equals(x)}
	 * should return {@code true}.
	 * <li>For any non-null reference value {@code x}, {@code x.equals(null)} should return
	 * {@code false}.
	 * <li>It is <i>symmetric</i>: for any non-null reference values {@code x} and {@code y},
	 * {@code x.equals(y)} should return {@code true} if and only if {@code y.equals(x)} returns
	 * {@code true}.
	 * <li>It is <i>consistent</i>: for any non-null reference values {@code x} and {@code y},
	 * multiple invocations of {@code x.equals(y)} consistently return {@code true} or consistently
	 * return {@code false}, provided no information used in {@code equals} comparisons on the
	 * objects is modified.
	 * </ul>
	 *
	 * Note: The upper list entries is taken from the javadoc from {@link Object#equals(Object)}
	 *
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
	 * @param otherObject
	 *            the other object
	 * @return true, if reflexivity, non null, symmetric and consistency contract conditions and
	 *         equality of hash code from the given objects is given otherwise false
	 */
	public static <T> boolean evaluateEqualsAndHashcodeEquality(T object, T otherObject)
	{
		boolean evaluated;
		evaluated = EqualsEvaluator.evaluateReflexivityNonNullSymmetricAndConsistency(object,
			otherObject);
		if (!evaluated)
		{
			return false;
		}
		evaluated = HashcodeEvaluator.evaluateEquality(object, otherObject);
		if (!evaluated)
		{
			return false;
		}
		return evaluated;
	}

	/**
	 * Evaluates the contract conditions for reflexivity, non null, symmetric and consistency of the
	 * given objects, that means according to {@link Object#equals(Object)} that this method should
	 * evaluate the following contract condition:
	 * <ul>
	 * <li>It is <i>reflexive</i>: for any non-null reference value {@code x}, {@code x.equals(x)}
	 * should return {@code true}.
	 * <li>For any non-null reference value {@code x}, {@code x.equals(null)} should return
	 * {@code false}.
	 * <li>It is <i>symmetric</i>: for any non-null reference values {@code x} and {@code y},
	 * {@code x.equals(y)} should return {@code true} if and only if {@code y.equals(x)} returns
	 * {@code true}.
	 * <li>It is <i>consistent</i>: for any non-null reference values {@code x} and {@code y},
	 * multiple invocations of {@code x.equals(y)} consistently return {@code true} or consistently
	 * return {@code false}, provided no information used in {@code equals} comparisons on the
	 * objects is modified.
	 * </ul>
	 *
	 * Note: The upper list entries is taken from the javadoc from {@link Object#equals(Object)}
	 *
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
	 * @param otherObject
	 *            the other object
	 * @return true, if reflexivity, non null, symmetric and consistency contract conditions and
	 *         unequality of hash code from the given objects is given otherwise false
	 */
	public static <T> boolean evaluateEqualsAndHashcodeUnequality(T object, T otherObject)
	{
		boolean evaluated;
		evaluated = EqualsEvaluator.evaluateReflexivityNonNullSymmetricAndConsistency(object,
			otherObject);
		if (!evaluated)
		{
			return false;
		}
		evaluated = HashcodeEvaluator.evaluateUnequality(object, otherObject);
		if (!evaluated)
		{
			return false;
		}
		return evaluated;
	}

	/**
	 * Evaluates the contract conditions for reflexivity and non null, that means according to
	 * {@link Object#equals(Object)} that this method should evaluate the following contract
	 * condition:
	 * <ul>
	 * <li>It is <i>reflexive</i>: for any non-null reference value {@code x}, {@code x.equals(x)}
	 * should return {@code true}.
	 * <li>For any non-null reference value {@code x}, {@code x.equals(null)} should return
	 * {@code false}.
	 * </ul>
	 *
	 * Note: The upper list entries is taken from the javadoc from {@link Object#equals(Object)}
	 *
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
	 * @return true, if reflexivity and non-null contract conditions from
	 *         {@link Object#equals(Object)} and the consistency contract condition of
	 *         {@link Object#hashCode()} is given otherwise false
	 */
	public static <T> boolean evaluateEqualsHashcodeAndToString(T object)
	{
		boolean evaluated;
		evaluated = EqualsEvaluator.evaluateReflexivityAndNonNull(object);
		if (!evaluated)
		{
			return false;
		}
		evaluated = HashcodeEvaluator.evaluateConsistency(object);
		if (!evaluated)
		{
			return false;
		}
		evaluated = ToStringEvaluator.evaluateConsistency(object);
		if (!evaluated)
		{
			return false;
		}
		return evaluated;
	}

	/**
	 * Evaluate consistency of method {@link Object#toString()} for the given objects <br>
	 *
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
	 * Evaluate equality of hash code from the given objects that should be equal(if not an
	 * {@link IllegalArgumentException} will be thrown), that means according to
	 * {@link Object#hashCode()} that this method should evaluate the following contract condition:
	 * <ul>
	 * <li>If two objects are equal according to the {@code equals(Object)} method, then calling the
	 * {@code hashCode} method on each of the two objects must produce the same integer result.
	 * </ul>
	 *
	 * Evaluates the contract conditions for reflexivity, non null, symmetric, consistency and
	 * transitivity of the given objects, that means according to {@link Object#equals(Object)} that
	 * this method should evaluate the following contract condition:
	 * <ul>
	 * <li>It is <i>reflexive</i>: for any non-null reference value {@code x}, {@code x.equals(x)}
	 * should return {@code true}.
	 * <li>For any non-null reference value {@code x}, {@code x.equals(null)} should return
	 * {@code false}.
	 * <li>It is <i>symmetric</i>: for any non-null reference values {@code x} and {@code y},
	 * {@code x.equals(y)} should return {@code true} if and only if {@code y.equals(x)} returns
	 * {@code true}.
	 * <li>It is <i>consistent</i>: for any non-null reference values {@code x} and {@code y},
	 * multiple invocations of {@code x.equals(y)} consistently return {@code true} or consistently
	 * return {@code false}, provided no information used in {@code equals} comparisons on the
	 * objects is modified.
	 * <li>It is <i>transitive</i>: for any non-null reference values {@code x}, {@code y}, and
	 * {@code z}, if {@code x.equals(y)} returns {@code true} and {@code y.equals(z)} returns
	 * {@code true}, then {@code x.equals(z)} should return {@code true}.
	 * </ul>
	 *
	 * Note: The upper list entries is taken from the javadoc from {@link Object#equals(Object)}
	 *
	 * @param <T>
	 *            the generic type
	 * @param object
	 *            the object
	 * @param otherObject
	 *            the other object
	 * @param anotherObject
	 *            the another object
	 * @return true, if consistency of method {@link Object#toString()} for the given objects and if
	 *         consistency contract condition of {@link Object#hashCode()} is given and if equality
	 *         of hash code from the given objects is given and if reflexivity, non null, symmetric,
	 *         consistency and transitivity contract conditions is given otherwise false
	 */
	public static <T> boolean evaluateEqualsHashcodeEqualityAndToString(T object, T otherObject,
		T anotherObject)
	{
		boolean evaluated;
		evaluated = ToStringEvaluator.evaluateConsistency(object);
		if (!evaluated)
		{
			return false;
		}
		evaluated = HashcodeEvaluator.evaluateConsistency(object);
		if (!evaluated)
		{
			return false;
		}
		evaluated = HashcodeEvaluator.evaluateEquality(object, otherObject);
		if (!evaluated)
		{
			return false;
		}
		evaluated = EqualsEvaluator.evaluateReflexivityNonNullSymmetricConsistencyAndTransitivity(
			otherObject, otherObject, anotherObject);
		if (!evaluated)
		{
			return false;
		}
		return evaluated;
	}

}