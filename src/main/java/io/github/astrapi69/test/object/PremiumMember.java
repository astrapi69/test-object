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
package io.github.astrapi69.test.object;

import java.util.Date;

import io.github.astrapi69.test.object.enumeration.Gender;

/**
 * The class {@link PremiumMember} is a class intended for use in unit tests.
 */
public class PremiumMember extends Member
{
	/**
	 * The Constant serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * The credits.
	 */
	private String credits;

	/**
	 * Instantiates a new {@link PremiumMember} object.
	 */
	public PremiumMember()
	{
	}

	/**
	 * Instantiates a new {@link PremiumMember} object with the given parameters.
	 *
	 * @param about
	 *            the about
	 * @param gender
	 *            the gender
	 * @param married
	 *            the married
	 * @param name
	 *            the name
	 * @param nickname
	 *            the nickname
	 * @param dateofbirth
	 *            the dateofbirth
	 * @param dateofMarriage
	 *            the dateof marriage
	 * @param credits
	 *            the credits
	 */
	public PremiumMember(final String about, final Gender gender, final Boolean married,
		final String name, final String nickname, final Date dateofbirth, final Date dateofMarriage,
		final String credits)
	{
		super(about, gender, married, name, nickname, dateofbirth, dateofMarriage);
		this.credits = credits;
	}

	public static PremiumMemberBuilder buildPremiumMember()
	{
		return new PremiumMemberBuilder();
	}

	@Override
	protected boolean canEqual(final Object other)
	{
		return other instanceof PremiumMember;
	}

	@Override
	public boolean equals(final Object o)
	{
		if (o == this)
			return true;
		if (!(o instanceof PremiumMember))
			return false;
		final PremiumMember other = (PremiumMember)o;
		if (!other.canEqual(this))
			return false;
		if (!super.equals(o))
			return false;
		final Object this$credits = this.getCredits();
		final Object other$credits = other.getCredits();
		return this$credits == null ? other$credits == null : this$credits.equals(other$credits);
	}

	public String getCredits()
	{
		return this.credits;
	}

	public PremiumMember setCredits(final String credits)
	{
		this.credits = credits;
		return this;
	}

	@Override
	public int hashCode()
	{
		final int PRIME = 59;
		int result = super.hashCode();
		final Object $credits = this.getCredits();
		result = result * PRIME + ($credits == null ? 43 : $credits.hashCode());
		return result;
	}

	@Override
	public String toString()
	{
		return "PremiumMember(super=" + super.toString() + ", credits=" + this.getCredits() + ")";
	}

	public static class PremiumMemberBuilder
	{

		private String about;

		private String credits;

		private Date dateofbirth;

		private Date dateofMarriage;

		private Gender gender;

		private Boolean married;

		private String name;

		private String nickname;

		PremiumMemberBuilder()
		{
		}

		public PremiumMemberBuilder about(final String about)
		{
			this.about = about;
			return this;
		}

		public PremiumMember build()
		{
			return new PremiumMember(about, gender, married, name, nickname, dateofbirth,
				dateofMarriage, credits);
		}

		public PremiumMemberBuilder credits(final String credits)
		{
			this.credits = credits;
			return this;
		}

		public PremiumMemberBuilder dateofbirth(final Date dateofbirth)
		{
			this.dateofbirth = dateofbirth;
			return this;
		}

		public PremiumMemberBuilder dateofMarriage(final Date dateofMarriage)
		{
			this.dateofMarriage = dateofMarriage;
			return this;
		}

		public PremiumMemberBuilder gender(final Gender gender)
		{
			this.gender = gender;
			return this;
		}

		public PremiumMemberBuilder married(final Boolean married)
		{
			this.married = married;
			return this;
		}

		public PremiumMemberBuilder name(final String name)
		{
			this.name = name;
			return this;
		}

		public PremiumMemberBuilder nickname(final String nickname)
		{
			this.nickname = nickname;
			return this;
		}

		@Override
		public String toString()
		{
			return "PremiumMember.PremiumMemberBuilder(about=" + this.about + ", gender="
				+ this.gender + ", married=" + this.married + ", name=" + this.name + ", nickname="
				+ this.nickname + ", dateofbirth=" + this.dateofbirth + ", dateofMarriage="
				+ this.dateofMarriage + ", credits=" + this.credits + ")";
		}
	}
}
