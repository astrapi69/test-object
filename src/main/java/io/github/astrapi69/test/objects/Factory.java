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

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Factory extends Company
{

	/**
	 * The serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	private List<Employee> employees;

	private Employee ceo;

	public Factory(List<Employee> employees, Employee ceo)
	{
		this.employees = employees;
		this.ceo = ceo;
	}

	public Factory()
	{
	}

	protected Factory(FactoryBuilder<?, ?> b)
	{
		super(b);
		List<Employee> employees;
		switch (b.employees == null ? 0 : b.employees.size())
		{
			case 0 :
				employees = java.util.Collections.emptyList();
				break;
			case 1 :
				employees = java.util.Collections.singletonList(b.employees.get(0));
				break;
			default :
				employees = java.util.Collections
					.unmodifiableList(new ArrayList<Employee>(b.employees));
		}
		this.employees = employees;
		this.ceo = b.ceo;
	}

	public static FactoryBuilder<?, ?> builder()
	{
		return new FactoryBuilderImpl();
	}

	public List<Employee> getEmployees()
	{
		return this.employees;
	}

	public void setEmployees(List<Employee> employees)
	{
		this.employees = employees;
	}

	public Employee getCeo()
	{
		return this.ceo;
	}

	public void setCeo(Employee ceo)
	{
		this.ceo = ceo;
	}

	public boolean equals(final Object o)
	{
		if (o == this)
			return true;
		if (!(o instanceof Factory))
			return false;
		final Factory other = (Factory)o;
		if (!other.canEqual(this))
			return false;
		final Object this$employees = this.getEmployees();
		final Object other$employees = other.getEmployees();
		if (this$employees == null
			? other$employees != null
			: !this$employees.equals(other$employees))
			return false;
		final Object this$ceo = this.getCeo();
		final Object other$ceo = other.getCeo();
		return this$ceo == null ? other$ceo == null : this$ceo.equals(other$ceo);
	}

	protected boolean canEqual(final Object other)
	{
		return other instanceof Factory;
	}

	public int hashCode()
	{
		final int PRIME = 59;
		int result = 1;
		final Object $employees = this.getEmployees();
		result = result * PRIME + ($employees == null ? 43 : $employees.hashCode());
		final Object $ceo = this.getCeo();
		result = result * PRIME + ($ceo == null ? 43 : $ceo.hashCode());
		return result;
	}

	public String toString()
	{
		return "Factory(employees=" + this.getEmployees() + ", ceo=" + this.getCeo() + ")";
	}

	public FactoryBuilder<?, ?> toBuilder()
	{
		return new FactoryBuilderImpl().$fillValuesFrom(this);
	}

	public static abstract class FactoryBuilder<C extends Factory, B extends FactoryBuilder<C, B>>
		extends
			CompanyBuilder<C, B>
	{
		private ArrayList<Employee> employees;
		private Employee ceo;

		private static void $fillValuesFromInstanceIntoBuilder(Factory instance,
			FactoryBuilder<?, ?> b)
		{
			b.employees(instance.employees == null
				? java.util.Collections.emptyList()
				: instance.employees);
			b.ceo(instance.ceo);
		}

		public B employee(Employee employee)
		{
			if (this.employees == null)
				this.employees = new ArrayList<Employee>();
			this.employees.add(employee);
			return self();
		}

		public B employees(Collection<? extends Employee> employees)
		{
			if (this.employees == null)
				this.employees = new ArrayList<Employee>();
			this.employees.addAll(employees);
			return self();
		}

		public B clearEmployees()
		{
			if (this.employees != null)
				this.employees.clear();
			return self();
		}

		public B ceo(Employee ceo)
		{
			this.ceo = ceo;
			return self();
		}

		protected B $fillValuesFrom(C instance)
		{
			super.$fillValuesFrom(instance);
			FactoryBuilder.$fillValuesFromInstanceIntoBuilder(instance, this);
			return self();
		}

		protected abstract B self();

		public abstract C build();

		public String toString()
		{
			return "Factory.FactoryBuilder(super=" + super.toString() + ", employees="
				+ this.employees + ", ceo=" + this.ceo + ")";
		}
	}

	private static final class FactoryBuilderImpl
		extends
			FactoryBuilder<Factory, FactoryBuilderImpl>
	{
		private FactoryBuilderImpl()
		{
		}

		protected FactoryBuilderImpl self()
		{
			return this;
		}

		public Factory build()
		{
			return new Factory(this);
		}
	}
}
