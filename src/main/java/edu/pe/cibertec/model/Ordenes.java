package edu.pe.cibertec.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Tbl_Ordenes")
public class Ordenes {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int OrdenID;
	
	@Column(name = "Cliente_ID")
	private String ClienteID;
	
	@Column(name = "Libro_ID")
	private int LibroID;
	
	@Column(name = "Fecha_Orden")
	private String Fecha_de_Orden;
	
	public Ordenes() {
		super();
	}
	
	public Ordenes(int ordenID, String clienteID, int libroID, String fecha_de_Orden) {
		super();
		OrdenID = ordenID;
		ClienteID = clienteID;
		LibroID = libroID;
		Fecha_de_Orden = fecha_de_Orden;
	}

	public Ordenes(String clienteID, int libroID, String fecha_de_Orden) {
		super();
		ClienteID = clienteID;
		LibroID = libroID;
		Fecha_de_Orden = fecha_de_Orden;
	}

	public int getOrdenID() {
		return OrdenID;
	}

	public void setOrdenID(int ordenID) {
		OrdenID = ordenID;
	}

	public String getClienteID() {
		return ClienteID;
	}

	public void setClienteID(String clienteID) {
		ClienteID = clienteID;
	}

	public int getLibroID() {
		return LibroID;
	}

	public void setLibroID(int libroID) {
		LibroID = libroID;
	}

	public String getFecha_de_Orden() {
		return Fecha_de_Orden;
	}

	public void setFecha_de_Orden(String fecha_de_Orden) {
		Fecha_de_Orden = fecha_de_Orden;
	}


	
}
