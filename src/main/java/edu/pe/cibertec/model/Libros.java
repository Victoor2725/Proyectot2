package edu.pe.cibertec.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Tbl_Libros")
public class Libros {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int LibroID;
	
	@Column(name = "Titulo")
	private String Titulo;
	
	@Column(name = "Nombre_Autor")
	private String Nombre_Autor;
	
	@Column(name = "Apellido_Autor")
	private String Apellido_Autor;
	
	@Column(name = "Categoria")
	private String Categoria;
	
	@Column(name = "Precio")
	private String Precio;

	public Libros() {
		super();
	}

	public Libros(int libroID, String titulo, String nombre_Autor, String apellido_Autor, String categoria,
			String precio) {
		super();
		LibroID = libroID;
		Titulo = titulo;
		Nombre_Autor = nombre_Autor;
		Apellido_Autor = apellido_Autor;
		Categoria = categoria;
		Precio = precio;
	}

	public Libros(String titulo, String nombre_Autor, String apellido_Autor, String categoria, String precio) {
		super();
		Titulo = titulo;
		Nombre_Autor = nombre_Autor;
		Apellido_Autor = apellido_Autor;
		Categoria = categoria;
		Precio = precio;
	}

	public int getLibroID() {
		return LibroID;
	}

	public void setLibroID(int libroID) {
		LibroID = libroID;
	}

	public String getTitulo() {
		return Titulo;
	}

	public void setTitulo(String titulo) {
		Titulo = titulo;
	}

	public String getNombre_Autor() {
		return Nombre_Autor;
	}

	public void setNombre_Autor(String nombre_Autor) {
		Nombre_Autor = nombre_Autor;
	}

	public String getApellido_Autor() {
		return Apellido_Autor;
	}

	public void setApellido_Autor(String apellido_Autor) {
		Apellido_Autor = apellido_Autor;
	}

	public String getCategoria() {
		return Categoria;
	}

	public void setCategoria(String categoria) {
		Categoria = categoria;
	}

	public String getPrecio() {
		return Precio;
	}

	public void setPrecio(String precio) {
		Precio = precio;
	}
	
	
}
