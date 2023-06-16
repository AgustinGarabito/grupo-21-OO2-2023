package com.unla.grupo21.services.implementation;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.unla.grupo21.entities.Evento;
import com.unla.grupo21.models.EventoModel;
import com.unla.grupo21.repositories.IEventoRepository;
import com.unla.grupo21.services.IEventoService;

@Service("eventoService")
public class EventoService implements IEventoService{
	
	@Autowired
	@Qualifier("eventoRepository")
	private IEventoRepository eventoRepository;

	private ModelMapper modelMapper = new ModelMapper();

	@Override
	public List<Evento> getAll() {
		return eventoRepository.findAll();
	}


	@Override
	public Evento findById(int id) {
		return eventoRepository.findById(id);
	}
	
	
	@Override
	public EventoModel insertOrUpdate(Evento evento) {
		Evento eventoNew = eventoRepository.save(evento);
		return modelMapper.map(eventoNew, EventoModel.class);
	}

	
	@Override
	public boolean remove(int id) {
		try {
			eventoRepository.deleteById(id);
			return true;
		}catch (Exception e) {
			return false;
		}
	}
	
	/////////////////////////
	public List<Evento> listAll(String palabraClave){
		if(palabraClave != null) {
			return eventoRepository.findAll(palabraClave);
		}
		return eventoRepository.findAll();
	}
	////////////////

}
