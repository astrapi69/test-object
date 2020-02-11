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

import java.io.Serializable;

/**
 * The class {@link Employee} is a class intended for use in unit tests.
 */
public class Employee implements Serializable
{
	public static class EmployeeBuilder
	{

		private String id;

		private Person person;

		EmployeeBuilder()
		{
		}

		public Employee build()
		{
			return new Employee(id, person);
		}

		public EmployeeBuilder id(final String id)
		{
			this.id = id;
			return this;
		}

		public EmployeeBuilder person(final Person person)
		{
			this.person = person;
			return this;
		}

		@Override
		public String toString()
		{
			return "Employee.EmployeeBuilder(id=" + this.id + ", person=" + this.person + ")";
		}
	}
	/**
	 * The serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	public static EmployeeBuilder builder()
	{
		return new EmployeeBuilder();
	}

	/**
	 * The id.
	 */
	private String id;

	/**
	 * The person.
	 */
	private Person person;

	public Employee()
	{
	}

	public Employee(final String id, final Person person)
	{
		this.id = id;
		this.person = person;
	}

	protected boolean canEqual(final Object other)
	{
		return other instanceof Employee;
	}

	@Override
	public boolean equals(final Object o)
	{
		if (o == this)
			return true;
		if (!(o instanceof Employee))
			return false;
		final Employee other = (Employee)o;
		if (!other.canEqual(this))
			return false;
		final Object this$id = this.getId();
		final Object other$id = other.getId();
		if (this$id == null ? other$id != null : !this$id.equals(other$id))
			return false;
		final Object this$person = this.getPerson();
		final Object other$person = other.getPerson();
		if (this$person == null ? other$person != null : !this$person.equals(other$person))
			return false;
		return true;
	}

	public String getId()
	{
		return this.id;
	}

	public Person getPerson()
	{
		return this.person;
	}

	@Override
	public int hashCode()
	{
		final int PRIME = 59;
		int result = 1;
		final Object $id = this.getId();
		result = result * PRIME + ($id == null ? 43 : $id.hashCode());
		final Object $person = this.getPerson();
		result = result * PRIME + ($person == null ? 43 : $person.hashCode());
		return result;
	}

	public Employee setId(final String id)
	{
		this.id = id;
		return this;
	}

	public Employee setPerson(final Person person)
	{
		this.person = person;
		return this;
	}

	public EmployeeBuilder toBuilder()
	{
		return new EmployeeBuilder().id(this.id).person(this.person);
	}

	@Override
	public String toString()
	{
		return "Employee(id=" + this.getId() + ", person=" + this.getPerson() + ")";
	}
}
