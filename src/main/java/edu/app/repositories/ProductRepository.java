package edu.app.repositories;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import edu.app.entities.Product;

/**
 * Repositorio de acceso a datos para la entidad Product.
 * Proporciona métodos para interactuar con la base de datos.
 */
public interface ProductRepository extends JpaRepository<Product, Long> {

	/**
	 * Busca productos cuyo nombre contenga una determinada cadena de texto.
	 *
	 * @param name Parte del nombre del producto a buscar.
	 * @return Lista de productos que coincidan con el nombre dado.
	 */
	List<Product> findByNameLike(String name);

	/**
	 * Lista productos filtrando por estado.
	 *
	 * @param state Estado del producto (activo/inactivo).
	 * @return Lista de productos con el estado especificado.
	 */
	List<Product> findByState(Boolean state);

}
