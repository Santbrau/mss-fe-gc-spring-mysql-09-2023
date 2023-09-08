package com.ta36.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ta36.dao.ICientificoDAO;
import com.ta36.dto.Cientifico;

@Service
public class CientificoServiceImpl implements ICientificosService {

	@Autowired
	ICientificoDAO iCientificoDAO;

	@Override
	public List<Cientifico> listarCientificos() {
		
		return iCientificoDAO.findAll();
	}

	@Override
	public Cientifico buscarCientificoPorDni(String dni) {
		
		return iCientificoDAO.findById(dni).get();
	}

	@Override
	public Cientifico guardarCientifico(Cientifico cientifico) {
		
		return iCientificoDAO.save(cientifico);
	}

	@Override
	public Cientifico actualizarCientifico(Cientifico cientifico) {
		
		return iCientificoDAO.save(cientifico);
	}

	@Override
	public void eliminarCientifico(String dni) {
		
		iCientificoDAO.deleteById(dni);
	}
}
