package com.unla.grupo21.entities;

import java.time.LocalDate;
import java.time.LocalTime;

import jakarta.persistence.Entity;

@Entity
public class MedicionAlumbrado extends Medicion{
	
	private int valorSensor;
	private boolean sensorMovimiento;
	
	public MedicionAlumbrado() {}
	
	public MedicionAlumbrado(int valorSensor, boolean sensorMovimiento) {
		super();
		this.valorSensor = valorSensor;
		this.sensorMovimiento = sensorMovimiento;
	}

	public int getValorSensor() {
		return valorSensor;
	}

	public void setValorSensor(int valorSensor) {
		this.valorSensor = valorSensor;
	}

	public boolean isSensorMovimiento() {
		return sensorMovimiento;
	}

	public void setSensorMovimiento(boolean sensorMovimiento) {
		this.sensorMovimiento = sensorMovimiento;
	}
	
	

}
