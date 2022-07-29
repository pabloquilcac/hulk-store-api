/**
 * 
 */
package org.home.spring.model.enumeration;

/**
 * Enumerado que permite manejar los estados de los registros de la base de
 * datos
 * 
 * @author casa
 *
 */
public enum ActiveEnum {
	A("Active"), I("Inactive");

	private String description;

	private ActiveEnum(String description) {
		this.description = description;
	}

	public String getDescription() {
		return this.description;
	}

}
