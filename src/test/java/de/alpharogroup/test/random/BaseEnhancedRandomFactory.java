package de.alpharogroup.test.random;

import io.github.benas.randombeans.EnhancedRandomBuilder;
import io.github.benas.randombeans.api.EnhancedRandom;
import lombok.experimental.UtilityClass;

/**
 * A factory for creating {@link EnhancedRandom} objects for create random objects
 */
@UtilityClass
public class BaseEnhancedRandomFactory
{

	/** The Constant ENHANCED_RANDOM. */
	private static final EnhancedRandom ENHANCED_RANDOM = new EnhancedRandomBuilder().build();

	/**
	 * Factory method for create a random object from the given class type. Optionally you can
	 * exclude fields.
	 *
	 * @param <T>
	 *            the generic type
	 * @param type
	 *            the type
	 * @param excludedFields
	 *            the excluded fields
	 * @return the new random object from the given class type
	 */
	public static <T> T nextObject(Class<T> type, String... excludedFields)
	{
		return ENHANCED_RANDOM.nextObject(type, excludedFields);
	}

}
