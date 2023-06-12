package com.unla.grupo21.models;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;

public class DispositivoIOTModel {
	
	private int id;
	
	private String nombre;

	private int nroSector;
	
	private int medicionSensor;
	
	private boolean deleted;
	
	public DispositivoIOTModel() {}

	
	public DispositivoIOTModel(int id, String nombre, int nroSector, int medicionSensor, boolean deleted) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.nroSector = nroSector;
		this.medicionSensor = medicionSensor;
		this.deleted = deleted;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
	
	
	public int getMedicionSensor() {
		return medicionSensor;
	}


	public void setMedicionSensor(int medicionSensor) {
		this.medicionSensor = medicionSensor;
	}


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNroSector() {
		return nroSector;
	}

	public void setNroSector(int nroSector) {
		this.nroSector = nroSector;
	}

	public boolean isDeleted() {
		return deleted;
	}

	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}

	

}
