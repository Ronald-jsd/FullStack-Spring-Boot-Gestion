package edu.app.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import edu.app.entities.Product;
import edu.app.services.ProductService;
import lombok.RequiredArgsConstructor;

/**
 * Controlador para la gestión de productos.
 */
@Controller
@RequiredArgsConstructor
public class ProductController {

	private final ProductService productService;

	/**
	 * Lista todos los productos o filtra por nombre si se proporciona un parámetro.
	 *
	 * @param name  Nombre opcional del producto para filtrar.
	 * @param model Modelo para enviar datos a la vista.
	 * @return Nombre de la vista "productos".
	 */
	@GetMapping("/")
	public String getAllOrFilterByName(@RequestParam(required = false) String name, Model model) {
		List<Product> products = productService.findAllOrFilterByName(name);
		model.addAttribute("datos", products);
		return "productos";
	}

	/**
	 * Muestra los detalles de un producto específico.
	 *
	 * @param id    ID del producto.
	 * @param model Modelo para enviar datos a la vista.
	 * @return Nombre de la vista "detalle-producto".
	 */
	@GetMapping("/{id}")
	public String getById(@PathVariable Long id, Model model) {
		Optional<Product> product = productService.findById(id);
		model.addAttribute("producto", product.get());
		return "detalle-producto";
	}

	/**
	 * Muestra el formulario de registro de un nuevo producto.
	 *
	 * @param model Modelo para enviar datos a la vista.
	 * @return Nombre de la vista "formulario-nuevo".
	 */
	@GetMapping("/new")
	public String viewNewProductForm(Model model) {
		Product product = new Product();
		editModelAttribute(model, "Registrar Producto", "/save", product, "Guardar");
		return "formulario-nuevo";
	}

	/**
	 * Guarda un producto desde el formulario.
	 *
	 * @param product Objeto del producto a guardar.
	 * @param model   Modelo para la vista.
	 * @return Redirección a la lista de productos.
	 */
	@PostMapping("/save")
	public String saveProduct(Product product, Model model) {
		productService.save(product);
		return "redirect:/";
	}

	/**
	 * Muestra el formulario de eliminación de un producto.
	 *
	 * @param id    ID del producto a eliminar.
	 * @param model Modelo para enviar datos a la vista.
	 * @return Nombre de la vista "formulario-nuevo".
	 */
	@GetMapping("/delete/{id}")
	public String viewDeleteProductForm(@PathVariable Long id, Model model) {
		Optional<Product> product = productService.findById(id);
		editModelAttribute(model, "Eliminar Producto", "/delete", product, "Eliminar");
		return "formulario-nuevo";
	}

	/**
	 * Elimina un producto usando el ID recibido desde el formulario.
	 *
	 * @param id    ID del producto a eliminar.
	 * @param model Modelo para la vista.
	 * @return Redirección a la lista de productos.
	 */
	@PostMapping("/delete")
	public String deleteProduct(@RequestParam Long id, Model model) {
		productService.delete(id);
		return "redirect:/";
	}

	/**
	 * Muestra el formulario de edición de un producto existente.
	 *
	 * @param id    ID del producto a editar.
	 * @param model Modelo para enviar datos a la vista.
	 * @return Nombre de la vista "formulario-nuevo".
	 */
	@GetMapping("/edit/{id}")
	public String viewEditProductForm(@PathVariable Long id, Model model) {
		Optional<Product> product = productService.findById(id);
		editModelAttribute(model, "Editar Producto", "/update", product, "Actualizar");
		return "formulario-nuevo";
	}

	/**
	 * Actualiza un producto con los datos enviados desde el formulario.
	 *
	 * @param id      ID del producto a actualizar.
	 * @param product Datos actualizados del producto.
	 * @return Redirección a la lista de productos.
	 */
	@PostMapping("/update")
	public String updateProduct(@RequestParam Long id, Product product) {
		productService.update(id, product);
		return "redirect:/";
	}

	/**
	 * Configura los atributos del modelo para el formulario de producto.
	 *
	 * @param model      Modelo a modificar.
	 * @param titulo     Título del formulario.
	 * @param method     Acción del formulario.
	 * @param product    Producto a gestionar.
	 * @param textoBoton Texto del botón de acción.
	 */
	void editModelAttribute(Model model, String titulo, String method, Object product, String textoBoton) {
		model.addAttribute("titulo", titulo);
		model.addAttribute("action", method);
		model.addAttribute("producto", product);
		model.addAttribute("textoBoton", textoBoton);
	}
}