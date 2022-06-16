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
package io.github.astrapi69.test.object.factory;

import java.util.ArrayList;
import java.util.List;

import io.github.astrapi69.test.object.Club;
import io.github.astrapi69.test.object.Employee;
import io.github.astrapi69.test.object.Factory;
import io.github.astrapi69.test.object.Member;
import io.github.astrapi69.test.object.Person;
import io.github.astrapi69.test.object.enumtype.Gender;

public class TestObjectFactory
{

	public static Club newClub()
	{
		List members = new ArrayList<Member>();

		members.add(Member.builder().name("Lea").gender(Gender.FEMALE).married(Boolean.FALSE)
			.nickname("princess").build());

		members.add(Member.builder().name("Luke").gender(Gender.MALE).married(Boolean.FALSE)
			.nickname("wannabejedi").build());

		Club club = new Club();
		club.setMembers(members);
		club.setLocation("Greece/Katerini");
		club.setName("StarPiece");
		return club;
	}

	public static Factory newFactory()
	{
		List employees = new ArrayList<Employee>();

		Employee employee1 = Employee.builder().id("1")
			.person(
				Person.builder().name("Lea").gender(Gender.FEMALE).married(Boolean.FALSE).build())
			.build();

		employees.add(employee1);

		Employee employee2 = new Employee();
		Employee.builder().id("2")
			.person(
				Person.builder().name("Luke").gender(Gender.MALE).married(Boolean.FALSE).build())
			.build();

		employees.add(employee2);

		Factory company = new Factory();
		company.setEmployees(employees);
		company.setLocation("Greece/Katerini");
		company.setName("StarPiece");
		return company;
	}
}
