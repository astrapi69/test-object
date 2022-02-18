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

public class Circle implements Shape
{
	private double radius;

	public Circle(double radius)
	{
		this.radius = radius;
	}

	public Circle()
	{
	}

	public static CircleBuilder builder()
	{
		return new CircleBuilder();
	}

	@Override
	public double calculateArea()
	{
		return 3.14 * radius * radius;
	}

	public double getRadius()
	{
		return this.radius;
	}

	public void setRadius(double radius)
	{
		this.radius = radius;
	}

	public boolean equals(final Object o)
	{
		if (o == this)
			return true;
		if (!(o instanceof Circle))
			return false;
		final Circle other = (Circle)o;
		if (!other.canEqual(this))
			return false;
		return Double.compare(this.getRadius(), other.getRadius()) == 0;
	}

	protected boolean canEqual(final Object other)
	{
		return other instanceof Circle;
	}

	public int hashCode()
	{
		final int PRIME = 59;
		int result = 1;
		final long $radius = Double.doubleToLongBits(this.getRadius());
		result = result * PRIME + (int)($radius >>> 32 ^ $radius);
		return result;
	}

	public String toString()
	{
		return "Circle(radius=" + this.getRadius() + ")";
	}

	public static class CircleBuilder
	{
		private double radius;

		CircleBuilder()
		{
		}

		public CircleBuilder radius(double radius)
		{
			this.radius = radius;
			return this;
		}

		public Circle build()
		{
			return new Circle(radius);
		}

		public String toString()
		{
			return "Circle.CircleBuilder(radius=" + this.radius + ")";
		}
	}
}
