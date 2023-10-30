/**
 * The MIT License
 * <p>
 * Copyright (C) 2015 Asterios Raptis
 * <p>
 * Permission is hereby granted, free of charge, to any person obtaining
 * a copy of this software and associated documentation files (the
 * "Software"), to deal in the Software without restriction, including
 * without limitation the rights to use, copy, modify, merge, publish,
 * distribute, sublicense, and/or sell copies of the Software, and to
 * permit persons to whom the Software is furnished to do so, subject to
 * the following conditions:
 * <p>
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 * <p>
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
 * MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE
 * LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION
 * OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION
 * WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package io.github.astrapi69.test.object.auth;

/**
 * The class {@link AccessRight} is a class intended for use in unit tests.
 */
public class AccessRight
{

	private String description;

	public AccessRight()
	{
	}

	public AccessRight(final String description)
	{
		this.description = description;
	}

	public static AccessRightBuilder builder()
	{
		return new AccessRightBuilder();
	}

	protected boolean canEqual(final Object other)
	{
		return other instanceof AccessRight;
	}

	@Override
	public boolean equals(final Object o)
	{
		if (o == this)
			return true;
		if (!(o instanceof AccessRight))
			return false;
		final AccessRight other = (AccessRight)o;
		if (!other.canEqual(this))
			return false;
		final Object this$description = this.getDescription();
		final Object other$description = other.getDescription();
		return this$description == null
			? other$description == null
			: this$description.equals(other$description);
	}

	public String getDescription()
	{
		return this.description;
	}

	public AccessRight setDescription(final String description)
	{
		this.description = description;
		return this;
	}

	@Override
	public int hashCode()
	{
		final int PRIME = 59;
		int result = 1;
		final Object $description = this.getDescription();
		result = result * PRIME + ($description == null ? 43 : $description.hashCode());
		return result;
	}

	public AccessRightBuilder toBuilder()
	{
		return new AccessRightBuilder().description(this.description);
	}

	@Override
	public String toString()
	{
		return "AccessRight(description=" + this.getDescription() + ")";
	}

	public static class AccessRightBuilder
	{

		private String description;

		AccessRightBuilder()
		{
		}

		public AccessRight build()
		{
			return new AccessRight(description);
		}

		public AccessRightBuilder description(final String description)
		{
			this.description = description;
			return this;
		}

		@Override
		public String toString()
		{
			return "AccessRight.AccessRightBuilder(description=" + this.description + ")";
		}
	}
}
