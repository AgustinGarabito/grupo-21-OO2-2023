package com.unla.grupo21OO22023.services.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import com.unla.grupo21OO22023.entities.RiegoAutomatico;
import com.unla.grupo21OO22023.models.RiegoModel;
import com.unla.grupo21OO22023.repositories.IRiegoAutomaticoRepository;
import com.unla.grupo21OO22023.services.IRiegoAutomaticoService;

import org.modelmapper.ModelMapper;

@Service("riegoService")
public class RiegoAutomaticoService implements IRiegoAutomaticoService {

	@Autowired
	@Qualifier("riegoRepository")
	private IRiegoAutomaticoRepository riegoRepository;

	private ModelMapper modelMapper = new ModelMapper();

	@Override
	public List<RiegoAutomatico> getAll() {
		return riegoRepository.findAll();
	}

	@Override
	public RiegoAutomatico findById(int id) {
		return riegoRepository.findById(id);
	}

	@Override
	public RiegoAutomatico findByNombre(String name) {
		return riegoRepository.findByNombre(name);
	}

	@Override
	public RiegoModel insertOrUpdate(RiegoAutomatico riego) {
		RiegoAutomatico riegoNew = riegoRepository.save(riego);
		return modelMapper.map(riegoNew, RiegoModel.class);
	}

}
