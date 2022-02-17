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
package io.github.astrapi69.test.object.auth;

/**
 * The class {@link Signin} is a class intended for use in unit tests.
 */
public class Signin
{
	private String password;
	private String username;

	public Signin()
	{
	}

	public Signin(String password, String username)
	{
		this.password = password;
		this.username = username;
	}

	public static SigninBuilder builder()
	{
		return new SigninBuilder();
	}

	protected boolean canEqual(final Object other)
	{
		return other instanceof Signin;
	}

	@Override
	public boolean equals(final Object o)
	{
		if (o == this)
			return true;
		if (!(o instanceof Signin))
			return false;
		final Signin other = (Signin)o;
		if (!other.canEqual(this))
			return false;
		final Object this$password = this.getPassword();
		final Object other$password = other.getPassword();
		if (this$password == null ? other$password != null : !this$password.equals(other$password))
			return false;
		final Object this$username = this.getUsername();
		final Object other$username = other.getUsername();
		return this$username == null
			? other$username == null
			: this$username.equals(other$username);
	}

	public String getPassword()
	{
		return this.password;
	}

	public void setPassword(String password)
	{
		this.password = password;
	}

	public String getUsername()
	{
		return this.username;
	}

	public void setUsername(String username)
	{
		this.username = username;
	}

	@Override
	public int hashCode()
	{
		final int PRIME = 59;
		int result = 1;
		final Object $password = this.getPassword();
		result = result * PRIME + ($password == null ? 43 : $password.hashCode());
		final Object $username = this.getUsername();
		result = result * PRIME + ($username == null ? 43 : $username.hashCode());
		return result;
	}

	@Override
	public String toString()
	{
		return "Signin(password=" + this.getPassword() + ", username=" + this.getUsername() + ")";
	}

	public static class SigninBuilder
	{
		private String password;
		private String username;

		SigninBuilder()
		{
		}

		public Signin build()
		{
			return new Signin(password, username);
		}

		public Signin.SigninBuilder password(String password)
		{
			this.password = password;
			return this;
		}

		@Override
		public String toString()
		{
			return "Signin.SigninBuilder(password=" + this.password + ", username=" + this.username
				+ ")";
		}

		public Signin.SigninBuilder username(String username)
		{
			this.username = username;
			return this;
		}
	}
}
