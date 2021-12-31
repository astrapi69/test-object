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

public class PrimitiveObjectClassArrays
{
	private Boolean[] booleanArray;
	private Byte[] byteArray;
	private Character[] charArray;
	private Short[] shortArray;
	private Integer[] intArray;
	private Long[] longArray;
	private Float[] floatArray;
	private Double[] doubleArray;

	protected PrimitiveObjectClassArrays(PrimitiveObjectClassArraysBuilder<?, ?> b)
	{
		this.booleanArray = b.booleanArray;
		this.byteArray = b.byteArray;
		this.charArray = b.charArray;
		this.shortArray = b.shortArray;
		this.intArray = b.intArray;
		this.longArray = b.longArray;
		this.floatArray = b.floatArray;
		this.doubleArray = b.doubleArray;
	}

	public static PrimitiveObjectClassArraysBuilder<?, ?> builder()
	{
		return new PrimitiveObjectClassArraysBuilderImpl();
	}

	public Boolean[] getBooleanArray()
	{
		return this.booleanArray;
	}

	public Byte[] getByteArray()
	{
		return this.byteArray;
	}

	public Character[] getCharArray()
	{
		return this.charArray;
	}

	public Short[] getShortArray()
	{
		return this.shortArray;
	}

	public Integer[] getIntArray()
	{
		return this.intArray;
	}

	public Long[] getLongArray()
	{
		return this.longArray;
	}

	public Float[] getFloatArray()
	{
		return this.floatArray;
	}

	public Double[] getDoubleArray()
	{
		return this.doubleArray;
	}

	public void setBooleanArray(Boolean[] booleanArray)
	{
		this.booleanArray = booleanArray;
	}

	public void setByteArray(Byte[] byteArray)
	{
		this.byteArray = byteArray;
	}

	public void setCharArray(Character[] charArray)
	{
		this.charArray = charArray;
	}

	public void setShortArray(Short[] shortArray)
	{
		this.shortArray = shortArray;
	}

	public void setIntArray(Integer[] intArray)
	{
		this.intArray = intArray;
	}

	public void setLongArray(Long[] longArray)
	{
		this.longArray = longArray;
	}

	public void setFloatArray(Float[] floatArray)
	{
		this.floatArray = floatArray;
	}

	public void setDoubleArray(Double[] doubleArray)
	{
		this.doubleArray = doubleArray;
	}

	public boolean equals(final Object o)
	{
		if (o == this)
			return true;
		if (!(o instanceof PrimitiveObjectClassArrays))
			return false;
		final PrimitiveObjectClassArrays other = (PrimitiveObjectClassArrays)o;
		if (!other.canEqual((Object)this))
			return false;
		if (!java.util.Arrays.deepEquals(this.getBooleanArray(), other.getBooleanArray()))
			return false;
		if (!java.util.Arrays.deepEquals(this.getByteArray(), other.getByteArray()))
			return false;
		if (!java.util.Arrays.deepEquals(this.getCharArray(), other.getCharArray()))
			return false;
		if (!java.util.Arrays.deepEquals(this.getShortArray(), other.getShortArray()))
			return false;
		if (!java.util.Arrays.deepEquals(this.getIntArray(), other.getIntArray()))
			return false;
		if (!java.util.Arrays.deepEquals(this.getLongArray(), other.getLongArray()))
			return false;
		if (!java.util.Arrays.deepEquals(this.getFloatArray(), other.getFloatArray()))
			return false;
		if (!java.util.Arrays.deepEquals(this.getDoubleArray(), other.getDoubleArray()))
			return false;
		return true;
	}

	protected boolean canEqual(final Object other)
	{
		return other instanceof PrimitiveObjectClassArrays;
	}

