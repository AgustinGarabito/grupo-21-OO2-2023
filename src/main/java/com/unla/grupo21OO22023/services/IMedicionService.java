package com.unla.grupo21OO22023.services;

import java.util.List;

import com.unla.grupo21OO22023.entities.Medicion;

public interface IMedicionService {

	public List<Medicion> getAll();

	public Medicion findById(int id);

	public Medicion insertOrUpdate(Medicion medicion);
}
