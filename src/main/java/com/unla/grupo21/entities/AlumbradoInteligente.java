package com.unla.grupo21.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;

@Entity
public class AlumbradoInteligente extends DispositivoIOT{
	
	private int valorMinimo;
	private int valorMaximo;
	private boolean sensorMovimiento;
	private int medicionSensor;
	
	public AlumbradoInteligente() {
	}

	public AlumbradoInteligente(int id, String nombre, int nroSector, boolean activo,int valorMinimo, int valorMaximo, boolean sensorMovimiento,
			int medicionSensor) {
		super( id,  nombre,  nroSector,  activo);
		this.valorMinimo = valorMinimo;
		this.valorMaximo = valorMaximo;
		this.sensorMovimiento = sensorMovimiento;
		this.medicionSensor = medicionSensor;
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

	public int getMedicionSensor() {
		return medicionSensor;
	}

	public void setMedicionSensor(int medicionSensor) {
		this.medicionSensor = medicionSensor;
	}
	
	

}
