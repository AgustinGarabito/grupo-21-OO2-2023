package com.unla.grupo21.services;

import java.util.List;

import com.unla.grupo21.entities.Evento;
import com.unla.grupo21.models.EventoModel;


public interface IEventoService {
	
	public List<Evento> getAll();
	
	public Evento findById(int id);


	public EventoModel insertOrUpdate(Evento evento);

	public boolean remove(int id);
	
	

}
