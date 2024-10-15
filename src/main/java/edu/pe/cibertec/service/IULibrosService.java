package edu.pe.cibertec.service;

import java.util.List;
import java.util.Optional;

import edu.pe.cibertec.model.Libros;

public interface IULibrosService {
	public List<Libros> listarLibros();
	public Libros guardarLibros(Libros libros); 
	public Optional<Libros> buscarLibros(int codigo);
	public void eliminarLibros(int codigo);

}
