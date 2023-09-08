package com.ta36.service;

import java.util.List;

import com.ta36.dto.Pieza;
import com.ta36.dto.Suministra;

public interface IPiezaService {

	public List<Pieza> listarPiezas();
	
	public Pieza buscarPiezaPorCodigo(int codigo);
	
	public Pieza guardarPieza(Pieza pieza);
	
	public Pieza actualizarPieza(Pieza pieza);
	
	public void eliminarPieza(int codigo);
}
