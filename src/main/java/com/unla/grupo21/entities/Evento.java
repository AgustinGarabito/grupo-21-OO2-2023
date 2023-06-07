package com.unla.grupo21.entities;

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
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;


@Entity
public class Evento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String descripcion;
	
	@ManyToOne(fetch = FetchType.LAZY)
	// normalmente nullable es igual a false, en este caso se deja como true porque el ejemplo es simple
	@JoinColumn(name="dispositivoIOT_id", nullable=true)
	private DispositivoIOT dispositivoIOT;
	
	
	private LocalDate fecha;
	private LocalTime hora;
	
	@CreationTimestamp
	private LocalDateTime createdAt;

	@UpdateTimestamp
	private LocalDateTime updatedAt;

	public Evento() {}

	public Evento(int id, String descripcion, DispositivoIOT dispositivoIOT, LocalDate fecha, LocalTime hora,
			LocalDateTime createdAt, LocalDateTime updatedAt) {
		super();
		this.id = id;
		this.descripcion = descripcion;
		this.dispositivoIOT = dispositivoIOT;
		this.fecha = fecha;
		this.hora = hora;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}
	
	

	public Evento(String descripcion, DispositivoIOT dispositivoIOT, LocalDate fecha, LocalTime hora,
			LocalDateTime createdAt, LocalDateTime updatedAt) {
		super();
		this.descripcion = descripcion;
		this.dispositivoIOT = dispositivoIOT;
		this.fecha = fecha;
		this.hora = hora;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
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
	
	

}
