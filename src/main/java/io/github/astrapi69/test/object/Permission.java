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

/**
 * The class {@link Permission} is a class intended for use in unit tests.
 */
public class Permission
{
	/**
	 * The description.
	 */
	private String description;
	/**
	 * The name.
	 */
	private String name;
	/**
	 * The shortcut.
	 */
	private String shortcut;

	public Permission()
	{
	}

	public Permission(final String description, final String name, final String shortcut)
	{
		this.description = description;
		this.name = name;
		this.shortcut = shortcut;
	}

	public static PermissionBuilder builder()
	{
		return new PermissionBuilder();
	}

	protected boolean canEqual(final Object other)
	{
		return other instanceof Permission;
	}

	@Override
	public boolean equals(final Object o)
	{
		if (o == this)
			return true;
		if (!(o instanceof Permission))
			return false;
		final Permission other = (Permission)o;
		if (!other.canEqual(this))
			return false;
		final Object this$description = this.getDescription();
		final Object other$description = other.getDescription();
		if (this$description == null
			? other$description != null
			: !this$description.equals(other$description))
			return false;
		final Object this$name = this.getName();
		final Object other$name = other.getName();
		if (this$name == null ? other$name != null : !this$name.equals(other$name))
			return false;
		final Object this$shortcut = this.getShortcut();
		final Object other$shortcut = other.getShortcut();
		return this$shortcut == null
			? other$shortcut == null
			: this$shortcut.equals(other$shortcut);
	}

	public String getDescription()
	{
		return this.description;
	}

	public Permission setDescription(final String description)
	{
		this.description = description;
		return this;
	}

	public String getName()
	{
		return this.name;
	}

	public Permission setName(final String name)
	{
		this.name = name;
		return this;
	}

	public String getShortcut()
	{
		return this.shortcut;
	}

	public Permission setShortcut(final String shortcut)
	{
		this.shortcut = shortcut;
		return this;
	}

	@Override
	public int hashCode()
	{
		final int PRIME = 59;
		int result = 1;
		final Object $description = this.getDescription();
		result = result * PRIME + ($description == null ? 43 : $description.hashCode());
		final Object $name = this.getName();
		result = result * PRIME + ($name == null ? 43 : $name.hashCode());
		final Object $shortcut = this.getShortcut();
		result = result * PRIME + ($shortcut == null ? 43 : $shortcut.hashCode());
		return result;
	}

	public PermissionBuilder toBuilder()
	{
		return new PermissionBuilder().description(this.description).name(this.name)
			.shortcut(this.shortcut);
	}

	@Override
	public String toString()
	{
		return "Permission(description=" + this.getDescription() + ", name=" + this.getName()
			+ ", shortcut=" + this.getShortcut() + ")";
	}

	public static class PermissionBuilder
	{

		private String description;

		private String name;

		private String shortcut;

		PermissionBuilder()
		{
		}

		public Permission build()
		{
			return new Permission(description, name, shortcut);
		}

		public PermissionBuilder description(final String description)
		{
			this.description = description;
			return this;
		}

		public PermissionBuilder name(final String name)
		{
			this.name = name;
			return this;
		}

		public PermissionBuilder shortcut(final String shortcut)
		{
			this.shortcut = shortcut;
			return this;
		}

		@Override
		public String toString()
		{
			return "Permission.PermissionBuilder(description=" + this.description + ", name="
				+ this.name + ", shortcut=" + this.shortcut + ")";
		}
	}
}
