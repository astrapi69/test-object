package de.alpharogroup.test.objects;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * The class {@link NotSerializable} is a class intended for use in unit tests.
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class NotSerializable
{

	/** The name. */
	private String name;

}
