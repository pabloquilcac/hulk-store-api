/**
 * 
 */
package org.home.spring.servicio;

import java.util.List;

import org.home.spring.dao.ProductDao;
import org.home.spring.model.Product;
import org.home.spring.model.enumeration.ActiveEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Servicio para opciones de producto
 * 
 * @author pablo.quilca
 *
 */

@Service
public class ProductService {

	@Autowired
	private ProductDao productDao;

	/**
	 * Agregar producto
	 * 
	 * @param producto
	 * @return Product
	 * 
	 */
	@Transactional
	public Product save(Product product) {
		return productDao.save(product);
	}

	/**
	 * Buscar producto
	 * 
	 * @param id
	 * @return Product
	 */
	@Transactional(readOnly = true)
	public Product getById(Long id) {
		return productDao.findById(id).orElse(null);
	}

	/**
	 * Validar stock antes de realizar una venta
	 * 
	 * @param id
	 * @return stock del producto
	 */
	@Transactional(readOnly = true)
	public Integer getStock(Long id) {
		Product product = productDao.findById(id).orElse(new Product());
		return product.getStock();
	}

	/**
	 * Lista productos activos.
	 * 
	 * @return Lista Product
	 */
	@Transactional(readOnly = true)
	public List<Product> getActives() {
		return productDao.getByActive(ActiveEnum.A);
	}

	/**
	 * Metodo que siminuye stock
	 * 
	 * @param idProduct
	 * @param quantity
	 * @return Producto actualizado
	 */
	public Product decreaseStock(Long idProduct, Integer quantity) {
		Product product = getById(idProduct);
		Integer stock = 0;
		if (product != null) {
			stock = product.getStock();
		}
		if (stock > 0 && stock >= quantity) {
			product.setStock(product.getStock() - quantity);
		}
		return product;
	}

	/**
	 * Metodo que permite registrar un aumento de stock en un producto cuando se
	 * realiza una compra a un proveedor
	 * 
	 * @param idProducto
	 * @param cantidad
	 * @return el producto luego de aumentar su inventario
	 */
	public Product addSotck(Long idProduct, Integer quantity) {
		Product product = getById(idProduct);
		product.setStock(product.getStock() + quantity);
		return product;
	}

}
