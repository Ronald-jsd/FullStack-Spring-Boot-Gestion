package edu.app.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;


/**
 * Clase que representa un producto en la base de datos.
 * Se mapea a la tabla "tbl_products".
 */
@Entity(name = "Product")
@Table(name = "tbl_products")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String description;
	private int stock;
	private Double price;
	private String image;
	
	private Boolean state;
}
