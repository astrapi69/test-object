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
package io.github.astrapi69.test.object.type.hierarchy.animal;

public class Forbidden
{

	private Animal animal;

	public Forbidden(Animal animal)
	{
		this.animal = animal;
	}

	public Forbidden()
	{
	}

	public static ForbiddenBuilder builder()
	{
		return new ForbiddenBuilder();
	}

	public Animal getAnimal()
	{
		return this.animal;
	}

	public void setAnimal(Animal animal)
	{
		this.animal = animal;
	}

	public boolean equals(final Object o)
	{
		if (o == this)
			return true;
		if (!(o instanceof Forbidden))
			return false;
		final Forbidden other = (Forbidden)o;
		if (!other.canEqual(this))
			return false;
		final Object this$animal = this.getAnimal();
		final Object other$animal = other.getAnimal();
		return this$animal == null ? other$animal == null : this$animal.equals(other$animal);
	}

	protected boolean canEqual(final Object other)
	{
		return other instanceof Forbidden;
	}

	public int hashCode()
	{
		final int PRIME = 59;
		int result = 1;
		final Object $animal = this.getAnimal();
		result = result * PRIME + ($animal == null ? 43 : $animal.hashCode());
		return result;
	}

	public String toString()
	{
		return "Forbidden(animal=" + this.getAnimal() + ")";
	}

	public static class ForbiddenBuilder
	{
		private Animal animal;

		ForbiddenBuilder()
		{
		}

		public ForbiddenBuilder animal(Animal animal)
		{
			this.animal = animal;
			return this;
		}

		public Forbidden build()
		{
			return new Forbidden(animal);
		}

		public String toString()
		{
			return "Forbidden.ForbiddenBuilder(animal=" + this.animal + ")";
		}
	}
}
