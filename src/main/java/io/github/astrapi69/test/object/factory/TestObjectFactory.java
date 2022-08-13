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
		return Club.builder()
			.member(Member.buildMember().name("Lea").gender(Gender.FEMALE).married(Boolean.FALSE)
				.nickname("princess").build())
			.member(Member.buildMember().name("Luke").gender(Gender.MALE).married(Boolean.FALSE)
				.nickname("wannabejedi").build())
			.name("StarPiece").location("Greece/Katerini").build();
	}

	public static Factory newFactory()
	{
		return Factory.builder()
			.employee(Employee.builder().id("1")
				.person(Person.builder().name("Lea").gender(Gender.FEMALE).married(Boolean.FALSE)
					.build())
				.build())
			.employee(Employee.builder().id("2").person(
				Person.builder().name("Luke").gender(Gender.MALE).married(Boolean.FALSE).build())
				.build())
			.name("StarPiece").location("Greece/Katerini").build();
	}
}
