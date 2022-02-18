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
package io.github.astrapi69.test.object.type.hierarchy.animal;

public class Snake implements Animal
{
	private String name;
	private String description;

	public Snake(String name, String description)
	{
		this.name = name;
		this.description = description;
	}

	public Snake()
	{
	}

	protected Snake(SnakeBuilder<?, ?> b)
	{
		this.name = b.name;
		this.description = b.description;
	}

	public static SnakeBuilder<?, ?> builder()
	{
		return new SnakeBuilderImpl();
	}

	public String getName()
	{
		return this.name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getDescription()
	{
		return this.description;
	}

	public void setDescription(String description)
	{
		this.description = description;
	}

	public boolean equals(final Object o)
	{
		if (o == this)
			return true;
		if (!(o instanceof Snake))
			return false;
		final Snake other = (Snake)o;
		if (!other.canEqual(this))
			return false;
		final Object this$name = this.getName();
		final Object other$name = other.getName();
		if (this$name == null ? other$name != null : !this$name.equals(other$name))
			return false;
		final Object this$description = this.getDescription();
		final Object other$description = other.getDescription();
		return this$description == null
			? other$description == null
			: this$description.equals(other$description);
	}

	protected boolean canEqual(final Object other)
	{
		return other instanceof Snake;
	}

	public int hashCode()
	{
		final int PRIME = 59;
		int result = 1;
		final Object $name = this.getName();
		result = result * PRIME + ($name == null ? 43 : $name.hashCode());
		final Object $description = this.getDescription();
		result = result * PRIME + ($description == null ? 43 : $description.hashCode());
		return result;
	}

	public String toString()
	{
		return "Snake(name=" + this.getName() + ", description=" + this.getDescription() + ")";
	}

	public static abstract class SnakeBuilder<C extends Snake, B extends SnakeBuilder<C, B>>
	{
		private String name;
		private String description;

		public B name(String name)
		{
			this.name = name;
			return self();
		}

		public B description(String description)
		{
			this.description = description;
			return self();
		}

		protected abstract B self();

		public abstract C build();

		public String toString()
		{
			return "Snake.SnakeBuilder(name=" + this.name + ", description=" + this.description
				+ ")";
		}
	}

	private static final class SnakeBuilderImpl extends SnakeBuilder<Snake, SnakeBuilderImpl>
	{
		private SnakeBuilderImpl()
		{
		}

		protected SnakeBuilderImpl self()
		{
			return this;
		}

		public Snake build()
		{
			return new Snake(this);
		}
	}
}
