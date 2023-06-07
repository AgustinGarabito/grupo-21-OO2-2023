package com.unla.grupo21.models;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;

public class DispositivoIOTModel {
	
	private int id;
	
	private String nombre;

	private int nroSector;
	
	private boolean activo;
	
	public DispositivoIOTModel() {}

	public DispositivoIOTModel(int id, String nombre, int nroSector, boolean activo) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.nroSector = nroSector;
		this.activo = activo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	
	
	
	

}
