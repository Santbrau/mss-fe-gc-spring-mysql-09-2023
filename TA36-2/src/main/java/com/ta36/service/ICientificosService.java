package com.ta36.service;

import java.util.List;

import com.ta36.dto.Cientifico;

public interface ICientificosService {

	public List<Cientifico> listarCientificos();

	public Cientifico buscarCientificoPorDni(String dni);

	public Cientifico guardarCientifico(Cientifico cientifico);

	public Cientifico actualizarCientifico(Cientifico cientifico);

	public void eliminarCientifico(String dni);
}