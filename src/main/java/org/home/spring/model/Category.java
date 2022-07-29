/**
 * 
 */
package org.home.spring.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.home.spring.model.enumeration.ActiveEnum;

/**
 * Entidad Category
 * 
 * @author pablo.quilca
 *
 */

@Entity
@Table(name = "Category")
public class Category implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "description", length = 50, nullable = false)
	private String description;

	@Enumerated(EnumType.STRING)
	@Column(name = "active")
	private ActiveEnum active;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public ActiveEnum getActive() {
		return active;
	}

	public void setActive(ActiveEnum active) {
		this.active = active;
	}

}
