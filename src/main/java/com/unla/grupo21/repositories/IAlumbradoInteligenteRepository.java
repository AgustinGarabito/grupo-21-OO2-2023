package com.unla.grupo21.repositories;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.unla.grupo21.entities.AlumbradoInteligente;


public interface IAlumbradoInteligenteRepository extends JpaRepository<AlumbradoInteligente, Serializable>{
	
	public abstract AlumbradoInteligente findById(int id);

	//public abstract AlumbradoInteligente findByNombre(String nombre);
	
	public abstract List<AlumbradoInteligente> findByNombre(String nombre);
	
	
	
}
