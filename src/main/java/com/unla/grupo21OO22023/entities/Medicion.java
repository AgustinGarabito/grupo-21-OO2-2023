package com.unla.grupo21OO22023.entities;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
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

	// ATRIBUTOS
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected  int id;
	
	protected  LocalTime hora;
	protected  LocalDate fecha;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="dispositivoiot_id")
	private DispositivoIOT dispositivoIOT;

	@CreationTimestamp
	protected  LocalDateTime createdAt;

	@UpdateTimestamp
	protected  LocalDateTime updatedAt;
	
	// CONSTRUCTOR
	public Medicion() {
		
	}

	public Medicion(int id, LocalTime hora, LocalDate fecha, DispositivoIOT dispositivoIOT) {
		super();
		this.id = id;
		this.hora = hora;
		this.fecha = fecha;
		this.dispositivoIOT = dispositivoIOT;
	}

	// GET AND SET
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public LocalTime getHora() {
		return hora;
	}

	public void setHora(LocalTime hora) {
		this.hora = hora;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public DispositivoIOT getDispositivoIOT() {
		return dispositivoIOT;
	}

	public void setDispositivoIOT(DispositivoIOT dispositivoIOT) {
		this.dispositivoIOT = dispositivoIOT;
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
	
	
}
