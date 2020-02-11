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
 * The class {@link ClonableObject} is a class intended for use in unit tests that represents a
 * clonable object and implements {@link Cloneable}.
 */
public class ClonableObject implements Cloneable
{
	public static class ClonableObjectBuilder
	{

		private String name;

		ClonableObjectBuilder()
		{
		}

		public ClonableObject build()
		{
			return new ClonableObject(name);
		}

		public ClonableObjectBuilder name(final String name)
		{
			this.name = name;
			return this;
		}

		@Override
		public String toString()
		{
			return "ClonableObject.ClonableObjectBuilder(name=" + this.name + ")";
		}
	}

	public static ClonableObjectBuilder builder()
	{
		return new ClonableObjectBuilder();
	}

	/**
	 * The name.
	 */
	private String name;

	public ClonableObject()
	{
	}

	public ClonableObject(final String name)
	{
		this.name = name;
	}

	protected boolean canEqual(final Object other)
	{
		return other instanceof ClonableObject;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected Object clone() throws CloneNotSupportedException
	{
		ClonableObject clone = new ClonableObject();
		clone.setName(this.name);
		return clone;
	}

	@Override
	public boolean equals(final Object o)
	{
		if (o == this)
			return true;
		if (!(o instanceof ClonableObject))
			return false;
		final ClonableObject other = (ClonableObject)o;
		if (!other.canEqual(this))
			return false;
		final Object this$name = this.getName();
		final Object other$name = other.getName();
		if (this$name == null ? other$name != null : !this$name.equals(other$name))
			return false;
		return true;
	}

	public String getName()
	{
		return this.name;
	}

	@Override
	public int hashCode()
	{
		final int PRIME = 59;
		int result = 1;
		final Object $name = this.getName();
		result = result * PRIME + ($name == null ? 43 : $name.hashCode());
		return result;
	}

	public ClonableObject setName(final String name)
	{
		this.name = name;
		return this;
	}

	public ClonableObjectBuilder toBuilder()
	{
		return new ClonableObjectBuilder().name(this.name);
	}

	@Override
	public String toString()
	{
		return "ClonableObject(name=" + this.getName() + ")";
	}
}
