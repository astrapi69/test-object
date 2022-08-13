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
package io.github.astrapi69.test.object;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;

/**
 * The class {@link Employee} is a class intended for use in unit tests
 */
public class Employee implements Serializable
{

	/**
	 * The serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The id.
	 */
	private String id;

	/**
	 * The person
	 */
	private Person person;

	/**
	 * The set with the subordinates employees
	 */
	private Set<Employee> subOrdinates;

	public Employee(String id, Person person, Set<Employee> subOrdinates)
	{
		this.id = id;
		this.person = person;
		this.subOrdinates = subOrdinates;
	}

	public Employee()
	{
	}

	protected Employee(EmployeeBuilder<?, ?> b)
	{
		this.id = b.id;
		this.person = b.person;
		Set<Employee> subOrdinates;
		switch (b.subOrdinates == null ? 0 : b.subOrdinates.size())
		{
			case 0 :
				subOrdinates = java.util.Collections.emptySet();
				break;
			case 1 :
				subOrdinates = java.util.Collections.singleton(b.subOrdinates.get(0));
				break;
			default :
				subOrdinates = new java.util.LinkedHashSet<Employee>(
					b.subOrdinates.size() < 1073741824
						? 1 + b.subOrdinates.size() + (b.subOrdinates.size() - 3) / 3
						: Integer.MAX_VALUE);
				subOrdinates.addAll(b.subOrdinates);
				subOrdinates = java.util.Collections.unmodifiableSet(subOrdinates);
		}
		this.subOrdinates = subOrdinates;
	}

	public static EmployeeBuilder<?, ?> builder()
	{
		return new EmployeeBuilderImpl();
	}

	public String getId()
	{
		return this.id;
	}

	public void setId(String id)
	{
		this.id = id;
	}

	public Person getPerson()
	{
		return this.person;
	}

	public void setPerson(Person person)
	{
		this.person = person;
	}

	public Set<Employee> getSubOrdinates()
	{
		return this.subOrdinates;
	}

	public void setSubOrdinates(Set<Employee> subOrdinates)
	{
		this.subOrdinates = subOrdinates;
	}

	public boolean equals(final Object o)
	{
		if (o == this)
			return true;
		if (!(o instanceof Employee))
			return false;
		final Employee other = (Employee)o;
		if (!other.canEqual((Object)this))
			return false;
		final Object this$id = this.getId();
		final Object other$id = other.getId();
		if (this$id == null ? other$id != null : !this$id.equals(other$id))
			return false;
		final Object this$person = this.getPerson();
		final Object other$person = other.getPerson();
		if (this$person == null ? other$person != null : !this$person.equals(other$person))
			return false;
		final Object this$subOrdinates = this.getSubOrdinates();
		final Object other$subOrdinates = other.getSubOrdinates();
		if (this$subOrdinates == null
			? other$subOrdinates != null
			: !this$subOrdinates.equals(other$subOrdinates))
			return false;
		return true;
	}

	protected boolean canEqual(final Object other)
	{
		return other instanceof Employee;
	}

	public int hashCode()
	{
		final int PRIME = 59;
		int result = 1;
		final Object $id = this.getId();
		result = result * PRIME + ($id == null ? 43 : $id.hashCode());
		final Object $person = this.getPerson();
		result = result * PRIME + ($person == null ? 43 : $person.hashCode());
		final Object $subOrdinates = this.getSubOrdinates();
		result = result * PRIME + ($subOrdinates == null ? 43 : $subOrdinates.hashCode());
		return result;
	}

	public String toString()
	{
		return "Employee(id=" + this.getId() + ", person=" + this.getPerson() + ", subOrdinates="
			+ this.getSubOrdinates() + ")";
	}

	public EmployeeBuilder<?, ?> toBuilder()
	{
		return new EmployeeBuilderImpl().$fillValuesFrom(this);
	}

	public static abstract class EmployeeBuilder<C extends Employee, B extends EmployeeBuilder<C, B>>
	{
		private String id;
		private Person person;
		private ArrayList<Employee> subOrdinates;

		private static void $fillValuesFromInstanceIntoBuilder(Employee instance,
			EmployeeBuilder<?, ?> b)
		{
			b.id(instance.id);
			b.person(instance.person);
			b.subOrdinates(instance.subOrdinates == null
				? java.util.Collections.emptySet()
				: instance.subOrdinates);
		}

		public B id(String id)
		{
			this.id = id;
			return self();
		}

		public B person(Person person)
		{
			this.person = person;
			return self();
		}

		public B subOrdinate(Employee subOrdinate)
		{
			if (this.subOrdinates == null)
				this.subOrdinates = new ArrayList<Employee>();
			this.subOrdinates.add(subOrdinate);
			return self();
		}

		public B subOrdinates(Collection<? extends Employee> subOrdinates)
		{
			if (this.subOrdinates == null)
				this.subOrdinates = new ArrayList<Employee>();
			this.subOrdinates.addAll(subOrdinates);
			return self();
		}

		public B clearSubOrdinates()
		{
			if (this.subOrdinates != null)
				this.subOrdinates.clear();
			return self();
		}

		protected B $fillValuesFrom(C instance)
		{
			EmployeeBuilder.$fillValuesFromInstanceIntoBuilder(instance, this);
			return self();
		}

		protected abstract B self();

		public abstract C build();

		public String toString()
		{
			return "Employee.EmployeeBuilder(id=" + this.id + ", person=" + this.person
				+ ", subOrdinates=" + this.subOrdinates + ")";
		}
	}

	private static final class EmployeeBuilderImpl
		extends
			EmployeeBuilder<Employee, EmployeeBuilderImpl>
	{
		private EmployeeBuilderImpl()
		{
		}

		protected EmployeeBuilderImpl self()
		{
			return this;
		}

		public Employee build()
		{
			return new Employee(this);
		}
	}
}
