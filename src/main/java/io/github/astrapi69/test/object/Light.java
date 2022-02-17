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
 * The class {@link Light} is a concrete receiver.
 */
public class Light
{
	/**
	 * The on flag.
	 */
	private boolean on;

	public Light()
	{
	}

	public Light(final boolean on)
	{
		this.on = on;
	}

	public static LightBuilder builder()
	{
		return new LightBuilder();
	}

	protected boolean canEqual(final Object other)
	{
		return other instanceof Light;
	}

	@Override
	public boolean equals(final Object o)
	{
		if (o == this)
			return true;
		if (!(o instanceof Light))
			return false;
		final Light other = (Light)o;
		if (!other.canEqual(this))
			return false;
		return this.isOn() == other.isOn();
	}

	@Override
	public int hashCode()
	{
		final int PRIME = 59;
		int result = 1;
		result = result * PRIME + (this.isOn() ? 79 : 97);
		return result;
	}

	public boolean isOn()
	{
		return this.on;
	}

	public Light setOn(final boolean on)
	{
		this.on = on;
		return this;
	}

	/**
	 * Switch off.
	 *
	 * @return the light
	 */
	public Light switchOff()
	{
		setOn(false);
		return this;
	}

	/**
	 * Switch on.
	 *
	 * @return the light
	 */
	public Light switchOn()
	{
		setOn(true);
		return this;
	}

	public LightBuilder toBuilder()
	{
		return new LightBuilder().on(this.on);
	}

	@Override
	public String toString()
	{
		return "Light(on=" + this.isOn() + ")";
	}

	public static class LightBuilder
	{

		private boolean on;

		LightBuilder()
		{
		}

		public Light build()
		{
			return new Light(on);
		}

		public LightBuilder on(final boolean on)
		{
			this.on = on;
			return this;
		}

		@Override
		public String toString()
		{
			return "Light.LightBuilder(on=" + this.on + ")";
		}
	}
}
