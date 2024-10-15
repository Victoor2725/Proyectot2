package edu.pe.cibertec.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.pe.cibertec.model.Libros;
import edu.pe.cibertec.repository.IULibrosRepository;

@Service
public class LibrosServiceImplement implements IULibrosService{

	@Autowired
	private IULibrosRepository repositorio;

	@Override
	public List<Libros> listarLibros() {
		return repositorio.findAll();
	}

	@Override
	public Libros guardarLibros(Libros libro) {
		return repositorio.save(libro);
	}

	@Override
	public Optional<Libros> buscarLibros(int codigo) {
		return repositorio.findById(codigo);
	}

	@Override
	public void eliminarLibros(int codigo) {
		repositorio.deleteById(codigo);
	}
}
