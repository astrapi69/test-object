package de.alpharogroup.classes.inner;

import de.alpharogroup.classes.inner.OuterClass.InnerClass;
import de.alpharogroup.classes.inner.OuterClass.StaticNestedClass;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class OuterClassTest
{

	public void testOuterClass() {
		StaticNestedClass.staticNestedClassMethod();
		showInfo(OuterClass.class);
		showInfo(InnerClass.class);
		showInfo(StaticNestedClass.class);
	}

	/**
	 * Show info from given class.
	 *
	 * @param clazz
	 *            the clazz
	 */
	public static void showInfo(Class<?> clazz)
	{
		log.info("========================================================================");
		log.info("class name is {}.", clazz.getName());
		log.info("= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = ");
		log.info("is class {} anonymous class:{}", clazz.getSimpleName(), clazz.isAnonymousClass());
		log.info("is class {} synthetic class:{}", clazz.getSimpleName(), clazz.isSynthetic());
		log.info("is class {} enclosing class:{}", clazz.getSimpleName(),
			clazz.getEnclosingClass());
		log.info("canonical name of class {}:{}", clazz.getSimpleName(), clazz.getCanonicalName());
		log.info("enclosing method:{}", clazz.getEnclosingMethod());
		log.info("========================================================================");
	}
}
