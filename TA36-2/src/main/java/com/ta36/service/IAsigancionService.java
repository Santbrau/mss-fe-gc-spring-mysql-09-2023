package com.ta36.service;

import java.util.List;

import com.ta36.dto.Asignacion;

public interface IAsigancionService {

	public List<Asignacion> listarAsignaciones();

	public Asignacion buscarAsignacionPorId(int id);

	public Asignacion guardarAsignacion(Asignacion asignacion);

	public Asignacion actualizarAsignacion(Asignacion asignacion);

	public void eliminarAsignacion(int id);
}