	public int hashCode()
	{
		final int PRIME = 59;
		int result = 1;
		result = result * PRIME + java.util.Arrays.deepHashCode(this.getBooleanArray());
		result = result * PRIME + java.util.Arrays.deepHashCode(this.getByteArray());
		result = result * PRIME + java.util.Arrays.deepHashCode(this.getCharArray());
		result = result * PRIME + java.util.Arrays.deepHashCode(this.getShortArray());
		result = result * PRIME + java.util.Arrays.deepHashCode(this.getIntArray());
		result = result * PRIME + java.util.Arrays.deepHashCode(this.getLongArray());
		result = result * PRIME + java.util.Arrays.deepHashCode(this.getFloatArray());
		result = result * PRIME + java.util.Arrays.deepHashCode(this.getDoubleArray());
		return result;
	}

	public String toString()
	{
		return "PrimitiveObjectClassArrays(booleanArray=" + java.util.Arrays.deepToString(
			this.getBooleanArray()) + ", byteArray=" + java.util.Arrays.deepToString(
			this.getByteArray()) + ", charArray=" + java.util.Arrays.deepToString(
			this.getCharArray()) + ", shortArray=" + java.util.Arrays.deepToString(
			this.getShortArray()) + ", intArray=" + java.util.Arrays.deepToString(
			this.getIntArray()) + ", longArray=" + java.util.Arrays.deepToString(
			this.getLongArray()) + ", floatArray=" + java.util.Arrays.deepToString(
			this.getFloatArray()) + ", doubleArray=" + java.util.Arrays.deepToString(
			this.getDoubleArray()) + ")";
	}

	public static abstract class PrimitiveObjectClassArraysBuilder<C extends PrimitiveObjectClassArrays, B extends PrimitiveObjectClassArraysBuilder<C, B>>
	{
		private Boolean[] booleanArray;
		private Byte[] byteArray;
		private Character[] charArray;
		private Short[] shortArray;
		private Integer[] intArray;
		private Long[] longArray;
		private Float[] floatArray;
		private Double[] doubleArray;

		public B booleanArray(Boolean[] booleanArray)
		{
			this.booleanArray = booleanArray;
			return self();
		}

		public B byteArray(Byte[] byteArray)
		{
			this.byteArray = byteArray;
			return self();
		}

		public B charArray(Character[] charArray)
		{
			this.charArray = charArray;
			return self();
		}

		public B shortArray(Short[] shortArray)
		{
			this.shortArray = shortArray;
			return self();
		}

		public B intArray(Integer[] intArray)
		{
			this.intArray = intArray;
			return self();
		}

		public B longArray(Long[] longArray)
		{
			this.longArray = longArray;
			return self();
		}

		public B floatArray(Float[] floatArray)
		{
			this.floatArray = floatArray;
			return self();
		}

		public B doubleArray(Double[] doubleArray)
		{
			this.doubleArray = doubleArray;
			return self();
		}

		protected abstract B self();

		public abstract C build();

		public String toString()
		{
			return "PrimitiveObjectClassArrays.PrimitiveObjectClassArraysBuilder(booleanArray=" + java.util.Arrays.deepToString(
				this.booleanArray) + ", byteArray=" + java.util.Arrays.deepToString(
				this.byteArray) + ", charArray=" + java.util.Arrays.deepToString(
				this.charArray) + ", shortArray=" + java.util.Arrays.deepToString(
				this.shortArray) + ", intArray=" + java.util.Arrays.deepToString(
				this.intArray) + ", longArray=" + java.util.Arrays.deepToString(
				this.longArray) + ", floatArray=" + java.util.Arrays.deepToString(
				this.floatArray) + ", doubleArray=" + java.util.Arrays.deepToString(
				this.doubleArray) + ")";
		}
	}

	private static final class PrimitiveObjectClassArraysBuilderImpl
		extends PrimitiveObjectClassArraysBuilder<PrimitiveObjectClassArrays, PrimitiveObjectClassArraysBuilderImpl>
	{
		private PrimitiveObjectClassArraysBuilderImpl()
		{
		}

		protected PrimitiveObjectClassArraysBuilderImpl self()
		{
			return this;
		}

		public PrimitiveObjectClassArrays build()
		{
			return new PrimitiveObjectClassArrays(this);
		}
	}
}
