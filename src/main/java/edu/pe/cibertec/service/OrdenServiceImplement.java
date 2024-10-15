package edu.pe.cibertec.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.pe.cibertec.model.Ordenes;
import edu.pe.cibertec.repository.IUOrdenRepository;

@Service
public class OrdenServiceImplement implements IUOrdenesService{

	@Autowired
	private IUOrdenRepository repositorio;

	@Override
	public List<Ordenes> listarOrden() {
		return repositorio.findAll();
	}

	@Override
	public Ordenes guardarOrden(Ordenes orden) {
		return repositorio.save(orden);
	}

	@Override
	public Optional<Ordenes> buscarOrden(int codigo) {
		return repositorio.findById(codigo);

	}

	@Override
	public void eliminarOrden(int codigo) {
		repositorio.deleteById(codigo);
		
	}

	
}
