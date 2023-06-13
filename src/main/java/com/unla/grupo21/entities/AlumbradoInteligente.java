package com.unla.grupo21.entities;


import jakarta.persistence.Entity;


@Entity
public class AlumbradoInteligente extends DispositivoIOT{
	
	private int valorMinimo;
	private int valorMaximo;
	
	
	public AlumbradoInteligente() {}

	public AlumbradoInteligente(int id, String nombre, int nroSector, boolean deleted, int valorMinimo, int valorMaximo) {
		super( id,  nombre,  nroSector,deleted);
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

	
	public boolean prenderAlumbrado(int valorMaximo) {
		boolean resultado = false;
		if(this.valorMaximo >= 50) {
			resultado = true;
		}
		return resultado;
	}
	
	public boolean apagarAlumbrado(int valorMinimo) {
		boolean resultado = false;
		if(this.valorMinimo <= 20) {
			resultado = true;
		}
		return resultado;
	}

}
