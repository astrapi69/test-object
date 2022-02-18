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
package io.github.astrapi69.test.object.typehierarchy.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeStore
{
	private List<Shape> store = new ArrayList<>();

	public ShapeStore(List<Shape> store)
	{
		this.store = store;
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
		store.add(shape);
	}

	public void remove(Shape shape)
	{
		store.remove(shape);
	}

	public List<Shape> getStore()
	{
		return this.store;
	}

	public void setStore(List<Shape> store)
	{
		this.store = store;
	}

	public boolean equals(final Object o)
	{
		if (o == this)
			return true;
		if (!(o instanceof ShapeStore))
			return false;
		final ShapeStore other = (ShapeStore)o;
		if (!other.canEqual(this))
			return false;
		final Object this$store = this.getStore();
		final Object other$store = other.getStore();
		return this$store == null ? other$store == null : this$store.equals(other$store);
	}

	protected boolean canEqual(final Object other)
	{
		return other instanceof ShapeStore;
	}

	public int hashCode()
	{
		final int PRIME = 59;
		int result = 1;
		final Object $store = this.getStore();
		result = result * PRIME + ($store == null ? 43 : $store.hashCode());
		return result;
	}

	public String toString()
	{
		return "ShapeStore(store=" + this.getStore() + ")";
	}

	public static class ShapeStoreBuilder
	{
		private List<Shape> store;

		ShapeStoreBuilder()
		{
		}

		public ShapeStoreBuilder store(List<Shape> store)
		{
			this.store = store;
			return this;
		}

		public ShapeStore build()
		{
			return new ShapeStore(store);
		}

		public String toString()
		{
			return "ShapeStore.ShapeStoreBuilder(store=" + this.store + ")";
		}
	}
}
