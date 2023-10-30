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

import java.util.HashSet;
import java.util.Set;

import io.github.astrapi69.test.object.auth.AccessRight;
import io.github.astrapi69.test.object.auth.Role;
import io.github.astrapi69.test.object.auth.Roles;
import io.github.astrapi69.test.object.auth.Signin;

/**
 * The class {@link TestAuthFactory} generates classes in the auth package
 */
public final class TestAuthFactory
{
	private TestAuthFactory()
	{
	}

	/**
	 * Factory method for create a new {@link AccessRight} object
	 *
	 * @return the new created {@link AccessRight} object
	 */
	public static AccessRight newAccessRight()
	{
		return AccessRight.builder().description("write").build();
	}

	/**
	 * Factory method for create a new {@link Role} object
	 *
	 * @return the new created {@link Role} object
	 */
	public static Role newRole()
	{
		Set<AccessRight> rights = new HashSet<>();
		rights.add(newAccessRight());
		return Role.builder().description("print").rights(rights).build();
	}

	/**
	 * Factory method for create a new {@link Roles} object
	 *
	 * @return the new created {@link Roles} object
	 */
	public static Roles newRoles()
	{
		Set<Role> roles = new HashSet<>();
		roles.add(newRole());
		return Roles.builder().roles(roles).build();
	}

	/**
	 * Factory method for create a new {@link Signin} object
	 *
	 * @return the new created {@link Signin} object
	 */
	public static Signin newSignin()
	{
		return Signin.builder().username("author").password("secret").build();
	}

}
