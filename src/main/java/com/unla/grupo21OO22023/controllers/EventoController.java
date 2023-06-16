package com.unla.grupo21OO22023.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.repository.query.Param;
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
//import com.unla.grupo21OO22023.entities.MedicionRiego; // RIEGO POST MERGE
import com.unla.grupo21OO22023.helpers.ViewRouteHelper;
import com.unla.grupo21OO22023.services.IEventoService;
//import com.unla.grupo21OO22023.services.IRiegoAutomaticoService; // RIEGO POST MERGE

@Controller
@PreAuthorize("hasRole('ROLE_ADMIN')")
@RequestMapping("/evento")
public class EventoController {

	@Autowired
	@Qualifier("eventoService")
	private IEventoService eventoService;

	//@Autowired
	//@Qualifier("riegoService") 					// RIEGO POST MERGE
	//private IRiegoAutomaticoService riegoService;

	// INDEX
	@PreAuthorize("hasAnyAuthority('ROLE_ADMIN', 'ROLE_AUDITOR')")
	@GetMapping("")
	public ModelAndView index(@Param("filtro") String filtro) {
		List<Evento> lista = eventoService.listAll(filtro);
		
		ModelAndView mAV = new ModelAndView(ViewRouteHelper.EVENTO_INDEX);
		mAV.addObject("eventos", lista);
		mAV.addObject("filtro", filtro);
		return mAV;
	}

	/* ----------------------------------RIEGO----------------------------------
	
	// VER PARTICULAR
	@GetMapping("/riegos/{id}")
	public ModelAndView getEventos(@PathVariable("id") int id) {
		ModelAndView mAV = new ModelAndView(ViewRouteHelper.EVENTO_PARTICULAR);
		mAV.addObject("eventos", eventoService.findByDispositivoIOT(riegoService.findById(id)));
		mAV.addObject("medicion", new MedicionRiego());
		mAV.addObject("idDispositivo", id);
		return mAV;
	}

	// SINCRONIZAR
	@PostMapping("/sincronizar/{id}")
	public RedirectView sincronizarEventos(@PathVariable("id") int id, @ModelAttribute("medicion") MedicionRiego m) {
		RedirectView r = new RedirectView(ViewRouteHelper.EVENTOS_SINGLE + id);
		m.setDispositivoIOT(riegoService.findById(id));
		Evento e = m.generarEvento();
		if (e.getDescripcion() != null) {
			eventoService.insertOrUpdate(e);
		} else {
			r = new RedirectView(ViewRouteHelper.R_EVENTO_ERROR);
		}
		return r;

	}

	// ERROR
	@GetMapping("/error")
	public ModelAndView error() {
		ModelAndView mAV = new ModelAndView(ViewRouteHelper.EVENTO_ERROR);
		return mAV;
	}
	
	// -------------------------------RIEGO POST MERGE------------------------------- */

}