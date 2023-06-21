package com.unla.grupo21OO22023.entities;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.UpdateTimestamp;
import org.hibernate.annotations.Where;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Table;

@Entity
@Table(name = "dispositivoiot")
@SQLDelete(sql = "UPDATE dispositivoiot SET deleted = true WHERE id=?")
@Where(clause = "deleted=false")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class DispositivoIOT {

	// ATRIBUTOS
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected  int id;
	
	protected  String nombre;
	
	protected  int nroSector;
	
	protected  boolean deleted = Boolean.FALSE;
	
	@CreationTimestamp
	private LocalDateTime createdAt;

	@UpdateTimestamp
	private LocalDateTime updatedAt;
	
	
	// CONSTRUCTOR
	public DispositivoIOT() {
		
	}
	
	public DispositivoIOT(int id, String nombre, int nroSector, boolean deleted) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.nroSector = nroSector;
		this.deleted = deleted;
	}
	
	public DispositivoIOT(int id) {
		this.id = id;
	}

	// GET AND SET
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNroSector() {
		return nroSector;
	}

	public void setNroSector(int nroSector) {
		this.nroSector = nroSector;
	}

	public boolean isDeleted() {
		return deleted;
	}

	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
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
	
	public String toString() {
		return  nombre;
	}

	/*
	public abstract boolean prenderAlumbrado(int valorMaximo);
	public abstract boolean apagarAlumbrado(int valorMinimo);*/

	
	
}
