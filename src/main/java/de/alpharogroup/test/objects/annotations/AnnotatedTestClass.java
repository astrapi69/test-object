package de.alpharogroup.test.objects.annotations;

@TestTypeAnnotation("type test value")
public class AnnotatedTestClass
{
	@TestFieldAnnotation("name test value")
	private String name;

	@TestMethodAnnotation("method test value")
	private String getFullname()
	{
		return "fullname";
	}

}
