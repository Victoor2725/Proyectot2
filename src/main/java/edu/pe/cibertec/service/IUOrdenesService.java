package edu.pe.cibertec.service;

import java.util.List;
import java.util.Optional;

import edu.pe.cibertec.model.Ordenes;

public interface IUOrdenesService {
	public List<Ordenes> listarOrden();
	public Ordenes guardarOrden(Ordenes ordenes); 
	public Optional<Ordenes> buscarOrden(int codigo);
	public void eliminarOrden(int codigo);
}
