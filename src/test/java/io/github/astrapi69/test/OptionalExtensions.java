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
package io.github.astrapi69.test;

import java.util.Optional;
import java.util.function.Supplier;

/**
 * The class {@code OptionalExtensions} contains utility methods for handling {@link Optional}
 * objects
 */
public class OptionalExtensions
{

	/**
	 * Resolves the given {@link Supplier} and returns an {@link Optional} with its value or an
	 * empty {@code Optional} if a {@link NullPointerException} is thrown
	 *
	 * @param <T>
	 *            the type of the result
	 * @param resolver
	 *            the resolver function
	 * @return an {@code Optional} with the resolved value or an empty {@code Optional}
	 */
	public static <T> Optional<T> resolve(Supplier<T> resolver)
	{
		try
		{
			T result = resolver.get();
			return Optional.ofNullable(result);
		}
		catch (NullPointerException e)
		{
			return Optional.empty();
		}
	}

	/**
	 * Retrieves the value from the given {@link Optional} or returns the default value if the
	 * {@code Optional} is empty
	 *
	 * @param <T>
	 *            the type of the value
	 * @param optionalValue
	 *            the optional value
	 * @param defaultValue
	 *            the default value
	 * @return the value from the {@code Optional} or the default value
	 */
	public static <T> T getOptionalValue(final Optional<T> optionalValue, final T defaultValue)
	{
        return optionalValue.isPresent() ? optionalValue.get() : defaultValue;
    }
}
