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

import java.util.Date;

import de.alpharogroup.test.objects.enums.Gender;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * The class {@link Member}.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class Member extends Person
{

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The dateofbirth. */
	private Date dateofbirth;

	/** The dateof marriage. */
	private Date dateofMarriage;

	/**
	 * Instantiates a new {@link Member} object with the given parameters.
	 *
	 * @param name
	 *            the name
	 * @param nickname
	 *            the nickname
	 * @param gender
	 *            the gender
	 * @param about
	 *            the about
	 * @param married
	 *            the married
	 * @param dateofbirth
	 *            the dateofbirth
	 * @param dateofMarriage
	 *            the dateof marriage
	 */
	@Builder(builderMethodName = "buildMember")
	public Member(final String name, final String nickname, final Gender gender, final String about,
		final Boolean married, final Date dateofbirth, final Date dateofMarriage)
	{
		super(name, nickname, gender, about, married);
		this.dateofbirth = dateofbirth;
		this.dateofMarriage = dateofMarriage;
	}
}
