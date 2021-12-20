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
package io.github.astrapi69.test.objects;

/**
 * The class {@link A} is a class intended for use in unit tests.
 */
public class A
{

	private String a;

	public A()
	{
	}

	public A(final String a)
	{
		this.a = a;
	}

	public static ABuilder builder()
	{
		return new ABuilder();
	}

	protected boolean canEqual(final Object other)
	{
		return other instanceof A;
	}

	@Override
	public boolean equals(final Object o)
	{
		if (o == this)
			return true;
		if (!(o instanceof A))
			return false;
		final A other = (A)o;
		if (!other.canEqual(this))
			return false;
		final Object this$a = this.getA();
		final Object other$a = other.getA();
		return this$a == null ? other$a == null : this$a.equals(other$a);
	}

	public String getA()
	{
		return this.a;
	}

	public A setA(final String a)
	{
		this.a = a;
		return this;
	}

	@Override
	public int hashCode()
	{
		final int PRIME = 59;
		int result = 1;
		final Object $a = this.getA();
		result = result * PRIME + ($a == null ? 43 : $a.hashCode());
		return result;
	}

	public ABuilder toBuilder()
	{
		return new ABuilder().a(this.a);
	}

	@Override
	public String toString()
	{
		return "A(a=" + this.getA() + ")";
	}

	public static class ABuilder
	{

		private String a;

		ABuilder()
		{
		}

		public ABuilder a(final String a)
		{
			this.a = a;
			return this;
		}

		public A build()
		{
			return new A(a);
		}

		@Override
		public String toString()
		{
			return "A.ABuilder(a=" + this.a + ")";
		}
	}
}
