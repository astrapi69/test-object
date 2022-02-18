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

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ShapeStore
{
	private List<Shape> shapes;

	public ShapeStore(List<Shape> shapes)
	{
		this.shapes = shapes;
	}

	public ShapeStore()
	{
	}

	public static ShapeStoreBuilder builder()
	{
		return new ShapeStoreBuilder();
	}

	public void add(Shape shape)
	{
		shapes.add(shape);
	}

	public void remove(Shape shape)
	{
		shapes.remove(shape);
	}

	public List<Shape> getShapes()
	{
		return this.shapes;
	}

	public void setShapes(List<Shape> shapes)
	{
		this.shapes = shapes;
	}

	public boolean equals(final Object o)
	{
		if (o == this)
			return true;
		if (!(o instanceof ShapeStore))
			return false;
		final ShapeStore other = (ShapeStore)o;
		if (!other.canEqual((Object)this))
			return false;
		final Object this$shapes = this.getShapes();
		final Object other$shapes = other.getShapes();
		if (this$shapes == null ? other$shapes != null : !this$shapes.equals(other$shapes))
			return false;
		return true;
	}

	protected boolean canEqual(final Object other)
	{
		return other instanceof ShapeStore;
	}

	public int hashCode()
	{
		final int PRIME = 59;
		int result = 1;
		final Object $shapes = this.getShapes();
		result = result * PRIME + ($shapes == null ? 43 : $shapes.hashCode());
		return result;
	}

	public String toString()
	{
		return "ShapeStore(shapes=" + this.getShapes() + ")";
	}

	public static class ShapeStoreBuilder
	{
		private ArrayList<Shape> shapes;

		ShapeStoreBuilder()
		{
		}

		public ShapeStoreBuilder shape(Shape shape)
		{
			if (this.shapes == null)
				this.shapes = new ArrayList<Shape>();
			this.shapes.add(shape);
			return this;
		}

		public ShapeStoreBuilder shapes(Collection<? extends Shape> shapes)
		{
			if (this.shapes == null)
				this.shapes = new ArrayList<Shape>();
			this.shapes.addAll(shapes);
			return this;
		}

		public ShapeStoreBuilder clearShapes()
		{
			if (this.shapes != null)
				this.shapes.clear();
			return this;
		}

		public ShapeStore build()
		{
			List<Shape> shapes;
			switch (this.shapes == null ? 0 : this.shapes.size())
			{
				case 0 :
					shapes = Collections.emptyList();
					break;
				case 1 :
					shapes = Collections.singletonList(this.shapes.get(0));
					break;
				default :
					shapes = Collections.unmodifiableList(new ArrayList<Shape>(this.shapes));
			}

			return new ShapeStore(shapes);
		}

		public String toString()
		{
			return "ShapeStore.ShapeStoreBuilder(shapes=" + this.shapes + ")";
		}
	}
}
