package com.unla.grupo21OO22023.repositories;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.unla.grupo21OO22023.entities.DispositivoIOT;

@Repository("dispositivoRepository")
public interface IDispositivoIOTRepository extends JpaRepository<DispositivoIOT, Serializable>{

	public abstract DispositivoIOT findById(int id);
	
	public abstract DispositivoIOT findByNombre(String nombre);
}
