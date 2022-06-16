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

import java.util.List;
/**
 * The class {@link Club} is a class intended for use in unit tests.
 */
public class Club
{
	private List<Member> members;
	private String name;
	private String location;

	public Club()
	{
	}

	public Club(String name)
	{
		this.name = name;
	}

	public Club(String name, String location)
	{
		this.name = name;
		this.location = location;
	}

	protected Club(ClubBuilder<?, ?> b)
	{
		this.members = b.members;
		this.name = b.name;
		this.location = b.location;
	}

	public static ClubBuilder<?, ?> builder()
	{
		return new ClubBuilderImpl();
	}

	public List<Member> getMembers()
	{
		return this.members;
	}

	public String getName()
	{
		return this.name;
	}

	public String getLocation()
	{
		return this.location;
	}

	public void setMembers(List<Member> members)
	{
		this.members = members;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public void setLocation(String location)
	{
		this.location = location;
	}

	public boolean equals(final Object o)
	{
		if (o == this)
			return true;
		if (!(o instanceof Club))
			return false;
		final Club other = (Club)o;
		if (!other.canEqual((Object)this))
			return false;
		final Object this$members = this.getMembers();
		final Object other$members = other.getMembers();
		if (this$members == null ? other$members != null : !this$members.equals(other$members))
			return false;
		final Object this$name = this.getName();
		final Object other$name = other.getName();
		if (this$name == null ? other$name != null : !this$name.equals(other$name))
			return false;
		final Object this$location = this.getLocation();
		final Object other$location = other.getLocation();
		if (this$location == null ? other$location != null : !this$location.equals(other$location))
			return false;
		return true;
	}

	protected boolean canEqual(final Object other)
	{
		return other instanceof Club;
	}

	public int hashCode()
	{
		final int PRIME = 59;
		int result = 1;
		final Object $members = this.getMembers();
		result = result * PRIME + ($members == null ? 43 : $members.hashCode());
		final Object $name = this.getName();
		result = result * PRIME + ($name == null ? 43 : $name.hashCode());
		final Object $location = this.getLocation();
		result = result * PRIME + ($location == null ? 43 : $location.hashCode());
		return result;
	}

	public String toString()
	{
		return "Club(members=" + this.getMembers() + ", name=" + this.getName() + ", location="
			+ this.getLocation() + ")";
	}

	public ClubBuilder<?, ?> toBuilder()
	{
		return new ClubBuilderImpl().$fillValuesFrom(this);
	}

	public static abstract class ClubBuilder<C extends Club, B extends ClubBuilder<C, B>>
	{
		private List<Member> members;
		private String name;
		private String location;

		private static void $fillValuesFromInstanceIntoBuilder(Club instance, ClubBuilder<?, ?> b)
		{
			b.members(instance.members);
			b.name(instance.name);
			b.location(instance.location);
		}

		public B members(List<Member> members)
		{
			this.members = members;
			return self();
		}

		public B name(String name)
		{
			this.name = name;
			return self();
		}

		public B location(String location)
		{
			this.location = location;
			return self();
		}

		protected B $fillValuesFrom(C instance)
		{
			ClubBuilder.$fillValuesFromInstanceIntoBuilder(instance, this);
			return self();
		}

		protected abstract B self();

		public abstract C build();

		public String toString()
		{
			return "Club.ClubBuilder(members=" + this.members + ", name=" + this.name
				+ ", location=" + this.location + ")";
		}
	}

	private static final class ClubBuilderImpl extends ClubBuilder<Club, ClubBuilderImpl>
	{
		private ClubBuilderImpl()
		{
		}

		protected ClubBuilderImpl self()
		{
			return this;
		}

		public Club build()
		{
			return new Club(this);
		}
	}
}
