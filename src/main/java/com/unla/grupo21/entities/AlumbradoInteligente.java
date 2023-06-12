package com.unla.grupo21.entities;


import jakarta.persistence.Entity;


@Entity
public class AlumbradoInteligente extends DispositivoIOT{
	
	private int valorMinimo;
	private int valorMaximo;
	private boolean sensorMovimiento;
	
	
	public AlumbradoInteligente() {
	}

	public AlumbradoInteligente(int id, String nombre, int nroSector, boolean deleted,int valorMinimo, int valorMaximo, boolean sensorMovimiento,
			int medicionSensor) {
		super( id,  nombre,  nroSector,  medicionSensor,deleted);
		this.valorMinimo = valorMinimo;
		this.valorMaximo = valorMaximo;
		this.sensorMovimiento = sensorMovimiento;
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

	public boolean isSensorMovimiento() {
		return sensorMovimiento;
	}

	public void setSensorMovimiento(boolean sensorMovimiento) {
		this.sensorMovimiento = sensorMovimiento;
	}

	
	

}
