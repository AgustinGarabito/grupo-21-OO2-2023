package com.unla.grupo21.services;

import java.util.List;

import com.unla.grupo21.entities.Medicion;
import com.unla.grupo21.entities.MedicionAlumbrado;


public interface IMedicionService {
	
	public List<Medicion> getAll();	

	public Medicion findById(int id);
	

	


}
