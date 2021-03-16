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

import java.io.Serializable;

import io.github.astrapi69.test.objects.enums.Gender;

/**
 * The class {@link Person} is a class intended for use in unit tests.
 */
public class Person implements Serializable, Comparable<Person>
{
	/**
	 * The serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * The about.
	 */
	private String about;
	/**
	 * The gender.
	 */
	private Gender gender;
	/**
	 * The married flag.
	 */
	private Boolean married;
	/**
	 * The name.
	 */
	private String name;
	/**
	 * The nickname.
	 */
	private String nickname;

	public Person()
	{
		this.about = Person.$default$about();
		this.gender = Person.$default$gender();
		this.married = Person.$default$married();
		this.name = Person.$default$name();
		this.nickname = Person.$default$nickname();
	}

	public Person(final String about, final Gender gender, final Boolean married, final String name,
		final String nickname)
	{
		this.about = about;
		this.gender = gender;
		this.married = married;
		this.name = name;
		this.nickname = nickname;
	}

	private static String $default$about()
	{
		return "";
	}

	private static Gender $default$gender()
	{
		return Gender.UNDEFINED;
	}

	private static Boolean $default$married()
	{
		return Boolean.FALSE;
	}

	private static String $default$name()
	{
		return "";
	}

	private static String $default$nickname()
	{
		return "";
	}

	public static PersonBuilder builder()
	{
		return new PersonBuilder();
	}

	protected boolean canEqual(final Object other)
	{
		return other instanceof Person;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int compareTo(final Person o)
	{
		return this.getName().toString().compareTo(o.getName().toString());
	}

	@Override
	public boolean equals(final Object o)
	{
		if (o == this)
			return true;
		if (!(o instanceof Person))
			return false;
		final Person other = (Person)o;
		if (!other.canEqual(this))
			return false;
		final Object this$about = this.getAbout();
		final Object other$about = other.getAbout();
		if (this$about == null ? other$about != null : !this$about.equals(other$about))
			return false;
		final Object this$gender = this.getGender();
		final Object other$gender = other.getGender();
		if (this$gender == null ? other$gender != null : !this$gender.equals(other$gender))
			return false;
		final Object this$married = this.getMarried();
		final Object other$married = other.getMarried();
		if (this$married == null ? other$married != null : !this$married.equals(other$married))
			return false;
		final Object this$name = this.getName();
		final Object other$name = other.getName();
		if (this$name == null ? other$name != null : !this$name.equals(other$name))
			return false;
		final Object this$nickname = this.getNickname();
		final Object other$nickname = other.getNickname();
		if (this$nickname == null ? other$nickname != null : !this$nickname.equals(other$nickname))
			return false;
		return true;
	}

	public String getAbout()
	{
		return this.about;
	}

	public Person setAbout(final String about)
	{
		this.about = about;
		return this;
	}

	public Gender getGender()
	{
		return this.gender;
	}

	public Person setGender(final Gender gender)
	{
		this.gender = gender;
		return this;
	}

	public Boolean getMarried()
	{
		return this.married;
	}

	public Person setMarried(final Boolean married)
	{
		this.married = married;
		return this;
	}

	public String getName()
	{
		return this.name;
	}

	public Person setName(final String name)
	{
		this.name = name;
		return this;
	}

	public String getNickname()
	{
		return this.nickname;
	}

	public Person setNickname(final String nickname)
	{
		this.nickname = nickname;
		return this;
	}

	@Override
	public int hashCode()
	{
		final int PRIME = 59;
		int result = 1;
		final Object $about = this.getAbout();
		result = result * PRIME + ($about == null ? 43 : $about.hashCode());
		final Object $gender = this.getGender();
		result = result * PRIME + ($gender == null ? 43 : $gender.hashCode());
		final Object $married = this.getMarried();
		result = result * PRIME + ($married == null ? 43 : $married.hashCode());
		final Object $name = this.getName();
		result = result * PRIME + ($name == null ? 43 : $name.hashCode());
		final Object $nickname = this.getNickname();
		result = result * PRIME + ($nickname == null ? 43 : $nickname.hashCode());
		return result;
	}

	public PersonBuilder toBuilder()
	{
		return new PersonBuilder().about(this.about).gender(this.gender).married(this.married)
			.name(this.name).nickname(this.nickname);
	}

	@Override
	public String toString()
	{
		return "Person(about=" + this.getAbout() + ", gender=" + this.getGender() + ", married="
			+ this.getMarried() + ", name=" + this.getName() + ", nickname=" + this.getNickname()
			+ ")";
	}

	public static class PersonBuilder
	{

		private String about;

		private boolean about$set;

		private Gender gender;

		private boolean gender$set;

		private Boolean married;

		private boolean married$set;

		private String name;

		private boolean name$set;

		private String nickname;

		private boolean nickname$set;

		PersonBuilder()
		{
		}

		public PersonBuilder about(final String about)
		{
			this.about = about;
			about$set = true;
			return this;
		}

		public Person build()
		{
			String about = this.about;
			if (!about$set)
				about = Person.$default$about();
			Gender gender = this.gender;
			if (!gender$set)
				gender = Person.$default$gender();
			Boolean married = this.married;
			if (!married$set)
				married = Person.$default$married();
			String name = this.name;
			if (!name$set)
				name = Person.$default$name();
			String nickname = this.nickname;
			if (!nickname$set)
				nickname = Person.$default$nickname();
			return new Person(about, gender, married, name, nickname);
		}

		public PersonBuilder gender(final Gender gender)
		{
			this.gender = gender;
			gender$set = true;
			return this;
		}

		public PersonBuilder married(final Boolean married)
		{
			this.married = married;
			married$set = true;
			return this;
		}

		public PersonBuilder name(final String name)
		{
			this.name = name;
			name$set = true;
			return this;
		}

		public PersonBuilder nickname(final String nickname)
		{
			this.nickname = nickname;
			nickname$set = true;
			return this;
		}

		@Override
		public String toString()
		{
			return "Person.PersonBuilder(about=" + this.about + ", gender=" + this.gender
				+ ", married=" + this.married + ", name=" + this.name + ", nickname="
				+ this.nickname + ")";
		}
	}
}
