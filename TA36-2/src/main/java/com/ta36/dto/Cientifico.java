package com.ta36.dto;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "cientificos")
public class Cientifico {

	
	@Id
	@Column(name = "dni", length=8)
	private String dni;

	@Column(name = "nom_apels")
	private String nomApels;

	@OneToMany(mappedBy = "cientifico", fetch = FetchType.LAZY)
	private List<Asignacion> asignacion;

	
	public Cientifico() {
		super();
	}

	public Cientifico(String dni, String nomApels) {
		this.dni = dni;
		this.nomApels = nomApels;
	}


	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNomApels() {
		return nomApels;
	}

	public void setNomApels(String nomApels) {
		this.nomApels = nomApels;
	}

	
	public List<Asignacion> getAsignacion() {
		return asignacion;
	}

	public void setAsignacion(List<Asignacion> asignacion) {
		this.asignacion = asignacion;
	}

	@Override
	public String toString() {
		return "Cientifico [dni=" + dni + ", nomApels=" + nomApels + "]";
	}
}
