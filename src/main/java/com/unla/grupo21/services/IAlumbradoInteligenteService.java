package com.unla.grupo21.services;

import java.util.List;

import com.unla.grupo21.entities.AlumbradoInteligente;
import com.unla.grupo21.entities.DispositivoIOT;
import com.unla.grupo21.models.DispositivoIOTModel;



public interface IAlumbradoInteligenteService {
	
	public List<AlumbradoInteligente> getAll();

	public AlumbradoInteligente findById(int id);

	public DispositivoIOTModel findByName(String name);

	public DispositivoIOTModel insertOrUpdate(AlumbradoInteligente alumbradoInteligente);

	public boolean remove(int id);

////////////
	public List<DispositivoIOT> listAll();

}
