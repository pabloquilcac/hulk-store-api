package org.home.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.home.spring.model.enumeration.ActiveEnum;

@Entity
@Table(name = "User")
public class User {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6433393579512741223L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;


	@Column(name = "email", length = 100, nullable = false)
	private String email;

	@Column(name = "password", length = 100, nullable = false)
	private String password;

	@Column(name = "name", length = 200, nullable = false)
	private String name;

	@Column(name = "phone", length = 30, nullable = false)
	private String phone;

	@Column(name = "address", length = 100, nullable = false)
	private String address;
	
	@Column(name = "token", length = 200, nullable = true)
	private String token;
	
	@Column(name = "rol", length = 200, nullable = false)
	private String rol;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}



}
