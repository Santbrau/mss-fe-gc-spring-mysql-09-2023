package com.ta36.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "piezas")

public class Pieza {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "codigo")
	private int codigo;

	@Column(name = "nombre")
	private String nombre;
	
	@OneToMany(mappedBy = "pieza", fetch = FetchType.LAZY)
	private List<Suministra> piezaProveedor;
	
	public Pieza() {

	}

	public Pieza(int codigo, String nombre) {
		this.codigo = codigo;
		this.nombre = nombre;
	}
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	public void setPiezaProveedor(List<Suministra> piezaProveedor) {
		this.piezaProveedor = piezaProveedor;
	}

	@Override
	public String toString() {
		return "Pieza [codigo=" + codigo + ", nombre=" + nombre + "]";
	}

}
