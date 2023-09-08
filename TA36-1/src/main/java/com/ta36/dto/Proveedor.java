package com.ta36.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "proveedor")

public class Proveedor {
	
	@Id
	@Column(name = "id", length = 4)
	private String id;
	
	@Column(name = "nombre")
	private String nombre;
	
	@OneToMany(mappedBy = "proveedor", fetch = FetchType.LAZY)
	private List<Suministra> suministra;
	
public Proveedor() {
		
	}

	public Proveedor(String id, String nombre) {
		this.id = id;
		this.nombre = nombre;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setPiezaProveedor(List<Suministra> suministra) {
		this.suministra = suministra;
	}

	@Override
	public String toString() {
		return "Proveedor [id=" + id + ", nombre=" + nombre + "]";
	}

}
