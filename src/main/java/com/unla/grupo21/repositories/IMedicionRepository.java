package com.unla.grupo21.repositories;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.unla.grupo21.entities.Medicion;


@Repository("medicionRepository")
public interface IMedicionRepository extends JpaRepository<Medicion, Serializable> {
	
	public abstract Medicion findById(int id);
	





}
