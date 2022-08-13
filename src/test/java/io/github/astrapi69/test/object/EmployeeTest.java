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

import static org.testng.AssertJUnit.assertNotNull;

import org.meanbean.test.BeanTester;
import org.testng.annotations.Test;

import io.github.astrapi69.evaluate.object.verifier.ContractVerifier;

import java.util.HashSet;

/**
 * The unit test class for the class {@link Employee}.
 */
public class EmployeeTest
{

	/**
	 * Test method for {@link Employee} constructors
	 */
	@Test
	public final void testConstructors()
	{
		Employee model = new Employee();
		assertNotNull(model);
		model = new Employee("1", Person.builder().build(), new HashSet<>());
		assertNotNull(model);
		model = Employee.builder().build();
		assertNotNull(model);
	}

	/**
	 * Test method for {@link Employee}
	 */
	@Test
	public void testWithBeanTester()
	{
		final BeanTester beanTester = new BeanTester();
		beanTester.testBean(Employee.class);
	}

	/**
	 * Test method for {@link Employee#equals(Object)} , {@link Employee#hashCode()} and
	 * {@link Employee#toString()}
	 */
	@Test
	public void verifyEqualsHashcodeAndToStringContracts()
	{
		ContractVerifier.of(Employee.class).verify();
	}
}
