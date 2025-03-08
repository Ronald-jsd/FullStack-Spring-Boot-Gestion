# 🚀 Proyecto de Gestión de Productos

Este es un sistema web de gestión de productos desarrollado con **Spring Boot**, **Thymeleaf** y **Bootstrap**.

## 📌 Tecnologías Utilizadas
- Spring Boot: Framework para la construcción de aplicaciones web.
- Thymeleaf: Motor de plantillas para la vista.
- Bootstrap 5: Framework CSS para diseño responsivo.
- Java: Lenguaje de programación.
- MySQL: Base de datos relacional.
- Maven: Gestión de dependencias.

## ✨ Funcionalidades
- ✅ Listado de productos con paginación y búsqueda.
- 🆕 Creación, edición y eliminación de productos.
- 🛑 Validación de datos en formularios.
- 🔍 Visualización de detalles del producto.
- 🎭 Integración con **Bootstrap Icons** para iconos interactivos.

## 📦 Instalación y Configuración

### 1️⃣ **Clonar el repositorio:**
```
git clone https://github.com/tu-repo/gestion-productos.git
cd gestion-productos
```

### 2️⃣ **Configurar la base de datos en `application.properties`:**
```properties
# Configuración de la Base de Datos MySQL
spring.datasource.url=jdbc:mysql://localhost:3306/tu_basedatos
spring.datasource.username=tu_usuario
spring.datasource.password=tu_contraseña
spring.jpa.hibernate.ddl-auto=update
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
```

### 3️⃣ **Ejecutar la aplicación:**
```
mvn spring-boot:run
```

### 4️⃣ **Abrir en el navegador:**
```
http://localhost:8080
```

## 📂 Estructura del Proyecto
```
├── src/
│   ├── main/
│   │   ├── java/com/tuempresa/gestionproductos/
│   │   │   ├── controllers/
│   │   │   │   ├── ProductController.java
│   │   │   ├── entities/
│   │   │   │   ├── Product.java
│   │   │   ├── repositories/
│   │   │   │   ├── ProductRepository.java
│   │   │   ├── services/
│   │   │   │   ├── ProductService.java
│   │   │   │   ├── ProductServiceImpl.java
│   │   ├── resources/
│   │   │   ├── templates/
│   │   │   │   ├── detalle-producto.html
│   │   │   │   ├── formulario.html
│   │   │   │   ├── productos.html
│   │   │   ├── import.sql
```

## 🏆 Uso de la Aplicación
- 📋 **Lista de productos:** Se muestra una tabla con los productos registrados, opciones para buscar y paginar.
- ➕ **Agregar un producto:** Botón para acceder al formulario de registro.
- ✏️ **Editar un producto:** Opción para modificar datos existentes.
- ❌ **Eliminar un producto:** Botón para eliminar de la lista.
- 🔎 **Ver detalles:** Permite ver más información sobre el producto.

## 🖼️ Capturas de Pantalla

### 📜 Listado de Productos
![image](https://github.com/user-attachments/assets/de630c14-c3b7-4850-a1ed-7cdd1558897b)

### 📜 Detalle del producto
![image](https://github.com/user-attachments/assets/5622b16f-0349-4203-8ae5-e11dab3f7286)

### 📝 Formulario Agregar/Editar/Eliminar
![image](https://github.com/user-attachments/assets/2ca41956-339a-4a85-9100-19da5811c491)

![image](https://github.com/user-attachments/assets/5725d8d8-312f-40dc-8b9a-469a5ea491c5)

💫 **Gracias por visitar** 💫
