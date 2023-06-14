package com.unla.grupo21.entities;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Medicion {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected int id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="dispositivoIOT_id", nullable=true)
	protected DispositivoIOT dispositivoIOT;
	protected LocalDate fecha;
	protected LocalTime hora;
	
	@CreationTimestamp
	private LocalDateTime createdAt;

	@UpdateTimestamp
	private LocalDateTime updatedAt;
	
	public Medicion() {}
	
	public Medicion(int id, DispositivoIOT dispositivoIOT, LocalDate fecha, LocalTime hora) {
		this.id = id;
		this.dispositivoIOT = dispositivoIOT;
		this.fecha = fecha;
		this.hora = hora;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public DispositivoIOT getDispositivoIOT() {
		return dispositivoIOT;
	}
	
	public void setDispositivoIOT(DispositivoIOT dispositivoIOT) {
		this.dispositivoIOT = dispositivoIOT;
	}
	
	public LocalDate getFecha() {
		return fecha;
	}
	
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public LocalTime getHora() {
		return hora;
	}
	
	public void setHora(LocalTime hora) {
		this.hora = hora;
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


	public abstract Evento medicionDispositivoIOT();
	

}
