package com.ta36.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ta36.dto.Pieza;
import com.ta36.dao.IPiezasDAO;

public class PiezaServiceImpl implements IPiezaService {

	@Autowired
	IPiezasDAO iPiezaDAO;

	@Override
	public List<Pieza> listarPiezas() {
		
		return iPiezaDAO.findAll();
	}

	@Override
	public Pieza buscarPiezaPorCodigo(int codigo) {
		
		return iPiezaDAO.findById(codigo).get();
	}

	@Override
	public Pieza guardarPieza(Pieza pieza) {
		
		return iPiezaDAO.save(pieza);
	}

	@Override
	public Pieza actualizarPieza(Pieza pieza) {
		
		return iPiezaDAO.save(pieza);
	}

	@Override
	public void eliminarPieza(int codigo) {
		
		iPiezaDAO.deleteById(codigo);
	}
}
