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

import com.unla.grupo21.entities.Evento;
import com.unla.grupo21.helpers.ViewRouteHelper;
import com.unla.grupo21.models.EventoModel;
import com.unla.grupo21.services.IEventoService;

import jakarta.validation.Valid;

@Controller
@PreAuthorize("hasRole('ROLE_ADMIN')")
@RequestMapping("/evento")
public class EventoController {
	
	@Autowired
	@Qualifier("eventoService")
	private IEventoService eventoService;

	private ModelMapper modelMapper = new ModelMapper();

	@GetMapping("")
	public ModelAndView index() {
		ModelAndView mAV = new ModelAndView(ViewRouteHelper.EVENTO_INDEX);
		mAV.addObject("eventos", eventoService.getAll());
		return mAV;
	}

	@GetMapping("/new")
	public ModelAndView create() {
		ModelAndView mAV = new ModelAndView(ViewRouteHelper.EVENTO_NEW);
		mAV.addObject("evento", new EventoModel());
		return mAV;
	}

	@PostMapping("/create")
	public RedirectView create(@ModelAttribute("evento") EventoModel eventoModel) {
		eventoService.insertOrUpdate(modelMapper.map(eventoModel, Evento.class));
		return new RedirectView(ViewRouteHelper.EVENTO_ROOT);
	}

	

	
	

	@PostMapping("/delete/{id}")
	public RedirectView delete(@PathVariable("id") int id) {
		eventoService.remove(id);
		return new RedirectView(ViewRouteHelper.EVENTO_ROOT);
	}

}
