package com.ta36.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ta36.dto.Proyecto;


public interface IProyectoDAO extends JpaRepository<Proyecto, String> {

}
