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
package io.github.astrapi69.test.objects;

import java.util.Date;

import io.github.astrapi69.test.objects.enums.Gender;

/**
 * The class {@link Member} is a class intended for use in unit tests.
 */
public class Member extends Person
{
	/**
	 * The Constant serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * The dateofbirth.
	 */
	private Date dateofbirth;
	/**
	 * The dateof marriage.
	 */
	private Date dateofMarriage;

	/**
	 * Instantiates a new {@link Member} object.
	 */
	public Member()
	{
	}

	/**
	 * Instantiates a new {@link Member} object with the given parameters.
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
	 */
	public Member(final String about, final Gender gender, final Boolean married, final String name,
		final String nickname, final Date dateofbirth, final Date dateofMarriage)
	{
		super(about, gender, married, name, nickname);
		this.dateofbirth = dateofbirth;
		this.dateofMarriage = dateofMarriage;
	}

	public static MemberBuilder buildMember()
	{
		return new MemberBuilder();
	}

	@Override
	protected boolean canEqual(final Object other)
	{
		return other instanceof Member;
	}

	@Override
	public boolean equals(final Object o)
	{
		if (o == this)
			return true;
		if (!(o instanceof Member))
			return false;
		final Member other = (Member)o;
		if (!other.canEqual(this))
			return false;
		if (!super.equals(o))
			return false;
		final Object this$dateofbirth = this.getDateofbirth();
		final Object other$dateofbirth = other.getDateofbirth();
		if (this$dateofbirth == null
			? other$dateofbirth != null
			: !this$dateofbirth.equals(other$dateofbirth))
			return false;
		final Object this$dateofMarriage = this.getDateofMarriage();
		final Object other$dateofMarriage = other.getDateofMarriage();
		return this$dateofMarriage == null
			? other$dateofMarriage == null
			: this$dateofMarriage.equals(other$dateofMarriage);
	}

	public Date getDateofbirth()
	{
		return this.dateofbirth;
	}

	public Member setDateofbirth(final Date dateofbirth)
	{
		this.dateofbirth = dateofbirth;
		return this;
	}

	public Date getDateofMarriage()
	{
		return this.dateofMarriage;
	}

	public Member setDateofMarriage(final Date dateofMarriage)
	{
		this.dateofMarriage = dateofMarriage;
		return this;
	}

	@Override
	public int hashCode()
	{
		final int PRIME = 59;
		int result = super.hashCode();
		final Object $dateofbirth = this.getDateofbirth();
		result = result * PRIME + ($dateofbirth == null ? 43 : $dateofbirth.hashCode());
		final Object $dateofMarriage = this.getDateofMarriage();
		result = result * PRIME + ($dateofMarriage == null ? 43 : $dateofMarriage.hashCode());
		return result;
	}

	@Override
	public String toString()
	{
		return "Member(super=" + super.toString() + ", dateofbirth=" + this.getDateofbirth()
			+ ", dateofMarriage=" + this.getDateofMarriage() + ")";
	}

	public static class MemberBuilder
	{

		private String about;

		private Date dateofbirth;

		private Date dateofMarriage;

		private Gender gender;

		private Boolean married;

		private String name;

		private String nickname;

		MemberBuilder()
		{
		}

		public MemberBuilder about(final String about)
		{
			this.about = about;
			return this;
		}

		public Member build()
		{
			return new Member(about, gender, married, name, nickname, dateofbirth, dateofMarriage);
		}

		public MemberBuilder dateofbirth(final Date dateofbirth)
		{
			this.dateofbirth = dateofbirth;
			return this;
		}

		public MemberBuilder dateofMarriage(final Date dateofMarriage)
		{
			this.dateofMarriage = dateofMarriage;
			return this;
		}

		public MemberBuilder gender(final Gender gender)
		{
			this.gender = gender;
			return this;
		}

		public MemberBuilder married(final Boolean married)
		{
			this.married = married;
			return this;
		}

		public MemberBuilder name(final String name)
		{
			this.name = name;
			return this;
		}

		public MemberBuilder nickname(final String nickname)
		{
			this.nickname = nickname;
			return this;
		}

		@Override
		public String toString()
		{
			return "Member.MemberBuilder(about=" + this.about + ", gender=" + this.gender
				+ ", married=" + this.married + ", name=" + this.name + ", nickname="
				+ this.nickname + ", dateofbirth=" + this.dateofbirth + ", dateofMarriage="
				+ this.dateofMarriage + ")";
		}
	}
}
