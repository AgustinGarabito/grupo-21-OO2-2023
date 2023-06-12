package com.unla.grupo21.contollers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.unla.grupo21.entities.DispositivoIOT;
import com.unla.grupo21.helpers.ViewRouteHelper;
import com.unla.grupo21.models.DispositivoIOTModel;
import com.unla.grupo21.services.IDispositivoIOTService;

import jakarta.validation.Valid;


@Controller
@PreAuthorize("hasRole('ROLE_ADMIN')")
@RequestMapping("/dispositivo")
public class DispositivoIOTController {
	
	@Autowired
	@Qualifier("dispositivoIOTService")
	private IDispositivoIOTService dispositivoIOTService;

	private ModelMapper modelMapper = new ModelMapper();

	
	@GetMapping("")
	public ModelAndView index() {
		ModelAndView mAV = new ModelAndView(ViewRouteHelper.DISPOSITIVO_INDEX);
		mAV.addObject("listaDispositivos", dispositivoIOTService.getAll());
		return mAV;
	}

	
	@GetMapping("/new")
	public ModelAndView create() {
		ModelAndView mAV = new ModelAndView(ViewRouteHelper.DISPOSITIVO_NEW);
		mAV.addObject("dispositivo", new DispositivoIOTModel());
		return mAV;
	}
	
	
	@PostMapping("/create")
	public RedirectView create(@ModelAttribute("dispositivo") DispositivoIOTModel dispositivoIOTModel) {
		dispositivoIOTService.insertOrUpdate(modelMapper.map(dispositivoIOTModel, DispositivoIOT.class));
		return new RedirectView(ViewRouteHelper.DISPOSITIVO_ROOT);
	}
	
	@GetMapping("/{id}")
	public ModelAndView get(@PathVariable("id") int id) {
		ModelAndView mAV = new ModelAndView(ViewRouteHelper.DISPOSITIVO_UPDATE);
		mAV.addObject("dispositivo", dispositivoIOTService.findById(id));
		return mAV;
	}
	

	/////////////////////
	
	@PostMapping("/update")
	public RedirectView update(@ModelAttribute("dispositivo") DispositivoIOT dispositivoIOT) {
		dispositivoIOTService.insertOrUpdate(dispositivoIOT);
		return new RedirectView(ViewRouteHelper.DISPOSITIVO_ROOT);

	}
	
	
	@GetMapping("/delete/{id}")
	public ModelAndView  eliminarPersona(@PathVariable("id")int id, Model model) {				
		dispositivoIOTService.remove(id);		
		return listaDispositivos();	
	}
	
	
	@GetMapping("/listaDispositivos")
	public ModelAndView  listaDispositivos() {		
		ModelAndView mV = new ModelAndView();		
		mV.setViewName(ViewRouteHelper.DISPOSITIVO_LIST);
		mV.addObject("listaDispositivos",dispositivoIOTService.getAll());				
		return mV;	
	}
		

}
