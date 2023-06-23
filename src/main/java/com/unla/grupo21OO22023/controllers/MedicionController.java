package com.unla.grupo21OO22023.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.unla.grupo21OO22023.helpers.ViewRouteHelper;
import com.unla.grupo21OO22023.services.IMedicionService;
import org.modelmapper.ModelMapper;

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
		mAV.addObject("listaMediciones", medicionService.listAll());
		return mAV;
	}
	
	
	

}
