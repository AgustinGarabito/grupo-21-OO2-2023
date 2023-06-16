package com.unla.grupo21OO22023.services.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.unla.grupo21OO22023.entities.Medicion;
import com.unla.grupo21OO22023.repositories.IMedicionRepository;
import com.unla.grupo21OO22023.services.IMedicionService;

@Service("medicionService")
public class MedicionService implements IMedicionService{

	@Autowired
	@Qualifier("medicionRepository")
	private IMedicionRepository medicionRepository;
	
	@Override
	public List<Medicion> getAll() {
		return medicionRepository.findAll();
	}

	@Override
	public Medicion findById(int id) {
		return medicionRepository.findById(id);
	}

	@Override
	public Medicion insertOrUpdate(Medicion medicion) {
		medicionRepository.save(medicion);
		return medicion;
	}

}
