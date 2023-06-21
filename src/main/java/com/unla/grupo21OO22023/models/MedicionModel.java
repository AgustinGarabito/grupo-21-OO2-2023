package com.unla.grupo21OO22023.models;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.format.annotation.DateTimeFormat;

import com.unla.grupo21OO22023.entities.DispositivoIOT;

public class MedicionModel {

	private int id;

	private DispositivoIOT dispositivoIOT;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate fecha;

	private LocalTime hora;

	public MedicionModel() {
	}

	public MedicionModel(int id, DispositivoIOT dispositivoIOT, LocalDate fecha, LocalTime hora) {
		super();
		this.id = id;
		this.dispositivoIOT = dispositivoIOT;
		this.fecha = fecha;
		this.hora = hora;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public DispositivoIOT getDispositivoIOT() {
		return dispositivoIOT;
	}

	public void setDispositivoIOT(DispositivoIOT dispositivoIOT) {
		this.dispositivoIOT = dispositivoIOT;
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
