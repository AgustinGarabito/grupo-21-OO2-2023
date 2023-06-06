package com.unla.grupo21OO22023.entities;

import jakarta.persistence.Entity;

@Entity
public class RiegoAutomatico extends DispositivoIOT{
	
	// ATRIBUTOS
	private float humedadMinima;
	private float medicionActual;
	
	// CONSTRUCTOR
	public RiegoAutomatico() {
		
	}

	public RiegoAutomatico(String nombre, int nroSector, float humedadMinima) {
		super(nombre, nroSector);
		this.humedadMinima = humedadMinima;
		this.medicionActual = 0;
	}

	// GET AND SET
	public float getHumedadMinima() {
		return humedadMinima;
	}

	public void setHumedadMinima(float humedadMinima) {
		this.humedadMinima = humedadMinima;
	}

	public float getMedicionActual() {
		return medicionActual;
	}

	public void setMedicionActual(float medicionActual) {
		this.medicionActual = medicionActual;
	}
	
	
}
