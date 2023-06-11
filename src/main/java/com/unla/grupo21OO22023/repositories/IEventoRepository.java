package com.unla.grupo21OO22023.repositories;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.unla.grupo21OO22023.entities.DispositivoIOT;
import com.unla.grupo21OO22023.entities.Evento;

@Repository("eventoRepository")
public interface IEventoRepository extends JpaRepository<Evento, Serializable>{
	
	public abstract List<Evento> findByDispositivo(DispositivoIOT dispositivo);
	
	public abstract Evento findByDescripcion(String descripcion);

	public abstract Evento findByFechaAndHora(LocalDate fecha, LocalTime hora);

	
}
