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
package de.alpharogroup.test.objects.auth;

import java.util.Set;

/**
 * The class {@link Role} is a class intended for use in unit tests.
 */
public class Role
{

	private String description;

	private Set<AccessRight> rights;

	public static class RoleBuilder
	{

		private String description;

		private Set<AccessRight> rights;

		RoleBuilder()
		{
		}

		public RoleBuilder description(final String description)
		{
			this.description = description;
			return this;
		}

		public RoleBuilder rights(final Set<AccessRight> rights)
		{
			this.rights = rights;
			return this;
		}

		public Role build()
		{
			return new Role(description, rights);
		}

		@Override
		public String toString()
		{
			return "Role.RoleBuilder(description=" + this.description + ", rights=" + this.rights
				+ ")";
		}
	}

	public static RoleBuilder builder()
	{
		return new RoleBuilder();
	}

	public RoleBuilder toBuilder()
	{
		return new RoleBuilder().description(this.description).rights(this.rights);
	}

	public String getDescription()
	{
		return this.description;
	}

	public Set<AccessRight> getRights()
	{
		return this.rights;
	}

	public Role setDescription(final String description)
	{
		this.description = description;
		return this;
	}

	public Role setRights(final Set<AccessRight> rights)
	{
		this.rights = rights;
		return this;
	}

	@Override
	public boolean equals(final Object o)
	{
		if (o == this)
			return true;
		if (!(o instanceof Role))
			return false;
		final Role other = (Role)o;
		if (!other.canEqual((Object)this))
			return false;
		final Object this$description = this.getDescription();
		final Object other$description = other.getDescription();
		if (this$description == null
			? other$description != null
			: !this$description.equals(other$description))
			return false;
		final Object this$rights = this.getRights();
		final Object other$rights = other.getRights();
		if (this$rights == null ? other$rights != null : !this$rights.equals(other$rights))
			return false;
		return true;
	}

	protected boolean canEqual(final Object other)
	{
		return other instanceof Role;
	}

	@Override
	public int hashCode()
	{
		final int PRIME = 59;
		int result = 1;
		final Object $description = this.getDescription();
		result = result * PRIME + ($description == null ? 43 : $description.hashCode());
		final Object $rights = this.getRights();
		result = result * PRIME + ($rights == null ? 43 : $rights.hashCode());
		return result;
	}

	@Override
	public String toString()
	{
		return "Role(description=" + this.getDescription() + ", rights=" + this.getRights() + ")";
	}

	public Role()
	{
	}

	public Role(final String description, final Set<AccessRight> rights)
	{
		this.description = description;
		this.rights = rights;
	}
}
