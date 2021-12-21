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

import java.io.Serializable;

/**
 * The class {@link Company} is a class intended for use in unit tests.
 */
public class Company implements Serializable
{

	/**
	 * The serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The name.
	 */
	private String name;

	protected Company(CompanyBuilder<?, ?> b)
	{
		this.name = b.name;
	}

	public Company(String name)
	{
		this.name = name;
	}

	public Company()
	{
	}

	public static CompanyBuilder<?, ?> builder()
	{
		return new CompanyBuilderImpl();
	}

	public CompanyBuilder<?, ?> toBuilder()
	{
		return new CompanyBuilderImpl().$fillValuesFrom(this);
	}

	public String getName()
	{
		return this.name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public boolean equals(final Object o)
	{
		if (o == this)
			return true;
		if (!(o instanceof Company))
			return false;
		final Company other = (Company)o;
		if (!other.canEqual(this))
			return false;
		final Object this$name = this.getName();
		final Object other$name = other.getName();
		return this$name == null ? other$name == null : this$name.equals(other$name);
	}

	protected boolean canEqual(final Object other)
	{
		return other instanceof Company;
	}

	public int hashCode()
	{
		final int PRIME = 59;
		int result = 1;
		final Object $name = this.getName();
		result = result * PRIME + ($name == null ? 43 : $name.hashCode());
		return result;
	}

	public String toString()
	{
		return "Company(name=" + this.getName() + ")";
	}

	public static abstract class CompanyBuilder<C extends Company, B extends CompanyBuilder<C, B>>
	{
		private String name;

		private static void $fillValuesFromInstanceIntoBuilder(Company instance,
			CompanyBuilder<?, ?> b)
		{
			b.name(instance.name);
		}

		public B name(String name)
		{
			this.name = name;
			return self();
		}

		protected B $fillValuesFrom(C instance)
		{
			CompanyBuilder.$fillValuesFromInstanceIntoBuilder(instance, this);
			return self();
		}

		protected abstract B self();

		public abstract C build();

		public String toString()
		{
			return "Company.CompanyBuilder(name=" + this.name + ")";
		}
	}

	private static final class CompanyBuilderImpl
		extends
			CompanyBuilder<Company, CompanyBuilderImpl>
	{
		private CompanyBuilderImpl()
		{
		}

		protected CompanyBuilderImpl self()
		{
			return this;
		}

		public Company build()
		{
			return new Company(this);
		}
	}
}
