package com.unla.grupo21.repositories;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.unla.grupo21.entities.Evento;
import com.unla.grupo21.entities.Medicion;
import com.unla.grupo21.entities.MedicionAlumbrado;

@Repository("medicionRepository")
public interface IMedicionRepository extends JpaRepository<Medicion, Serializable> {
	
	public abstract Medicion findById(int id);
	





}
