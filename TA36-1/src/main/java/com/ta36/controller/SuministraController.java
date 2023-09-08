package com.ta36.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ta36.dto.Suministra;
import com.ta36.service.SuministraServiceImpl;


@RestController
public class SuministraController {
	
	@Autowired
	SuministraServiceImpl suministraServiceImpl;
	
	@GetMapping("/suministra")
	public List<Suministra> listarSuministra() {
		
		return suministraServiceImpl.listarSuministra();
	}
	
	@GetMapping("/suministra/{id}")
	public Suministra buscarSuministraPorId(@PathVariable(name = "id") int id) {
		
		return suministraServiceImpl.buscarSuministraPorId(id);
	}
	
	@PostMapping("/suministra")
	public Suministra guardarSuministra(@RequestBody Suministra suministra) {
		
		return suministraServiceImpl.guardarSuministra(suministra);
	}
	
	@PutMapping("/suministra/{id}")
	public Suministra actualizarSuministra(@PathVariable(name = "id") int id, @RequestBody Suministra suministra) {
		
		Suministra suministraSeleccionado = new Suministra();
		Suministra suministraActualizado = new Suministra();
		
		suministraSeleccionado = suministraServiceImpl.buscarSuministraPorId(id);
		
		suministraSeleccionado.setPieza(suministra.getPieza());
		suministraSeleccionado.setProveedor(suministra.getProveedor());
		suministraSeleccionado.setPrecio(suministra.getPrecio());
		
		suministraActualizado = suministraServiceImpl.actualizarSuministra(suministraSeleccionado);
		
		return suministraActualizado;
	}
	
	@DeleteMapping("/piezasproveedores/{id}")
	public void eliminarSuministra(@PathVariable(name = "id") int id) {
		
		suministraServiceImpl.eliminarSuministra(id);
	}

}
