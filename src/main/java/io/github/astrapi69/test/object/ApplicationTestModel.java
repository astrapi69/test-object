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
 * The class {@link ApplicationTestModel} for unit testing
 */
public class ApplicationTestModel<T>
{
	/**
	 * The model.
	 */
	private T model;

	public ApplicationTestModel()
	{
	}

	public ApplicationTestModel(final T model)
	{
		this.model = model;
	}

	public static <T> ApplicationTestModelBuilder<T> builder()
	{
		return new ApplicationTestModelBuilder<T>();
	}

	protected boolean canEqual(final Object other)
	{
		return other instanceof ApplicationTestModel;
	}

	@Override
	public boolean equals(final Object o)
	{
		if (o == this)
			return true;
		if (!(o instanceof ApplicationTestModel))
			return false;
		final ApplicationTestModel<?> other = (ApplicationTestModel<?>)o;
		if (!other.canEqual(this))
			return false;
		final Object this$model = this.getModel();
		final Object other$model = other.getModel();
		return this$model == null ? other$model == null : this$model.equals(other$model);
	}

	public T getModel()
	{
		return this.model;
	}

	public ApplicationTestModel<T> setModel(final T model)
	{
		this.model = model;
		return this;
	}

	@Override
	public int hashCode()
	{
		final int PRIME = 59;
		int result = 1;
		final Object $model = this.getModel();
		result = result * PRIME + ($model == null ? 43 : $model.hashCode());
		return result;
	}

	public ApplicationTestModelBuilder<T> toBuilder()
	{
		return new ApplicationTestModelBuilder<T>().model(this.model);
	}

	@Override
	public String toString()
	{
		return "ApplicationTestModel(model=" + this.getModel() + ")";
	}

	public static class ApplicationTestModelBuilder<T>
	{

		private T model;

		ApplicationTestModelBuilder()
		{
		}

		public ApplicationTestModel<T> build()
		{
			return new ApplicationTestModel<T>(model);
		}

		public ApplicationTestModelBuilder<T> model(final T model)
		{
			this.model = model;
			return this;
		}

		@Override
		public String toString()
		{
			return "ApplicationTestModel.ApplicationTestModelBuilder(model=" + this.model + ")";
		}
	}
}
