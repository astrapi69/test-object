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

public class PrimitiveArrays
{
	private boolean[] booleanArray;
	private byte[] byteArray;
	private char[] charArray;
	private short[] shortArray;
	private int[] intArray;
	private long[] longArray;
	private float[] floatArray;
	private double[] doubleArray;

	protected PrimitiveArrays(PrimitivesArraysBuilder<?, ?> b)
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

	public static PrimitivesArraysBuilder<?, ?> builder()
	{
		return new PrimitivesArraysBuilderImpl();
	}

	public boolean[] getBooleanArray()
	{
		return this.booleanArray;
	}

	public byte[] getByteArray()
	{
		return this.byteArray;
	}

	public char[] getCharArray()
	{
		return this.charArray;
	}

	public short[] getShortArray()
	{
		return this.shortArray;
	}

	public int[] getIntArray()
	{
		return this.intArray;
	}

	public long[] getLongArray()
	{
		return this.longArray;
	}

	public float[] getFloatArray()
	{
		return this.floatArray;
	}

	public double[] getDoubleArray()
	{
		return this.doubleArray;
	}

	public void setBooleanArray(boolean[] booleanArray)
	{
		this.booleanArray = booleanArray;
	}

	public void setByteArray(byte[] byteArray)
	{
		this.byteArray = byteArray;
	}

	public void setCharArray(char[] charArray)
	{
		this.charArray = charArray;
	}

	public void setShortArray(short[] shortArray)
	{
		this.shortArray = shortArray;
	}

	public void setIntArray(int[] intArray)
	{
		this.intArray = intArray;
	}

	public void setLongArray(long[] longArray)
	{
		this.longArray = longArray;
	}

	public void setFloatArray(float[] floatArray)
	{
		this.floatArray = floatArray;
	}

	public void setDoubleArray(double[] doubleArray)
	{
		this.doubleArray = doubleArray;
	}

	public boolean equals(final Object o)
	{
		if (o == this)
			return true;
		if (!(o instanceof PrimitiveArrays))
			return false;
		final PrimitiveArrays other = (PrimitiveArrays)o;
		if (!other.canEqual((Object)this))
			return false;
		if (!java.util.Arrays.equals(this.getBooleanArray(), other.getBooleanArray()))
			return false;
		if (!java.util.Arrays.equals(this.getByteArray(), other.getByteArray()))
			return false;
		if (!java.util.Arrays.equals(this.getCharArray(), other.getCharArray()))
			return false;
		if (!java.util.Arrays.equals(this.getShortArray(), other.getShortArray()))
			return false;
		if (!java.util.Arrays.equals(this.getIntArray(), other.getIntArray()))
			return false;
		if (!java.util.Arrays.equals(this.getLongArray(), other.getLongArray()))
			return false;
		if (!java.util.Arrays.equals(this.getFloatArray(), other.getFloatArray()))
			return false;
		if (!java.util.Arrays.equals(this.getDoubleArray(), other.getDoubleArray()))
			return false;
		return true;
	}

	protected boolean canEqual(final Object other)
	{
		return other instanceof PrimitiveArrays;
	}

	public int hashCode()
	{
		final int PRIME = 59;
		int result = 1;
		result = result * PRIME + java.util.Arrays.hashCode(this.getBooleanArray());
		result = result * PRIME + java.util.Arrays.hashCode(this.getByteArray());
		result = result * PRIME + java.util.Arrays.hashCode(this.getCharArray());
		result = result * PRIME + java.util.Arrays.hashCode(this.getShortArray());
		result = result * PRIME + java.util.Arrays.hashCode(this.getIntArray());
		result = result * PRIME + java.util.Arrays.hashCode(this.getLongArray());
		result = result * PRIME + java.util.Arrays.hashCode(this.getFloatArray());
		result = result * PRIME + java.util.Arrays.hashCode(this.getDoubleArray());
		return result;
	}

	public String toString()
	{
		return "PrimitiveArrays(booleanArray=" + java.util.Arrays.toString(
			this.getBooleanArray()) + ", byteArray=" + java.util.Arrays.toString(
			this.getByteArray()) + ", charArray=" + java.util.Arrays.toString(
			this.getCharArray()) + ", shortArray=" + java.util.Arrays.toString(
			this.getShortArray()) + ", intArray=" + java.util.Arrays.toString(
			this.getIntArray()) + ", longArray=" + java.util.Arrays.toString(
			this.getLongArray()) + ", floatArray=" + java.util.Arrays.toString(
			this.getFloatArray()) + ", doubleArray=" + java.util.Arrays.toString(
			this.getDoubleArray()) + ")";
	}

	public static abstract class PrimitivesArraysBuilder<C extends PrimitiveArrays, B extends PrimitivesArraysBuilder<C, B>>
	{
		private boolean[] booleanArray;
		private byte[] byteArray;
		private char[] charArray;
		private short[] shortArray;
		private int[] intArray;
		private long[] longArray;
		private float[] floatArray;
		private double[] doubleArray;

		public B booleanArray(boolean[] booleanArray)
		{
			this.booleanArray = booleanArray;
			return self();
		}

		public B byteArray(byte[] byteArray)
		{
			this.byteArray = byteArray;
			return self();
		}

		public B charArray(char[] charArray)
		{
			this.charArray = charArray;
			return self();
		}

		public B shortArray(short[] shortArray)
		{
			this.shortArray = shortArray;
			return self();
		}

		public B intArray(int[] intArray)
		{
			this.intArray = intArray;
			return self();
		}

		public B longArray(long[] longArray)
		{
			this.longArray = longArray;
			return self();
		}

		public B floatArray(float[] floatArray)
		{
			this.floatArray = floatArray;
			return self();
		}

		public B doubleArray(double[] doubleArray)
		{
			this.doubleArray = doubleArray;
			return self();
		}

		protected abstract B self();

		public abstract C build();

		public String toString()
		{
			return "PrimitiveArrays.PrimitivesArraysBuilder(booleanArray=" + java.util.Arrays.toString(
				this.booleanArray) + ", byteArray=" + java.util.Arrays.toString(
				this.byteArray) + ", charArray=" + java.util.Arrays.toString(
				this.charArray) + ", shortArray=" + java.util.Arrays.toString(
				this.shortArray) + ", intArray=" + java.util.Arrays.toString(
				this.intArray) + ", longArray=" + java.util.Arrays.toString(
				this.longArray) + ", floatArray=" + java.util.Arrays.toString(
				this.floatArray) + ", doubleArray=" + java.util.Arrays.toString(
				this.doubleArray) + ")";
		}
	}

	private static final class PrimitivesArraysBuilderImpl
		extends PrimitivesArraysBuilder<PrimitiveArrays, PrimitivesArraysBuilderImpl>
	{
		private PrimitivesArraysBuilderImpl()
		{
		}

		protected PrimitivesArraysBuilderImpl self()
		{
			return this;
		}

		public PrimitiveArrays build()
		{
			return new PrimitiveArrays(this);
		}
	}
}
