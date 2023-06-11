package com.unla.grupo21OO22023.services.implementation;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.unla.grupo21OO22023.entities.DispositivoIOT;
import com.unla.grupo21OO22023.entities.Evento;
import com.unla.grupo21OO22023.models.EventoModel;
import com.unla.grupo21OO22023.repositories.IEventoRepository;
import com.unla.grupo21OO22023.services.IEventoService;

@Service ("eventoService")
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
	public Evento findByDescripcion(String descripcion) {
		return eventoRepository.findByDescripcion(descripcion);
	}

	@Override
	public Evento findByFechaAndHora(LocalDate fecha, LocalTime hora) {
		return eventoRepository.findByFechaAndHora(fecha, hora);
	}

	@Override
	public List<Evento> findByDispositivo(DispositivoIOT dispositivo) {
		return eventoRepository.findByDispositivo(dispositivo);
	}

	@Override
	public EventoModel insertOrUpdate(Evento evento) {
		Evento eventoNew = eventoRepository.save(evento);
		return modelMapper.map(eventoNew, EventoModel.class);
	}
	

}
