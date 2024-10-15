package edu.pe.cibertec.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import edu.pe.cibertec.model.Ordenes;
import edu.pe.cibertec.service.IUOrdenesService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class OrdenesController {
	@Autowired
	private IUOrdenesService servicio;
	
	@GetMapping({"/indexOrden"})
	public String index() {
		return "index";
	}
	
	@GetMapping({"/listarOrden"})
	public String listarOrden(Model modelo) {
		modelo.addAttribute("ordenes", servicio.listarOrden());
		return "ordenes";
	}
	
	@GetMapping({"/nuevaOrden"})
	public String newOrden(Model modelo) {
		modelo.addAttribute("ordenes", new Ordenes());
		return "formOrden";
	}
	
	@PostMapping({"/saveOrden"})
	public String saveOrden(Ordenes orden) {
		servicio.guardarOrden(orden);
		return "redirect:/listarOrden";
	}
	
	@GetMapping("/editarOrden/{codigo}")
	public String editOrden(@PathVariable int codigo, Model modelo) {
		modelo.addAttribute("ordenes", servicio.buscarOrden(codigo));
		return "formOrden";
		
	}
	
	@GetMapping("/eliminarOrden/{codigo}")
	public String deleteOrden(@PathVariable int codigo) {
		servicio.eliminarOrden(codigo);
		return "redirect:/listarOrden";
	}
	
}
