package com.unla.grupo21OO22023.services.implementation;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.unla.grupo21OO22023.entities.DispositivoIOT;
import com.unla.grupo21OO22023.repositories.IDispositivoIOTRepository;
import com.unla.grupo21OO22023.services.IDispositivoIOTService;

@Service("dispositivoService")
public class DispositivoIOTService implements IDispositivoIOTService{
	
	@Autowired
	@Qualifier("dispositivoRepository")
	private IDispositivoIOTRepository dispositivoRepository;
	
	@Override
	public List<DispositivoIOT> getAll() {
		return dispositivoRepository.findAll();
	}

	@Override
	public DispositivoIOT findById(int id) {
		return dispositivoRepository.findById(id);
	}

	@Override
	public DispositivoIOT findByNombre(String name) {
		return dispositivoRepository.findByNombre(name);
	}
	
	

}
