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
package io.github.astrapi69.test.object.type.hierarchy.shape;

public class Rectangle implements Shape
{

	private double height;
	private double width;

	public Rectangle(double height, double width)
	{
		this.height = height;
		this.width = width;
	}

	public Rectangle()
	{
	}

	public static RectangleBuilder builder()
	{
		return new RectangleBuilder();
	}

	@Override
	public double calculateArea()
	{
		return height * width;
	}

	public double getHeight()
	{
		return this.height;
	}

	public double getWidth()
	{
		return this.width;
	}

	public void setHeight(double height)
	{
		this.height = height;
	}

	public void setWidth(double width)
	{
		this.width = width;
	}

	public boolean equals(final Object o)
	{
		if (o == this)
			return true;
		if (!(o instanceof Rectangle))
			return false;
		final Rectangle other = (Rectangle)o;
		if (!other.canEqual(this))
			return false;
		if (Double.compare(this.getHeight(), other.getHeight()) != 0)
			return false;
		return Double.compare(this.getWidth(), other.getWidth()) == 0;
	}

	protected boolean canEqual(final Object other)
	{
		return other instanceof Rectangle;
	}

	public int hashCode()
	{
		final int PRIME = 59;
		int result = 1;
		final long $height = Double.doubleToLongBits(this.getHeight());
		result = result * PRIME + (int)($height >>> 32 ^ $height);
		final long $width = Double.doubleToLongBits(this.getWidth());
		result = result * PRIME + (int)($width >>> 32 ^ $width);
		return result;
	}

	public String toString()
	{
		return "Rectangle(height=" + this.getHeight() + ", width=" + this.getWidth() + ")";
	}

	public static class RectangleBuilder
	{
		private double height;
		private double width;

		RectangleBuilder()
		{
		}

		public RectangleBuilder height(double height)
		{
			this.height = height;
			return this;
		}

		public RectangleBuilder width(double width)
		{
			this.width = width;
			return this;
		}

		public Rectangle build()
		{
			return new Rectangle(height, width);
		}

		public String toString()
		{
			return "Rectangle.RectangleBuilder(height=" + this.height + ", width=" + this.width
				+ ")";
		}
	}
}
