package com.unla.grupo21OO22023.services.implementation;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.ArrayList;
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

	@Override
	public List<Evento> listAll(String filtro) {
		if(filtro != null) {
			List<Evento> listAux2 = eventoRepository.findAll(filtro);
			return findActivos(listAux2);
		}
		List<Evento> listAux = eventoRepository.findAll();
		return findActivos(listAux);
	}

	@Override
	public List<Evento> findActivos(List<Evento> listAux) {
		List<Evento> list = new ArrayList<Evento>();
		
		for(Evento e : listAux) {
			if(e.getDispositivo().isActivo()) {
				list.add(e);
			}
		}
		
		return list;
	}
	

}
