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
package de.alpharogroup.test.objects;

/**
 * The class {@link Television} is a class intended for use in unit tests.
 */
public class Television
{
	/**
	 * The channel.
	 */
	private int channel;
	/**
	 * The on flag.
	 */
	private boolean on;

	/**
	 * Switch off.
	 *
	 * @return the television
	 */
	public Television switchOff()
	{
		this.on = false;
		return this;
	}

	/**
	 * Switch on.
	 *
	 * @return the television
	 */
	public Television switchOn()
	{
		this.on = true;
		return this;
	}

	public static class TelevisionBuilder
	{

		private int channel;

		private boolean on;

		TelevisionBuilder()
		{
		}

		public TelevisionBuilder channel(final int channel)
		{
			this.channel = channel;
			return this;
		}

		public TelevisionBuilder on(final boolean on)
		{
			this.on = on;
			return this;
		}

		public Television build()
		{
			return new Television(channel, on);
		}

		@Override
		public String toString()
		{
			return "Television.TelevisionBuilder(channel=" + this.channel + ", on=" + this.on + ")";
		}
	}

	public static TelevisionBuilder builder()
	{
		return new TelevisionBuilder();
	}

	public TelevisionBuilder toBuilder()
	{
		return new TelevisionBuilder().channel(this.channel).on(this.on);
	}

	public int getChannel()
	{
		return this.channel;
	}

	public boolean isOn()
	{
		return this.on;
	}

	public Television setChannel(final int channel)
	{
		this.channel = channel;
		return this;
	}

	public Television setOn(final boolean on)
	{
		this.on = on;
		return this;
	}

	@Override
	public boolean equals(final Object o)
	{
		if (o == this)
			return true;
		if (!(o instanceof Television))
			return false;
		final Television other = (Television)o;
		if (!other.canEqual((Object)this))
			return false;
		if (this.getChannel() != other.getChannel())
			return false;
		if (this.isOn() != other.isOn())
			return false;
		return true;
	}

	protected boolean canEqual(final Object other)
	{
		return other instanceof Television;
	}

	@Override
	public int hashCode()
	{
		final int PRIME = 59;
		int result = 1;
		result = result * PRIME + this.getChannel();
		result = result * PRIME + (this.isOn() ? 79 : 97);
		return result;
	}

	@Override
	public String toString()
	{
		return "Television(channel=" + this.getChannel() + ", on=" + this.isOn() + ")";
	}

	public Television()
	{
	}

	public Television(final int channel, final boolean on)
	{
		this.channel = channel;
		this.on = on;
	}
}
