package com.unla.grupo21OO22023.entities;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Table;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "dispositivoIOT")
public class DispositivoIOT {

	// ATRIBUTOS
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idDispositivo")
	private int idDispositivo;
	
	private String nombre;
	
	private int nroSector;
	
	private boolean activo;
	
	@CreationTimestamp
	private LocalDateTime fechaCreacion;
	
	@UpdateTimestamp
	private LocalDateTime fechaActualizacion;

	// CONSTRUCTOR
	public DispositivoIOT() {
	
	}
	
	public DispositivoIOT(String nombre, int nroSector) {
		super();
		this.nombre = nombre;
		this.nroSector = nroSector;
		this.activo = false;
	}

	// GET AND SET
	public int getNroSector() {
		return nroSector;
	}

	public void setNroSector(int nroSector) {
		this.nroSector = nroSector;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	public int getIdDispositivo() {
		return idDispositivo;
	}

	protected void setIdDispositivo(int idDispositivo) {
		this.idDispositivo = idDispositivo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDateTime getFechaCreacion() {
		return fechaCreacion;
	}

	protected void setFechaCreacion(LocalDateTime fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public LocalDateTime getFechaActualizacion() {
		return fechaActualizacion;
	}

	public void setFechaActualizacion(LocalDateTime fechaActualizacion) {
		this.fechaActualizacion = fechaActualizacion;
	}
	
	
	
}
