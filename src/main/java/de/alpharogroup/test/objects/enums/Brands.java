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
package de.alpharogroup.test.objects.enums;

import lombok.Getter;

/**
 * The enum {@link Brands} is an enum intended for use in unit tests and holds some brands from
 * famous cars.
 */
public enum Brands
{

	/** The lamborgini. */
	LAMBORGINI("Lamborgini"),
	/** The maserati. */
	MASERATI("Maserati"),
	/** The ferrari. */
	FERRARI("Ferrari"),
	/** The porsche. */
	PORSCHE("Porsche");

	/**
	 * The value
	 */
	@Getter
	private final String value;

	/**
	 * Instantiates a new {@link Brands}.
	 *
	 * @param value
	 *            the value
	 */
	Brands(final String value)
	{
		this.value = value;
	}

}