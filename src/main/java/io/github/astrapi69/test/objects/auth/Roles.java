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
package io.github.astrapi69.test.objects.auth;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * The class {@link Roles} is a class intended for use in unit tests.
 */
public class Roles
{
	/**
	 * The roles.
	 */
	private Set<Role> roles;


	public Roles()
	{
	}

	public Roles(final Set<Role> roles)
	{
		this.roles = roles;
	}

	public static RolesBuilder builder()
	{
		return new RolesBuilder();
	}

	protected boolean canEqual(final Object other)
	{
		return other instanceof Roles;
	}

	@Override
	public boolean equals(final Object o)
	{
		if (o == this)
			return true;
		if (!(o instanceof Roles))
			return false;
		final Roles other = (Roles)o;
		if (!other.canEqual(this))
			return false;
		final Object this$roles = this.getRoles();
		final Object other$roles = other.getRoles();
		if (this$roles == null ? other$roles != null : !this$roles.equals(other$roles))
			return false;
		return true;
	}

	public Set<Role> getRoles()
	{
		return this.roles;
	}

	public Roles setRoles(final Set<Role> roles)
	{
		this.roles = roles;
		return this;
	}

	@Override
	public int hashCode()
	{
		final int PRIME = 59;
		int result = 1;
		final Object $roles = this.getRoles();
		result = result * PRIME + ($roles == null ? 43 : $roles.hashCode());
		return result;
	}

	public RolesBuilder toBuilder()
	{
		final RolesBuilder builder = new RolesBuilder();
		if (this.roles != null)
			builder.roles(this.roles);
		return builder;
	}

	@Override
	public String toString()
	{
		return "Roles(roles=" + this.getRoles() + ")";
	}

	public static class RolesBuilder
	{

		private ArrayList<Role> roles;

		RolesBuilder()
		{
		}

		public Roles build()
		{
			Set<Role> roles;
			switch (this.roles == null ? 0 : this.roles.size())
			{
				case 0 :
					roles = Collections.emptySet();
					break;

				case 1 :
					roles = Collections.singleton(this.roles.get(0));
					break;

				default :
					roles = new LinkedHashSet<Role>(this.roles.size() < 1073741824
						? 1 + this.roles.size() + (this.roles.size() - 3) / 3
						: Integer.MAX_VALUE);
					roles.addAll(this.roles);
					roles = Collections.unmodifiableSet(roles);
			}
			return new Roles(roles);
		}

		public RolesBuilder clearRoles()
		{
			if (this.roles != null)
				this.roles.clear();
			return this;
		}

		public RolesBuilder role(final Role role)
		{
			if (this.roles == null)
				this.roles = new ArrayList<Role>();
			this.roles.add(role);
			return this;
		}

		public RolesBuilder roles(final Collection<? extends Role> roles)
		{
			if (this.roles == null)
				this.roles = new ArrayList<Role>();
			this.roles.addAll(roles);
			return this;
		}

		@Override
		public String toString()
		{
			return "Roles.RolesBuilder(roles=" + this.roles + ")";
		}
	}
}
