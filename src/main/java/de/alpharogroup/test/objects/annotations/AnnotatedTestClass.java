package de.alpharogroup.test.objects.annotations;

/**
 * The class {@link AnnotatedTestClass}.
 */
@TestTypeAnnotation("type test value")
public class AnnotatedTestClass
{

	/** The name. */
	@TestFieldAnnotation("name test value")
	private String name;

	/**
	 * Gets the fullname.
	 *
	 * @return the fullname
	 */
	@TestMethodAnnotation("method test value")
	private String getFullname()
	{
		return "fullname";
	}

}
