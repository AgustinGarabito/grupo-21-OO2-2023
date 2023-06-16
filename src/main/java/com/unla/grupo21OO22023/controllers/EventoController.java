package com.unla.grupo21OO22023.controllers;


import java.time.LocalDate;
import java.time.LocalTime;
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
import com.unla.grupo21OO22023.entities.MedicionRiego;
import com.unla.grupo21OO22023.helpers.ViewRouteHelper;
import com.unla.grupo21OO22023.services.IEventoService;
import com.unla.grupo21OO22023.services.IMedicionService;
import com.unla.grupo21OO22023.services.IRiegoAutomaticoService;

@Controller
@PreAuthorize("hasRole('ROLE_ADMIN')")
@RequestMapping("/evento")
public class EventoController {

	@Autowired
	@Qualifier("eventoService")
	private IEventoService eventoService;

	@Autowired
	@Qualifier("riegoService")
	private IRiegoAutomaticoService riegoService;
	
	@Autowired
	@Qualifier("medicionService")
	private IMedicionService medicionService;

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
		m.setFecha(LocalDate.now());
		m.setHora(LocalTime.now());
		medicionService.insertOrUpdate(m);
		
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

}
