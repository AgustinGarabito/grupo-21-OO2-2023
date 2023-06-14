package com.unla.grupo21.entities;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Entity;

@Entity
public class MedicionAlumbrado extends Medicion{
	
	private int valorSensor;
	private boolean sensorMovimiento;
	
	@CreationTimestamp
	private LocalDateTime createdAt;

	@UpdateTimestamp
	private LocalDateTime updatedAt;
	
	public MedicionAlumbrado() {}
	
	public MedicionAlumbrado(int id, DispositivoIOT dispositivoIOT, LocalDate fecha, LocalTime hora, int valorSensor, boolean sensorMovimiento) {
		super( id,  dispositivoIOT,  fecha, hora);
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

	public Evento medicionDispositivoIOT() {
		Evento evento = new Evento();
		if(dispositivoIOT.prenderAlumbrado(this.valorSensor) && this.sensorMovimiento==true) {
			evento.setDescripcion("Luz Prendida");
			evento.setDispositivoIOT(getDispositivoIOT());
			evento.setFecha(getFecha());
			evento.setHora(getHora());
		}else if(dispositivoIOT.apagarAlumbrado(this.valorSensor) && this.sensorMovimiento==true) {
			evento.setDescripcion("Luz Apagada");
			evento.setDispositivoIOT(getDispositivoIOT());
			evento.setFecha(getFecha());
			evento.setHora(getHora());
		}
		
		return evento;
	}
	
	
	
	
	

}
