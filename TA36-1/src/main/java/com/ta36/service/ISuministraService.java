package com.ta36.service;

import java.util.List;

import com.ta36.dto.Suministra;

public interface ISuministraService {

	public List<Suministra> listarSuministra();

	public Suministra buscarSuministraPorId(int id);

	public Suministra guardarSuministra(Suministra suministra);

	public Suministra actualizarSuministra(Suministra suministra);

	public void eliminarSuministra(int id);
}
