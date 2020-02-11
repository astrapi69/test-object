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

import java.util.*;

/**
 * The class {@link EmployeeList} encapsulates a list of {@link Employee}.
 */
public class EmployeeList
{
	/**
	 * The employees.
	 */
	private List<Employee> employees;

	public static class EmployeeListBuilder
	{

		private ArrayList<Employee> employees;

		EmployeeListBuilder()
		{
		}

		public EmployeeListBuilder employee(final Employee employee)
		{
			if (this.employees == null)
				this.employees = new ArrayList<Employee>();
			this.employees.add(employee);
			return this;
		}

		public EmployeeListBuilder employees(
			final Collection<? extends Employee> employees)
		{
			if (this.employees == null)
				this.employees = new ArrayList<Employee>();
			this.employees.addAll(employees);
			return this;
		}

		public EmployeeListBuilder clearEmployees()
		{
			if (this.employees != null)
				this.employees.clear();
			return this;
		}

		public EmployeeList build()
		{
			List<Employee> employees;
			switch (this.employees == null ? 0 : this.employees.size())
			{
				case 0 :
					employees = Collections.emptyList();
					break;

				case 1 :
					employees = Collections.singletonList(this.employees.get(0));
					break;

				default :
					employees = Collections
						.unmodifiableList(new ArrayList<Employee>(this.employees));
			}
			return new EmployeeList(employees);
		}

		@Override
		public String toString()
		{
			return "EmployeeList.EmployeeListBuilder(employees=" + this.employees + ")";
		}
	}

	public static EmployeeListBuilder builder()
	{
		return new EmployeeListBuilder();
	}

	public EmployeeListBuilder toBuilder()
	{
		final EmployeeListBuilder builder = new EmployeeListBuilder();
		if (this.employees != null)
			builder.employees(this.employees);
		return builder;
	}

	public List<Employee> getEmployees()
	{
		return this.employees;
	}

	public EmployeeList setEmployees(final List<Employee> employees)
	{
		this.employees = employees;
		return this;
	}

	@Override
	public boolean equals(final Object o)
	{
		if (o == this)
			return true;
		if (!(o instanceof EmployeeList))
			return false;
		final EmployeeList other = (EmployeeList)o;
		if (!other.canEqual((Object)this))
			return false;
		final Object this$employees = this.getEmployees();
		final Object other$employees = other.getEmployees();
		if (this$employees == null
			? other$employees != null
			: !this$employees.equals(other$employees))
			return false;
		return true;
	}

	protected boolean canEqual(final Object other)
	{
		return other instanceof EmployeeList;
	}

	@Override
	public int hashCode()
	{
		final int PRIME = 59;
		int result = 1;
		final Object $employees = this.getEmployees();
		result = result * PRIME + ($employees == null ? 43 : $employees.hashCode());
		return result;
	}

	@Override
	public String toString()
	{
		return "EmployeeList(employees=" + this.getEmployees() + ")";
	}

	public EmployeeList()
	{
	}

	public EmployeeList(final List<Employee> employees)
	{
		this.employees = employees;
	}
}