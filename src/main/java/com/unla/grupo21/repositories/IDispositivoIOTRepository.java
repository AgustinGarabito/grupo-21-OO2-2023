package com.unla.grupo21.repositories;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.unla.grupo21.entities.DispositivoIOT;

@Repository("dispositivoIOTRepository")
public interface IDispositivoIOTRepository extends JpaRepository<DispositivoIOT, Serializable> {
	
	public abstract DispositivoIOT findById(int id);

	public abstract DispositivoIOT findByNombre(String nombre);
	
	
	

}
