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
package de.alpharogroup.classes.inner;

/**
 * The class {@link OuterClass} is a class intended for use in unit tests.
 */
public class OuterClass
{

	/**
	 * The class {@link InnerClass} is a class intended for use in unit tests.
	 */
	public class InnerClass
	{

	}

	/**
	 * The class {@link StaticNestedClass} is a class intended for use in unit tests.
	 */
	static class StaticNestedClass
	{

		/**
		 * Static nested class method.
		 */
		public static void staticNestedClassMethod()
		{
			final Runnable runnable = new Runnable()
			{
				@Override
				public void run()
				{
				};
			};
			System.out.println(runnable.getClass().getName());
			System.out.println("Is anonymous class:" + runnable.getClass().isAnonymousClass());
			System.out.println("Is synthetic class:" + runnable.getClass().isSynthetic());
			System.out.println("Enclosing class:" + runnable.getClass().getEnclosingClass());
			System.out.println("Canonical Name:" + runnable.getClass().getCanonicalName());
			System.out.println("toString:" + runnable.getClass().toString());
			System.out.println(StaticNestedClass.class.getName());
			System.out.println("getEnclosingMethod():" + runnable.getClass().getEnclosingMethod());
			// Object[] objects = { runnable };
		}
	}

	/**
	 * The main method.
	 *
	 * @param args
	 *            the arguments
	 */
	public static void main(final String... args)
	{
		StaticNestedClass.staticNestedClassMethod();
		System.out.println(InnerClass.class);
	}
}
