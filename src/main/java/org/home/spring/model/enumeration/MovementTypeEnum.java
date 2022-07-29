/**
 * 
 */
package org.home.spring.model.enumeration;

/**
 * enumerado tipo de kardex
 * 
 * 
 * @author pablo.quilca
 *
 */
public enum MovementTypeEnum {
	I("Ingreso"), E("EGRESO");

	private String description;

	private MovementTypeEnum(String description) {
		this.description = description;
	}

	public String getDescription() {
		return this.description;
	}
}
