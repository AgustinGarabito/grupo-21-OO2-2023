package com.unla.grupo21OO22023.services;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import com.unla.grupo21OO22023.entities.DispositivoIOT;
import com.unla.grupo21OO22023.entities.Evento;
import com.unla.grupo21OO22023.models.EventoModel;

public interface IEventoService {

	public List<Evento> getAll();

	public abstract List<Evento> findByDispositivo(DispositivoIOT dispositivo);
	
	public Evento findByDescripcion(String descripcion);

	public Evento findByFechaAndHora(LocalDate fecha, LocalTime hora);
	
	public EventoModel insertOrUpdate(Evento evento);
}