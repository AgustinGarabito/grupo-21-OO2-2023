package com.unla.grupo21OO22023.repositories;

import org.springframework.stereotype.Repository;

import com.unla.grupo21OO22023.entities.RiegoAutomatico;

import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository("riegoRepository")
public interface IRiegoAutomaticoRepository extends JpaRepository<RiegoAutomatico, Serializable>{

	public abstract RiegoAutomatico findById(int id);
	
	public abstract RiegoAutomatico findByNombre(String nombre);
}
