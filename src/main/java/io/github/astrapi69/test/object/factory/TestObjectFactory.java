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

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import io.github.astrapi69.test.object.A;
import io.github.astrapi69.test.object.AlgorithmModel;
import io.github.astrapi69.test.object.ApplicationTestModel;
import io.github.astrapi69.test.object.ClonableObject;
import io.github.astrapi69.test.object.Club;
import io.github.astrapi69.test.object.Company;
import io.github.astrapi69.test.object.CompanyGroup;
import io.github.astrapi69.test.object.Customer;
import io.github.astrapi69.test.object.Employee;
import io.github.astrapi69.test.object.EmployeeList;
import io.github.astrapi69.test.object.Factory;
import io.github.astrapi69.test.object.Light;
import io.github.astrapi69.test.object.Member;
import io.github.astrapi69.test.object.NotSerializable;
import io.github.astrapi69.test.object.Permission;
import io.github.astrapi69.test.object.Person;
import io.github.astrapi69.test.object.PremiumMember;
import io.github.astrapi69.test.object.PrimitiveArrays;
import io.github.astrapi69.test.object.PrimitiveObjectClassArrays;
import io.github.astrapi69.test.object.SingletonBean;
import io.github.astrapi69.test.object.Television;
import io.github.astrapi69.test.object.enumeration.Brand;
import io.github.astrapi69.test.object.enumeration.Gender;

public class TestObjectFactory
{

	public static A newA()
	{
		return A.builder().a("a").build();
	}

	public static AlgorithmModel newAlgorithmModel()
	{
		return AlgorithmModel.builder().a(1).b(2).build();
	}

	public static <T> ApplicationTestModel<T> newApplicationTestModel(T model)
	{
		return ApplicationTestModel.<T> builder().model(model).build();
	}

	public static ClonableObject newClonableObject()
	{
		return ClonableObject.builder().name("me").build();
	}

	public static Club newClub()
	{
		return Club.builder()
			.member(Member.buildMember().name("Lea").gender(Gender.FEMALE).married(Boolean.FALSE)
				.nickname("princess").build())
			.member(Member.buildMember().name("Luke").gender(Gender.MALE).married(Boolean.FALSE)
				.nickname("wannabejedi").build())
			.name("StarPiece").location("Greece/Katerini").build();
	}

	public static Company newCompany()
	{
		return Company.builder().name("factory-forte").location("Earth").build();
	}

	public static CompanyGroup newCompanyGroup()
	{
		Set<Company> children = new HashSet<>();
		children.add(Company.builder().name("factory-Mars").location("Jupiter").build());
		return CompanyGroup.builder().parent(newFactory()).children(children).build();
	}

	public static Customer newCustomer()
	{
		return Customer.builder().name("charlie").car(Brand.FERRARI).premium(true).build();
	}

	public static Employee newEmployee()
	{
		return Employee.builder().id("1")
			.person(
				Person.builder().name("Lea").gender(Gender.FEMALE).married(Boolean.FALSE).build())
			.build();
	}

	public static EmployeeList newEmployeeList()
	{
		return EmployeeList.builder().employee(newEmployee())
			.employee(Employee.builder().id("2").person(
				Person.builder().name("Luke").gender(Gender.MALE).married(Boolean.FALSE).build())
				.build())
			.build();
	}

	public static Factory newFactory()
	{
		return Factory.builder().employee(newEmployee())
			.employee(Employee.builder().id("2").person(
				Person.builder().name("Luke").gender(Gender.MALE).married(Boolean.FALSE).build())
				.build())
			.name("StarPiece").location("Greece/Katerini").build();
	}

	public static Light newLight()
	{
		return Light.builder().on(true).build();
	}

	public static Member newMember()
	{
		Date dateofbirth = Date
			.from(LocalDate.of(1979, 2, 24).atStartOfDay(ZoneId.of("Europe/Berlin")).toInstant());
		Date dateofMarriage = Date
			.from(LocalDate.of(2017, 8, 8).atStartOfDay(ZoneId.of("Europe/Berlin")).toInstant());
		return Member.buildMember().dateofbirth(dateofbirth).dateofMarriage(dateofMarriage)
			.gender(Gender.MALE).name("Avano").married(true).about("I'm a silly and ill.")
			.nickname("idiot").build();
	}

