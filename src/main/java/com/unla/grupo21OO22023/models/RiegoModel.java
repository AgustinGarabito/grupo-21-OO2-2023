package com.unla.grupo21OO22023.models;

public class RiegoModel {

	private int id;
	private String nombre;
	private int nroSector;
	private float humedadMinima;
	private float humedadMaxima;
	private boolean activo;
	
	
	// CONSTRUCTOR
	public RiegoModel() {
		
	}
	
	public RiegoModel(int id, String nombre, int nroSector, float humedadMinima, float humedadMaxima,
			boolean activo) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.nroSector = nroSector;
		this.humedadMinima = humedadMinima;
		this.humedadMaxima = humedadMaxima;
		this.activo = activo;
	}


	// GET AND SET
	public int getId() {
		return id;
	}


	protected void setId(int id) {
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


	public float getHumedadMinima() {
		return humedadMinima;
	}


	public void setHumedadMinima(float humedadMinima) {
		this.humedadMinima = humedadMinima;
	}


	public float getHumedadMaxima() {
		return humedadMaxima;
	}


	public void setHumedadMaxima(float humedadMaxima) {
		this.humedadMaxima = humedadMaxima;
	}


	public boolean isActivo() {
		return activo;
	}


	public void setActivo(boolean activo) {
		this.activo = activo;
	}
	
	
	
	
}
