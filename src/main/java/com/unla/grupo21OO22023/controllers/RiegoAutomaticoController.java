package com.unla.grupo21OO22023.controllers;

import org.modelmapper.ModelMapper;
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

import com.unla.grupo21OO22023.entities.RiegoAutomatico;
import com.unla.grupo21OO22023.helpers.ViewRouteHelper;
import com.unla.grupo21OO22023.models.RiegoModel;
import com.unla.grupo21OO22023.services.IEventoService;
import com.unla.grupo21OO22023.services.IRiegoAutomaticoService;

@Controller
@PreAuthorize("hasRole('ROLE_ADMIN')")
@RequestMapping("/riego")
public class RiegoAutomaticoController {

	// ATRIBUTOS
	@Autowired
	@Qualifier("riegoService")
	private IRiegoAutomaticoService riegoService;

	@Autowired
	@Qualifier("eventoService")
	private IEventoService eventoService;
	
	private ModelMapper modelMapper = new ModelMapper();

	// INDEX LISTA
	@GetMapping("")
	public ModelAndView index() {
		ModelAndView mAV = new ModelAndView(ViewRouteHelper.RIEGO_INDEX);
		mAV.addObject("riegos", riegoService.findActivos(riegoService.getAll()));
		return mAV;
	}

	// CREAR VISTA
	@PreAuthorize("hasAuthority('ROLE_ADMIN')")
	@GetMapping("/new")
	public ModelAndView create() {
		ModelAndView mAV = new ModelAndView(ViewRouteHelper.RIEGO_NEW);
		mAV.addObject("riego", new RiegoModel());
		return mAV;
	}

	// CREAR
	@PreAuthorize("hasAuthority('ROLE_ADMIN')")
	@PostMapping("/create")
	public RedirectView create(@ModelAttribute("riego") RiegoModel riegoModel) {
		riegoModel.setActivo(true);
		riegoService.insertOrUpdate(modelMapper.map(riegoModel, RiegoAutomatico.class));
		return new RedirectView(ViewRouteHelper.RIEGO_ROOT);
	}

	// VISTA PARTICULAR
	@PreAuthorize("hasAuthority('ROLE_ADMIN')")
	@GetMapping("/{id}")
	public ModelAndView get(@PathVariable("id") int id) {
		ModelAndView mAV = new ModelAndView(ViewRouteHelper.RIEGO_UPDATE);
		mAV.addObject("riego", riegoService.findById(id));
		return mAV;
	}

	// EDITAR Y BAJA LOGICA
	@PreAuthorize("hasAuthority('ROLE_ADMIN')")
	@PostMapping("/update")
	public RedirectView update(@ModelAttribute("riego") RiegoAutomatico riego) {
		RiegoAutomatico riegoOld = riegoService.findById(riego.getId());
		riego.setCreatedAt(riegoOld.getCreatedAt());
		riegoService.insertOrUpdate(riego);
		return new RedirectView(ViewRouteHelper.RIEGO_ROOT);
	}

}