	public static NotSerializable newNotSerializable()
	{
		return NotSerializable.builder().name("Foo").build();
	}

	public static Permission newPermission()
	{
		return Permission.builder().name("read").description("Can read files").shortcut("r")
			.build();
	}

	public static Person newPerson()
	{
		return Person.builder().gender(Gender.FEMALE).name("Anna").married(false)
			.about("I'm a beast and beautiful").nickname("beast").build();
	}

	public static PremiumMember newPremiumMember()
	{
		Date dateofbirth = Date
			.from(LocalDate.of(1979, 2, 24).atStartOfDay(ZoneId.of("Europe/Berlin")).toInstant());
		Date dateofMarriage = Date
			.from(LocalDate.of(2017, 8, 8).atStartOfDay(ZoneId.of("Europe/Berlin")).toInstant());
		return PremiumMember.buildPremiumMember().dateofbirth(dateofbirth)
			.dateofMarriage(dateofMarriage).gender(Gender.MALE).name("Avano").married(true)
			.about("I'm a silly and ill.").nickname("idiot").credits("-10000000000,-Diamonds")
			.build();
	}

	public static PrimitiveArrays newPrimitiveArrays()
	{
		return PrimitiveArrays.builder().booleanArray(new boolean[] { true, false, false })
			.byteArray(new byte[] { 2, 4, 5 }).charArray(new char[] { 'a', 'c', 'd' })
			.shortArray(new short[] { 1, 3, 6 }).intArray(new int[] { 7, 8, 0 })
			.longArray(new long[] { 9L, 10L, 11L }).floatArray(new float[] { 12.1f, 14.3f, 15.6f })
			.doubleArray(new double[] { 17.3d, 19.6d, 21.0d }).build();
	}

	public static PrimitiveObjectClassArrays newPrimitiveObjectClassArrays()
	{
		return PrimitiveObjectClassArrays.builder()
			.booleanArray(new Boolean[] { true, false, false }).byteArray(new Byte[] { 2, 4, 5 })
			.charArray(new Character[] { 'a', 'c', 'd' }).shortArray(new Short[] { 1, 3, 6 })
			.intArray(new Integer[] { 7, 8, 0 }).longArray(new Long[] { 9L, 10L, 11L })
			.floatArray(new Float[] { 12.1f, 14.3f, 15.6f })
			.doubleArray(new Double[] { 17.3d, 19.6d, 21.0d }).build();
	}

	public static SingletonBean newSingletonBean()
	{
		return SingletonBean.getInstance();
	}

	public static Television newTelevision()
	{
		return Television.builder().on(true).channel(1).build();
	}

	public static Map<String, Object> getAllTestObjectsInMap()
	{
		Map<String, Object> allTestObjects = new LinkedHashMap<>();
		for (Object object : getAllTestObjects())
		{
			String name = object.getClass().getCanonicalName();
			allTestObjects.put(name, object);
		}
		return allTestObjects;
	}

	public static List<Object> getAllTestObjects()
	{
		List<Object> allTestObjects = new ArrayList<>();
		allTestObjects.add(newA());
		allTestObjects.add(newAlgorithmModel());
		allTestObjects.add(newApplicationTestModel(newA()));
		allTestObjects.add(newClonableObject());
		allTestObjects.add(newClub());
		allTestObjects.add(newCompany());
		allTestObjects.add(newCompanyGroup());
		allTestObjects.add(newCustomer());
		allTestObjects.add(newEmployee());
		allTestObjects.add(newEmployeeList());
		allTestObjects.add(newFactory());
		allTestObjects.add(newLight());
		allTestObjects.add(newMember());
		allTestObjects.add(newNotSerializable());
		allTestObjects.add(newPermission());
		allTestObjects.add(newPerson());
		allTestObjects.add(newPremiumMember());
		allTestObjects.add(newPrimitiveArrays());
		allTestObjects.add(newPrimitiveObjectClassArrays());
		allTestObjects.add(newSingletonBean().setPerson(newPerson()));
		allTestObjects.add(newTelevision());
		allTestObjects.add(TestAuthFactory.newAccessRight());
		allTestObjects.add(TestAuthFactory.newRole());
		allTestObjects.add(TestAuthFactory.newRoles());
		allTestObjects.add(TestAuthFactory.newSignin());
		return allTestObjects;
	}

}
