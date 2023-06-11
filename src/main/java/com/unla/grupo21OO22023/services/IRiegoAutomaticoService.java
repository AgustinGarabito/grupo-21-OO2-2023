package com.unla.grupo21OO22023.services;

import java.util.List;

import com.unla.grupo21OO22023.entities.RiegoAutomatico;
import com.unla.grupo21OO22023.models.RiegoModel;

public interface IRiegoAutomaticoService {

	public List<RiegoAutomatico> getAll();

	public RiegoAutomatico findById(int id);

	public RiegoAutomatico findByNombre(String name);

	public RiegoModel insertOrUpdate(RiegoAutomatico riego);

}
