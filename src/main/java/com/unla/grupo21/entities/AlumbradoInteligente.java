package com.unla.grupo21.entities;


import jakarta.persistence.Entity;


@Entity
public class AlumbradoInteligente extends DispositivoIOT{
	
	private int valorMinimo;
	private int valorMaximo;
	
	
	public AlumbradoInteligente() {}

	public AlumbradoInteligente(int id, String nombre, int nroSector, int medicionSensor, boolean deleted, int valorMinimo, int valorMaximo) {
		super( id,  nombre,  nroSector,  medicionSensor,deleted);
		this.valorMinimo = valorMinimo;
		this.valorMaximo = valorMaximo;
	}

	public int getValorMinimo() {
		return valorMinimo;
	}

	public void setValorMinimo(int valorMinimo) {
		this.valorMinimo = valorMinimo;
	}

	public int getValorMaximo() {
		return valorMaximo;
	}

	public void setValorMaximo(int valorMaximo) {
		this.valorMaximo = valorMaximo;
	}

	
	
	

}
