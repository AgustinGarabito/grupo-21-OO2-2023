package com.unla.grupo21OO22023.services;

import java.util.List;

import com.unla.grupo21OO22023.entities.DispositivoIOT;

public interface IDispositivoIOTService {

	public List<DispositivoIOT> getAll();

	public DispositivoIOT findById(int id);

	public DispositivoIOT findByNombre(String nombre);

}
