package com.ta36.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ta36.dao.IProveedoresDAO;
import com.ta36.dto.Proveedor;

@Service
public class ProveedorServiceImpl implements IProveedorService {

	@Autowired
	IProveedoresDAO iProveedorDAO;

	@Override
	public List<Proveedor> listarProveedores() {
		
		return iProveedorDAO.findAll();
	}

	@Override
	public Proveedor buscarProveedorPorId(String id) {
		
		return iProveedorDAO.findById(id).get();
	}

	@Override
	public Proveedor guardarProveedor(Proveedor proveedor) {
		
		return iProveedorDAO.save(proveedor);
	}

	@Override
	public Proveedor actualizarProveedor(Proveedor proveedor) {
		
		return iProveedorDAO.save(proveedor);
	}

	@Override
	public void eliminarProveedor(String id) {
		
		iProveedorDAO.deleteById(id);
	}
}
