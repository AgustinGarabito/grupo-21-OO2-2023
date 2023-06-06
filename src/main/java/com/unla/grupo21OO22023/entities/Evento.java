package com.unla.grupo21OO22023.entities;

import java.time.LocalDate;
import java.time.LocalTime;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Evento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idEvento;
	
	private String descripcion;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="dispositivoIOT_idDispositivo")
	private DispositivoIOT dispositivo;
	
	private LocalDate fecha;
	
	private LocalTime hora;

	public Evento(String descripcion, DispositivoIOT dispositivo, LocalDate fecha, LocalTime hora) {
		this.descripcion = descripcion;
		this.dispositivo = dispositivo;
		this.fecha = fecha;
		this.hora = hora;
	}

	public int getIdEvento() {
		return idEvento;
	}

	protected void setIdEvento(int idEvento) {
		this.idEvento = idEvento;
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
