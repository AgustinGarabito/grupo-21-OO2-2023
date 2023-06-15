package com.unla.grupo21OO22023.models;

import java.time.LocalDate;
import java.time.LocalTime;

import com.unla.grupo21OO22023.entities.DispositivoIOT;

public class EventoModel {
	
	private int id;
	private String descripcion;
	private DispositivoIOT dispositivo;
	private LocalDate fecha;
	private LocalTime hora;
	
	public EventoModel() {
		
	}
	
	public EventoModel(int id, String descripcion, DispositivoIOT dispositivo, LocalDate fecha, LocalTime hora) {
		super();
		this.id = id;
		this.descripcion = descripcion;
		this.dispositivo = dispositivo;
		this.fecha = fecha;
		this.hora = hora;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public DispositivoIOT getDispositivo() {
		return dispositivo;
	}

	public void setDispositivo(DispositivoIOT dispositivo) {
		this.dispositivo = dispositivo;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public LocalTime getHora() {
		return hora;
	}

	public void setHora(LocalTime hora) {
		this.hora = hora;
	}
	
	
	

}
