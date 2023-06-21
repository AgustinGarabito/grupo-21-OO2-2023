package com.unla.grupo21OO22023.repositories;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.unla.grupo21OO22023.entities.Medicion;

@Repository("medicionRepository")
public interface IMedicionRepository extends JpaRepository<Medicion, Serializable>{

	public abstract Medicion findById(int id);
	
	///////////////////
	@Query("SELECT m FROM Medicion m INNER JOIN DispositivoIOT d WHERE"
	+ "	CONCAT(m.fecha,m.hora,m.dispositivoIOT.nombre)"
	+ "	LIKE %?1%")
	public List<Medicion> findAll(String palabraClave);
	///////////////////
}
