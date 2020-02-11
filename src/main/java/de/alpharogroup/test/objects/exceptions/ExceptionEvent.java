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
package de.alpharogroup.test.objects.exceptions;

/**
 * The class {@link ExceptionEvent} is a class intended for use in unit tests.
 */
public class ExceptionEvent
{

	public static class ExceptionEventBuilder
	{

		private Throwable value;

		ExceptionEventBuilder()
		{
		}

		public ExceptionEvent build()
		{
			return new ExceptionEvent(value);
		}

		@Override
		public String toString()
		{
			return "ExceptionEvent.ExceptionEventBuilder(value=" + this.value + ")";
		}

		public ExceptionEventBuilder value(final Throwable value)
		{
			this.value = value;
			return this;
		}
	}

	public static ExceptionEventBuilder builder()
	{
		return new ExceptionEventBuilder();
	}

	private Throwable value;

	public ExceptionEvent()
	{
	}

	public ExceptionEvent(final Throwable value)
	{
		this.value = value;
	}

	protected boolean canEqual(final Object other)
	{
		return other instanceof ExceptionEvent;
	}

	@Override
	public boolean equals(final Object o)
	{
		if (o == this)
			return true;
		if (!(o instanceof ExceptionEvent))
			return false;
		final ExceptionEvent other = (ExceptionEvent)o;
		if (!other.canEqual(this))
			return false;
		final Object this$value = this.getValue();
		final Object other$value = other.getValue();
		if (this$value == null ? other$value != null : !this$value.equals(other$value))
			return false;
		return true;
	}

	public Throwable getValue()
	{
		return this.value;
	}

	@Override
	public int hashCode()
	{
		final int PRIME = 59;
		int result = 1;
		final Object $value = this.getValue();
		result = result * PRIME + ($value == null ? 43 : $value.hashCode());
		return result;
	}

	public ExceptionEvent setValue(final Throwable value)
	{
		this.value = value;
		return this;
	}

	public ExceptionEventBuilder toBuilder()
	{
		return new ExceptionEventBuilder().value(this.value);
	}

	@Override
	public String toString()
	{
		return "ExceptionEvent(value=" + this.getValue() + ")";
	}
}