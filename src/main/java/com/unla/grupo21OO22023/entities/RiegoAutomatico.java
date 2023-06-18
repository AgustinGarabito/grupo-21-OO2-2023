package com.unla.grupo21OO22023.entities;

import jakarta.persistence.Entity;

@Entity
public class RiegoAutomatico extends DispositivoIOT {

	// ATRIBUTOS
	private float humedadMinima;
	private float humedadMaxima;

	// CONSTRUCTOR
	public RiegoAutomatico() {

	}

	public RiegoAutomatico(int id, String nombre, int nroSector, float humedadMinima, float humedadMaxima, boolean deleted) {
		super(id, nombre, nroSector, deleted);
		this.humedadMinima = humedadMinima;
		this.humedadMaxima = humedadMaxima;
	}

	// GET AND SET
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
	
	// SINCRONIZAR EVENTOS
	public int verificarEvento(float valor) {
		// 0 NO GENERA EVENTO
		// 1 PRENDE REGADOR
		// 2 LLAMA MANTENIMIENTO
		
		int retorno = 0;
		
		if(valor< humedadMinima) {
			retorno = 1;
		} else if(valor > humedadMaxima){
			retorno = 2;
		}
		
		return retorno;
	}
}
