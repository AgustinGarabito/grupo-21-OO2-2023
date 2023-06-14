package com.unla.grupo21.entities;


import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Entity;


@Entity
public class AlumbradoInteligente extends DispositivoIOT{
	
	private int valorMinimo;
	private int valorMaximo;
	
	@CreationTimestamp
	private LocalDateTime createdAt;

	@UpdateTimestamp
	private LocalDateTime updatedAt;
	
	
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
	
	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(LocalDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}

	public boolean prenderAlumbrado(int valorMaximo) {
		boolean resultado = false;
		if(valorMaximo >= this.valorMaximo) {
			resultado = true;
		}
		return resultado;
	}
	
	public boolean apagarAlumbrado(int valorMinimo) {
		boolean resultado = false;
		if(valorMinimo <= this.valorMinimo) {
			resultado = true;
		}
		return resultado;
	}

}
