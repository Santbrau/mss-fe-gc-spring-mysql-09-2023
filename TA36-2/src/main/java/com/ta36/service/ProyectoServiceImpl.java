package com.ta36.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ta36.dao.IProyectoDAO;
import com.ta36.dto.Proyecto;

@Service
public class ProyectoServiceImpl implements IProyectoService {

	@Autowired
	IProyectoDAO iProyectoDAO;

	@Override
	public List<Proyecto> listarProyectos() {
		
		return iProyectoDAO.findAll();
	}

	@Override
	public Proyecto buscarProyectoPorId(String id) {
		
		return iProyectoDAO.findById(id).get();
	}

	@Override
	public Proyecto guardarProyecto(Proyecto proyecto) {
		
		return iProyectoDAO.save(proyecto);
	}

	@Override
	public Proyecto actualizarProyecto(Proyecto proyecto) {
		
		return iProyectoDAO.save(proyecto);
	}

	@Override
	public void eliminarProyecto(String id) {
		
		iProyectoDAO.deleteById(id);
	}
}
