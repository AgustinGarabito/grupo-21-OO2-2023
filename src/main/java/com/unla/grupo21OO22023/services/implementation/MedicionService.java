package com.unla.grupo21OO22023.services.implementation;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.unla.grupo21OO22023.entities.AlumbradoInteligente;
import com.unla.grupo21OO22023.entities.DispositivoIOT;
import com.unla.grupo21OO22023.entities.Medicion;
import com.unla.grupo21OO22023.entities.MedicionAlumbrado;
import com.unla.grupo21OO22023.repositories.IMedicionRepository;
import com.unla.grupo21OO22023.services.IMedicionService;

@Service("medicionService")
public class MedicionService implements IMedicionService {

	@Autowired
	@Qualifier("medicionRepository")
	private IMedicionRepository medicionRepository;
	
	private ModelMapper modelMapper = new ModelMapper();

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

	/////////////////////////
	public List<Medicion> listAll(String palabraClave) {
		if (palabraClave != null) {
			return medicionRepository.findAll(palabraClave);
		}
		return medicionRepository.findAll();
	}
	////////////////
	
	public List<MedicionAlumbrado> listAll() {
		List<MedicionAlumbrado> lista =  new ArrayList<>();
		List<MedicionAlumbrado> d = medicionRepository.listAll();
		
		for(Medicion dis: d) {
			if(dis instanceof MedicionAlumbrado) {
				MedicionAlumbrado aI = (MedicionAlumbrado) dis;
				lista.add(aI);
			}
		}
		return lista;
	}

}
