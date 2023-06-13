package com.unla.grupo21.services.implementation;


import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.unla.grupo21.entities.DispositivoIOT;
import com.unla.grupo21.models.DispositivoIOTModel;
import com.unla.grupo21.repositories.IDispositivoIOTRepository;
import com.unla.grupo21.services.IDispositivoIOTService;


@Service("dispositivoIOTService")
public class DispositivoIOTService implements IDispositivoIOTService{
	
	@Autowired
	@Qualifier("dispositivoIOTRepository")
	private IDispositivoIOTRepository dispositivoIOTRepository;

	private ModelMapper modelMapper = new ModelMapper();

	@Override
	public List<DispositivoIOT> getAll() {
		return dispositivoIOTRepository.findAll();
	}


	@Override
	public DispositivoIOTModel insertOrUpdate(DispositivoIOT dispositivoIOT) {
		DispositivoIOT dispositivoIOTNew = dispositivoIOTRepository.save(dispositivoIOT);
		return modelMapper.map(dispositivoIOTNew, DispositivoIOTModel.class);
	}
	

	@Override
	public boolean remove(int id) {
		try {
			dispositivoIOTRepository.deleteById(id);
			return true;
		}catch (Exception e) {
			return false;
		}
	}

	@Override
	public DispositivoIOT findById(int id) {
		return dispositivoIOTRepository.findById(id);
	}

	
	@Override
	public DispositivoIOTModel findByNombre(String nombre) {
		return modelMapper.map(dispositivoIOTRepository.findByNombre(nombre), DispositivoIOTModel.class);
	}

	
	
	
	
	
	 
}
