package com.unla.grupo21.repositories;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.unla.grupo21.entities.Evento;

@Repository("eventoRepository")
public interface IEventoRepository extends JpaRepository<Evento, Serializable>{
	
	public abstract Evento findById(int id);
	
	
	///////////////////
	@Query("SELECT e FROM Evento e INNER JOIN DispositivoIOT d WHERE"
			+ "	CONCAT(e.descripcion,e.fecha,e.hora,e.dispositivoIOT)"
			+ "	LIKE %?1%")
	public List<Evento> findAll(String palabraClave);
	///////////////////
	
}
