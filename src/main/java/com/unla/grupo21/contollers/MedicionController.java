package com.unla.grupo21.contollers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.unla.grupo21.helpers.ViewRouteHelper;
import com.unla.grupo21.services.IEventoService;
import com.unla.grupo21.services.IMedicionService;



@Controller
@PreAuthorize("hasRole('ROLE_ADMIN')")
@RequestMapping("/medicion")
public class MedicionController {
	
	
	@Autowired
	@Qualifier("medicionService")
	private IMedicionService medicionService;

	private ModelMapper modelMapper = new ModelMapper();

		
	@GetMapping("")
	public ModelAndView index() {
		ModelAndView mAV = new ModelAndView(ViewRouteHelper.MEDICION_INDEX);
		mAV.addObject("listaMediciones", medicionService.getAll());		
		return mAV;
	}
	

}
