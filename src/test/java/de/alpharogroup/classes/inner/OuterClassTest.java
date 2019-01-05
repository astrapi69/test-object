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
package de.alpharogroup.classes.inner;

import java.util.logging.Level;

import de.alpharogroup.classes.inner.OuterClass.InnerClass;
import de.alpharogroup.classes.inner.OuterClass.StaticNestedClass;
import lombok.extern.java.Log;

@Log
public class OuterClassTest
{

	/**
	 * Show info from given class.
	 *
	 * @param clazz
	 *            the clazz
	 */
	public static void showInfo(Class<?> clazz)
	{
		Object[] anonCl = { clazz.getSimpleName(), clazz.isAnonymousClass() };
		Object[] synthCl = { clazz.getSimpleName(), clazz.isSynthetic() };
		Object[] enclCl = { clazz.getSimpleName(), clazz.getEnclosingClass() };
		Object[] canonCl = { clazz.getSimpleName(), clazz.getCanonicalName() };
		log.info("========================================================================");
		log.log(Level.INFO, "class name is {}.", clazz.getName());
		log.info("= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = ");
		log.log(Level.INFO, "is class {} anonymous class:{}", anonCl);
		log.log(Level.INFO, "is class {} synthetic class:{}", synthCl);
		log.log(Level.INFO, "is class {} enclosing class:{}", enclCl);
		log.log(Level.INFO, "canonical name of class {}:{}", canonCl);
		log.log(Level.INFO, "enclosing method:{}", clazz.getEnclosingMethod());
		log.info("========================================================================");
	}

	public void testOuterClass()
	{
		StaticNestedClass.staticNestedClassMethod();
		showInfo(OuterClass.class);
		showInfo(InnerClass.class);
		showInfo(StaticNestedClass.class);
	}
}
