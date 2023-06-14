package com.unla.grupo21.services;

import java.util.List;

import com.unla.grupo21.entities.DispositivoIOT;
import com.unla.grupo21.models.DispositivoIOTModel;


public interface IDispositivoIOTService {
	
	
	public List<DispositivoIOT> getAll();	

	public DispositivoIOT findById(int id);

	public DispositivoIOTModel findByNombre(String nombre);

	public DispositivoIOTModel insertOrUpdate(DispositivoIOT dispositivoIOT);

	public boolean remove(int id);


	
	
	
	
	
	

}