package org.home.spring.model;

import java.math.BigDecimal;

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
@Table(name = "Product")
public class Product {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6433393579512741223L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne
	@JoinColumn(name = "category_id")
	private Category category;
	


	@Column(name = "heroe", length = 100, nullable = false)
	private String heroe;

	@Column(name = "name", length = 100, nullable = false)
	private String name;

	@Column(name = "description", length = 500, nullable = false)
	private String description;

	@Column(name = "stock", length = 100, nullable = false)
	private Integer stock;

	@Column(name = "min_stock", length = 100, nullable = false)
	private Integer minStock;

	@Column(name = "image", length = 100, nullable = false)
	private String image;

	@Column(name = "price", length = 100, nullable = false)
	private BigDecimal price;

	@Column(name = "active", nullable = false)
	@Enumerated(EnumType.STRING)
	private ActiveEnum active;
	

	@Transient
	private String stockStatus;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	



	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public String getHeroe() {
		return heroe;
	}

	public void setHeroe(String heroe) {
		this.heroe = heroe;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

	

	public Integer getMinStock() {
		return minStock;
	}

	public void setMinStock(Integer minStock) {
		this.minStock = minStock;
	}



	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public String getStockStatus() {
		if (this.stock==0) {
			return "NO DISPONIBLE";
		} else if (this.stock<=this.minStock) {
			return "QUEDAN POCOS";
		} else {
			return "DISPONIBLE";
		}
	}

	

	public ActiveEnum getActive() {
		return active;
	}

	public void setActive(ActiveEnum active) {
		this.active = active;
	}

}
