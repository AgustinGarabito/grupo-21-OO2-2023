package com.unla.grupo21OO22023.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.unla.grupo21OO22023.entities.Evento;
import com.unla.grupo21OO22023.entities.MedicionRiego;
import com.unla.grupo21OO22023.helpers.ViewRouteHelper;
import com.unla.grupo21OO22023.services.IEventoService;
import com.unla.grupo21OO22023.services.IRiegoAutomaticoService;

@Controller
@PreAuthorize("hasRole('ROLE_AUDITOR')")
@RequestMapping("/evento")
public class EventoController {

	@Autowired
	@Qualifier("eventoService")
	private IEventoService eventoService;

	@Autowired
	@Qualifier("riegoService")
	private IRiegoAutomaticoService riegoService;

	// INDEX
	@GetMapping("")
	public ModelAndView index() {
		ModelAndView mAV = new ModelAndView(ViewRouteHelper.EVENTO_INDEX);
		mAV.addObject("eventos", eventoService.getAll());
		return mAV;
	}

	// VER PARTICULAR
	@GetMapping("/riegos/{id}")
	public ModelAndView getEventos(@PathVariable("id") int id) {
		ModelAndView mAV = new ModelAndView(ViewRouteHelper.EVENTO_PARTICULAR);
		mAV.addObject("eventos", eventoService.findByDispositivo(riegoService.findById(id)));
		mAV.addObject("medicion", new MedicionRiego());
		return mAV;
	}

	// SINCRONIZAR
	@PostMapping("/sincronizar/{id}")
	public RedirectView sincronizarEventos(@PathVariable("id") int id, @ModelAttribute("medicion") MedicionRiego m) {
		RedirectView r = new RedirectView(ViewRouteHelper.EVENTO_PARTICULAR);
		m.setRiego(riegoService.findById(id));
		Evento e = m.generarEvento();
		if(e != null) {
			eventoService.insertOrUpdate(e);
		} else {
			r = new RedirectView(ViewRouteHelper.EVENTO_ERROR);
		}
		return r;
		
	}

}
