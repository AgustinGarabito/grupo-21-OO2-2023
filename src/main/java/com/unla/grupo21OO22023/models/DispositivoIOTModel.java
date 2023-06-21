package com.unla.grupo21OO22023.models;

public class DispositivoIOTModel {
	
private int id;
	
	private String nombre;

	private int nroSector;
	
	
	private boolean deleted;
	
	public DispositivoIOTModel() {}

	
	public DispositivoIOTModel(int id, String nombre, int nroSector, boolean deleted) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.nroSector = nroSector;
		this.deleted = deleted;
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

	public boolean isDeleted() {
		return deleted;
	}

	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}


}
