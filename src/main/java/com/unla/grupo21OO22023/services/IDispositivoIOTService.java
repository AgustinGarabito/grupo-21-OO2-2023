package com.unla.grupo21OO22023.services;

import java.util.List;

import com.unla.grupo21OO22023.entities.AlumbradoInteligente;
import com.unla.grupo21OO22023.entities.DispositivoIOT;
import com.unla.grupo21OO22023.models.DispositivoIOTModel;

public interface IDispositivoIOTService {

	public List<DispositivoIOT> getAll();

	public DispositivoIOT findById(int id);

	public DispositivoIOT findByNombre(String nombre);
	
	public DispositivoIOTModel insertOrUpdate(DispositivoIOT dispositivoIOT);

	public boolean remove(int id);

	public abstract List<AlumbradoInteligente> listAll();
	

}
