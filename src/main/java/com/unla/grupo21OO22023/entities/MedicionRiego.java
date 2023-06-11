package com.unla.grupo21OO22023.entities;

import java.time.LocalDate;
import java.time.LocalTime;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class MedicionRiego extends Medicion{

	// ATRIBUTOS
	private float humedadActual;

	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="riego_automatico_id")
	private RiegoAutomatico riego;
	
	// CONSTRUCTOR
	public MedicionRiego() {
		
	}

	public MedicionRiego(int id, RiegoAutomatico riego, LocalTime hora, LocalDate fecha, float humedadActual) {
		super(id, hora, fecha);
		this.humedadActual = humedadActual;
		this.riego = riego;
	}

	// GET AND SET
	public float getHumedadActual() {
		return humedadActual;
	}

	public void setHumedadActual(float humedadActual) {
		this.humedadActual = humedadActual;
	}
	
	public RiegoAutomatico getRiego() {
		return riego;
	}

	public void setRiego(RiegoAutomatico riego) {
		this.riego = riego;
	}

	// EVENTO
	public Evento generarEvento() {
		int var = riego.verificarEvento(humedadActual);
		Evento e = new Evento();
		if(var == 1) {
			e.setDescripcion("Se activo el riego");
			e.setDispositivo(riego);
			e.setFecha(getFecha());
			e.setHora(getHora());
		} else  if(var == 2){
			e.setDescripcion("Se llamo a mantenimiento");
			e.setDispositivo(riego);
			e.setFecha(getFecha());
			e.setHora(getHora());
		}
		
		return e;
	}
	
}
