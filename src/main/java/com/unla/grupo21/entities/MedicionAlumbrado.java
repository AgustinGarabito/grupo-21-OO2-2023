package com.unla.grupo21.entities;

import java.time.LocalDate;
import java.time.LocalTime;

import jakarta.persistence.Entity;

@Entity
public class MedicionAlumbrado extends Medicion{
	
	private int medicionSensor;
	private boolean sensorMovimiento;
	
	public MedicionAlumbrado() {
	}

	public MedicionAlumbrado(int id, DispositivoIOT dispositivoIOT, LocalDate fecha, LocalTime hora,int medicionSensor, boolean sensorMovimiento) {
		super( id,  dispositivoIOT,  fecha,  hora);
		this.medicionSensor = medicionSensor;
		this.sensorMovimiento = sensorMovimiento;
	}

	public int getMedicionSensor() {
		return medicionSensor;
	}

	public void setMedicionSensor(int medicionSensor) {
		this.medicionSensor = medicionSensor;
	}

	public boolean isSensorMovimiento() {
		return sensorMovimiento;
	}

	public void setSensorMovimiento(boolean sensorMovimiento) {
		this.sensorMovimiento = sensorMovimiento;
	}
	
	

}
