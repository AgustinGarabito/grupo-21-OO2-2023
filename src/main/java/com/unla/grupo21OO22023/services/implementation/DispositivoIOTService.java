package com.unla.grupo21OO22023.services.implementation;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.unla.grupo21OO22023.entities.AlumbradoInteligente;
import com.unla.grupo21OO22023.entities.DispositivoIOT;
import com.unla.grupo21OO22023.models.DispositivoIOTModel;
import com.unla.grupo21OO22023.repositories.IDispositivoIOTRepository;
import com.unla.grupo21OO22023.services.IDispositivoIOTService;
import org.modelmapper.ModelMapper;

@Service("dispositivoService")
public class DispositivoIOTService implements IDispositivoIOTService{
	
	@Autowired
	@Qualifier("dispositivoRepository")
	private IDispositivoIOTRepository dispositivoRepository;
	
	private ModelMapper modelMapper = new ModelMapper();
	
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
	

	@Override
	public DispositivoIOTModel insertOrUpdate(DispositivoIOT dispositivoIOT) {
		DispositivoIOT dispositivoIOTNew = dispositivoRepository.save(dispositivoIOT);
		return modelMapper.map(dispositivoIOTNew, DispositivoIOTModel.class);
	}
	

	@Override
	public boolean remove(int id) {
		try {
			dispositivoRepository.deleteById(id);
			return true;
		}catch (Exception e) {
			return false;
		}
	}
	
	public List<AlumbradoInteligente> listAll() {
		List<AlumbradoInteligente> lista =  new ArrayList<>();
		List<DispositivoIOT> d = dispositivoRepository.findAll();
		
		for(DispositivoIOT dis: d) {
			if(dis instanceof AlumbradoInteligente) {
				AlumbradoInteligente aI = (AlumbradoInteligente) dis;
				lista.add(aI);
			}
		}
		return lista;
	}

}
