package com.unla.grupo21OO22023.services;

import java.util.List;

import com.unla.grupo21OO22023.entities.Medicion;
import com.unla.grupo21OO22023.entities.MedicionAlumbrado;

public interface IMedicionService {

	public List<Medicion> getAll();

	public Medicion findById(int id);

	public Medicion insertOrUpdate(Medicion medicion);

	//////////////////
	public List<Medicion> listAll(String palabraClave);
	
	////////////
	public List<MedicionAlumbrado> listAll();
}
