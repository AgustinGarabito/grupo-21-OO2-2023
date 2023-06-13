package com.unla.grupo21.contollers;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.repository.query.Param;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.unla.grupo21.entities.AlumbradoInteligente;
import com.unla.grupo21.entities.DispositivoIOT;
import com.unla.grupo21.entities.Evento;
import com.unla.grupo21.entities.Medicion;
import com.unla.grupo21.helpers.ViewRouteHelper;
import com.unla.grupo21.services.IDispositivoIOTService;
import com.unla.grupo21.services.IEventoService;
import com.unla.grupo21.services.IMedicionService;


@Controller
@PreAuthorize("hasAnyAuthority('ROLE_ADMIN', 'ROLE_AUDITOR')")
@RequestMapping("/alumbrado")
public class AlumbradoController {
	

	@Autowired
	@Qualifier("dispositivoIOTService")
	private IDispositivoIOTService dispositivoIOTService;
	
	
	@Autowired
	@Qualifier("eventoService")
	private IEventoService eventoService;
	
	
	@Autowired
	@Qualifier("medicionService")
	private IMedicionService medicionService;
	
	

	private ModelMapper modelMapper = new ModelMapper();

	
	@PreAuthorize("hasAuthority('ROLE_ADMIN')")
	@GetMapping("")
	public ModelAndView index() {
		ModelAndView mAV = new ModelAndView(ViewRouteHelper.ALUMBRADO_INDEX);
		mAV.addObject("listaDispositivos", dispositivoIOTService.getAll());
		
		return mAV;
	}
	
		
	@GetMapping("/new")
	public ModelAndView create() {
		ModelAndView mAV = new ModelAndView(ViewRouteHelper.ALUMBRADO_NEW);
		mAV.addObject("alumbrado", new AlumbradoInteligente());
		return mAV;
	}
	
		
	@PostMapping("/create")
	public RedirectView create(@ModelAttribute("alumbrado") AlumbradoInteligente AlumbradoInteligente) {
		dispositivoIOTService.insertOrUpdate(AlumbradoInteligente);
		return new RedirectView(ViewRouteHelper.ALUMBRADO_ROOT);
	}
	
	
	
	@GetMapping("/{id}")
	public String get(Model model, @PathVariable("id") int id) {
		var objeto = dispositivoIOTService.findById(id);
	
		if(objeto instanceof AlumbradoInteligente) {
			model.addAttribute("alumbrado", (AlumbradoInteligente)objeto);
			return "alumbrado/update";
		}else {
			return "alumbrado";
		}
	}


	@PostMapping("/update")
	public RedirectView update(@ModelAttribute("alumbrado") AlumbradoInteligente alumbradoInteligente) {
		dispositivoIOTService.insertOrUpdate(alumbradoInteligente);
		return new RedirectView(ViewRouteHelper.ALUMBRADO_ROOT);
	}
	
	
	
	@GetMapping("/delete/{id}")
	public ModelAndView  eliminar(@PathVariable("id")int id, Model model) {				
		dispositivoIOTService.remove(id);		
		return listaDispositivos();	
	}
	
	
	@GetMapping("/listaDispositivos")
	public ModelAndView  listaDispositivos() {		
		ModelAndView mV = new ModelAndView();		
		mV.setViewName(ViewRouteHelper.ALUMBRADO_LIST);
		mV.addObject("listaDispositivos",dispositivoIOTService.getAll());				
		return mV;	
	}
	
	/* ***************************************** */
	//EVENTOS
	/* ***************************************** */
	
	/*
	@PreAuthorize("hasAnyAuthority('ROLE_ADMIN', 'ROLE_AUDITOR')")
	@GetMapping("/eventos")
	public ModelAndView index2(Model modelo, @Param("palabraClave") String palabraClave) {
		List<Evento> lista = eventoService.listAll(palabraClave);		
		ModelAndView mAV = new ModelAndView(ViewRouteHelper.ALUMBRADOYEVENTO_LIST);
		modelo.addAttribute("listaEventos", lista);	
		modelo.addAttribute("palabraClave", palabraClave);
		return mAV;
	}*/
	
	@PreAuthorize("hasAnyAuthority('ROLE_ADMIN', 'ROLE_AUDITOR')")
	@GetMapping("/eventos")
	public ModelAndView index2(Model modelo, @Param("palabraClave") String palabraClave) {
		List<Medicion> lista = medicionService.listAll(palabraClave);		
		ModelAndView mAV = new ModelAndView(ViewRouteHelper.ALUMBRADOYEVENTO_LIST);
		modelo.addAttribute("listaMediciones", lista);	
		modelo.addAttribute("palabraClave", palabraClave);
		return mAV;
	}
	
	

}
