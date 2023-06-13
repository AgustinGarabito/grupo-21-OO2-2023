package com.unla.grupo21.services;

import java.util.List;

import com.unla.grupo21.entities.Medicion;


public interface IMedicionService {
	
	public List<Medicion> getAll();	

	public Medicion findById(int id);
	
	
///////////////////
public List<Medicion> listAll(String palabraClave);
	
	

}
