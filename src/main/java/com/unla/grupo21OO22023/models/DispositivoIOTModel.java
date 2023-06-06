package com.unla.grupo21OO22023.models;

public class DispositivoIOTModel {

	// ATRIBUTOS
	private int idDispositivo;
	private String nombre;
	private int nroSector;
	private boolean activo;
	
	// CONSTRUCTOR
	public DispositivoIOTModel() {
		
	}
	
	public DispositivoIOTModel(String nombre, int nroSector) {
		super();
		this.nombre = nombre;
		this.nroSector = nroSector;
		this.activo = false;
	}

	// GET AND SET
	public int getIdDispositivo() {
		return idDispositivo;
	}

	protected void setIdDispositivo(int idDispositivo) {
		this.idDispositivo = idDispositivo;
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
