package com.unla.grupo21OO22023.repositories;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.unla.grupo21OO22023.entities.AlumbradoInteligente;
import com.unla.grupo21OO22023.entities.DispositivoIOT;

@Repository("dispositivoRepository")
public interface IDispositivoIOTRepository extends JpaRepository<DispositivoIOT, Serializable>{

	public abstract DispositivoIOT findById(int id);
	
	public abstract DispositivoIOT findByNombre(String nombre);
	
	@Query("SELECT a FROM AlumbradoInteligente a")
	public abstract List<AlumbradoInteligente> listAll();
	
	
}
