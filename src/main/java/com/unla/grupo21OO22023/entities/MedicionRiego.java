package com.unla.grupo21OO22023.entities;

import java.time.LocalDate;
import java.time.LocalTime;
import jakarta.persistence.Entity;

@Entity
public class MedicionRiego extends Medicion{

	// ATRIBUTOS
	private float humedadActual;

	//@ManyToOne(fetch = FetchType.LAZY)
    //@JoinColumn(name="riego_automatico_id")
	//private RiegoAutomatico riego;
	
	// CONSTRUCTOR
	public MedicionRiego() {
		
	}

	public MedicionRiego(int id, DispositivoIOT dispositivoIOT, LocalTime hora, LocalDate fecha, float humedadActual) {
		super(id, hora, fecha, dispositivoIOT);
		this.humedadActual = humedadActual;
		//this.riego = riego;
	}

	// GET AND SET
	public float getHumedadActual() {
		return humedadActual;
	}

	public void setHumedadActual(float humedadActual) {
		this.humedadActual = humedadActual;
	}
	
	//public RiegoAutomatico getRiego() {
	//	return riego;
	//}

	//public void setRiego(RiegoAutomatico riego) {
	//	this.riego = riego;
	//}

	// EVENTO
	public Evento generarEvento() {
		Evento e = new Evento();
		
		if(getDispositivoIOT() instanceof RiegoAutomatico) {
			RiegoAutomatico riego = (RiegoAutomatico) getDispositivoIOT();
			int var = riego.verificarEvento(humedadActual);
			
			if(var == 1) {
				e.setDescripcion("Se activo el riego");
				e.setDispositivoIOT(riego);
				e.setFecha(LocalDate.now());
				e.setHora(LocalTime.now());
			} else  if(var == 2){
				e.setDescripcion("Se llamo a mantenimiento");
				e.setDispositivoIOT(riego);
				e.setFecha(LocalDate.now());
				e.setHora(LocalTime.now());
			}
		}
		return e;
	}
	
	public  Evento medicionDispositivoIOT() {
		Evento evento = new Evento();
		return evento;
	}
	
}
