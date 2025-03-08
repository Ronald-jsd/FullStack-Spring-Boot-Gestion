
package edu.app.services;

import java.util.List;
import java.util.Optional;
import edu.app.entities.Product;

/**
 * Servicio que define las operaciones para gestionar productos.
 */
public interface ProductService {

	/**
	 * Obtiene la lista de productos activos o filtra por nombre si se proporciona.
	 *
	 * @param name Nombre opcional para filtrar productos.
	 * @return Lista de productos activos o filtrados por nombre.
	 */
	List<Product> findAllOrFilterByName(String name);

	/**
	 * Busca un producto por su ID.
	 *
	 * @param id Identificador único del producto.
	 * @return Un Optional que contiene el producto si se encuentra.
	 */
	Optional<Product> findById(Long id);

	/**
	 * Guarda un nuevo producto en la base de datos.
	 *
	 * @param product Producto a guardar.
	 * @return El producto guardado.
	 */
	Product save(Product product);

	/**
	 * Actualiza los datos de un producto existente.
	 *
	 * @param id Identificador del producto a actualizar.
	 * @param product Datos actualizados del producto.
	 * @return El producto actualizado.
	 */
	Product update(Long id, Product product);

	/**
	 * Elimina un producto de la base de datos por su ID.
	 *
	 * @param id Identificador del producto a eliminar.
	 */
	void delete(Long id);
}
