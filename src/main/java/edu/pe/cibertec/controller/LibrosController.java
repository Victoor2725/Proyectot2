package edu.pe.cibertec.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import edu.pe.cibertec.model.Libros;
import edu.pe.cibertec.service.IULibrosService;

@Controller
public class LibrosController {
	@Autowired
	private IULibrosService servicio;
	
	@GetMapping({"/indexLibros"})
	public String index() {
		return "index";
	}
	
	@GetMapping({"/listarLibros"})
	public String listarLibros(Model modelo) {
		modelo.addAttribute("libros", servicio.listarLibros());
		return "libros";
	}
	
	@GetMapping({"/nuevoLibro"})
	public String newLibro(Model modelo) {
		modelo.addAttribute("libros", new Libros());
		return "formLibros";
	}
	
	@PostMapping({"/saveLibro"})
	public String saveLibro(Libros libro) {
		servicio.guardarLibros(libro);
		return "redirect:/listarLibros";
	}
	
	@GetMapping("/editarLibro/{codigo}")
	public String editLibro(@PathVariable int codigo, Model modelo) {
		modelo.addAttribute("libros", servicio.buscarLibros(codigo));
		return "formLibros";
		
	}
	
	@GetMapping("/eliminarLibro/{codigo}")
	public String deleteLibro(@PathVariable int codigo) {
		servicio.eliminarLibros(codigo);
		return "redirect:/listarLibros";
	}
	
}
