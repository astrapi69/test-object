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

/**
 * The class {@link AlgorithmModel} is a class intended for use in unit tests.
 */
public class AlgorithmModel implements Cloneable
{
	/**
	 * The a.
	 */
	private int a;
	/**
	 * The b.
	 */
	private int b;

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AlgorithmModel clone() throws CloneNotSupportedException
	{
		return this.toBuilder().build();
	}

	public static class AlgorithmModelBuilder
	{

		private int a;

		private int b;

		AlgorithmModelBuilder()
		{
		}

		public AlgorithmModelBuilder a(final int a)
		{
			this.a = a;
			return this;
		}

		public AlgorithmModelBuilder b(final int b)
		{
			this.b = b;
			return this;
		}

		public AlgorithmModel build()
		{
			return new AlgorithmModel(a, b);
		}

		@Override
		public String toString()
		{
			return "AlgorithmModel.AlgorithmModelBuilder(a=" + this.a + ", b=" + this.b + ")";
		}
	}

	public static AlgorithmModelBuilder builder()
	{
		return new AlgorithmModelBuilder();
	}

	public AlgorithmModelBuilder toBuilder()
	{
		return new AlgorithmModelBuilder().a(this.a).b(this.b);
	}

	@Override
	public boolean equals(final Object o)
	{
		if (o == this)
			return true;
		if (!(o instanceof AlgorithmModel))
			return false;
		final AlgorithmModel other = (AlgorithmModel)o;
		if (!other.canEqual((Object)this))
			return false;
		if (this.getA() != other.getA())
			return false;
		if (this.getB() != other.getB())
			return false;
		return true;
	}

	protected boolean canEqual(final Object other)
	{
		return other instanceof AlgorithmModel;
	}

	@Override
	public int hashCode()
	{
		final int PRIME = 59;
		int result = 1;
		result = result * PRIME + this.getA();
		result = result * PRIME + this.getB();
		return result;
	}

	public int getA()
	{
		return this.a;
	}

	public int getB()
	{
		return this.b;
	}

	public AlgorithmModel setA(final int a)
	{
		this.a = a;
		return this;
	}

	public AlgorithmModel setB(final int b)
	{
		this.b = b;
		return this;
	}

	@Override
	public String toString()
	{
		return "AlgorithmModel(a=" + this.getA() + ", b=" + this.getB() + ")";
	}

	public AlgorithmModel()
	{
	}

	public AlgorithmModel(final int a, final int b)
	{
		this.a = a;
		this.b = b;
	}
}