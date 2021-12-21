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
package io.github.astrapi69.date;

import java.util.Date;

/**
 * The class {@link DateDecorator} is a {@link Date} decorator.
 */
public class DateDecorator
{

	private Date date;

	public DateDecorator()
	{
	}

	public DateDecorator(final Date date)
	{
		this.date = date;
	}

	public static DateDecoratorBuilder builder()
	{
		return new DateDecoratorBuilder();
	}

	protected boolean canEqual(final Object other)
	{
		return other instanceof DateDecorator;
	}

	@Override
	public boolean equals(final Object o)
	{
		if (o == this)
			return true;
		if (!(o instanceof DateDecorator))
			return false;
		final DateDecorator other = (DateDecorator)o;
		if (!other.canEqual(this))
			return false;
		final Object this$date = this.getDate();
		final Object other$date = other.getDate();
		return this$date == null ? other$date == null : this$date.equals(other$date);
	}

	public Date getDate()
	{
		return this.date;
	}

	public DateDecorator setDate(final Date date)
	{
		this.date = date;
		return this;
	}

	@Override
	public int hashCode()
	{
		final int PRIME = 59;
		int result = 1;
		final Object $date = this.getDate();
		result = result * PRIME + ($date == null ? 43 : $date.hashCode());
		return result;
	}

	public DateDecoratorBuilder toBuilder()
	{
		return new DateDecoratorBuilder().date(this.date);
	}

	@Override
	public String toString()
	{
		return "DateDecorator(date=" + this.getDate() + ")";
	}

	public static class DateDecoratorBuilder
	{

		private Date date;

		DateDecoratorBuilder()
		{
		}

		public DateDecorator build()
		{
			return new DateDecorator(date);
		}

		public DateDecoratorBuilder date(final Date date)
		{
			this.date = date;
			return this;
		}

		@Override
		public String toString()
		{
			return "DateDecorator.DateDecoratorBuilder(date=" + this.date + ")";
		}
	}
}
