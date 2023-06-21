package com.unla.grupo21OO22023.controllers;

import java.util.List;
import java.util.ArrayList;

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

import com.unla.grupo21OO22023.entities.AlumbradoInteligente;
import com.unla.grupo21OO22023.entities.Evento;
import com.unla.grupo21OO22023.entities.Medicion;
import com.unla.grupo21OO22023.entities.MedicionAlumbrado;
import com.unla.grupo21OO22023.helpers.ViewRouteHelper;
import com.unla.grupo21OO22023.services.IDispositivoIOTService;
import com.unla.grupo21OO22023.services.IEventoService;
import com.unla.grupo21OO22023.services.IMedicionService;

@Controller
@PreAuthorize("hasAnyAuthority('ROLE_ADMIN', 'ROLE_AUDITOR')")
@RequestMapping("/alumbrado")
public class AlumbradoController {
	/*
	@Autowired
	@Qualifier("dispositivoIOTService")
	private IDispositivoIOTService dispositivoIOTService;

	@Autowired
	@Qualifier("eventoService")
	private IEventoService eventoService;

	@Autowired
	@Qualifier("medicionService")
	private IMedicionService medicionService;

	//private ModelMapper modelMapper = new ModelMapper();

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

		if (objeto instanceof AlumbradoInteligente) {
			model.addAttribute("alumbrado", (AlumbradoInteligente) objeto);
			return "alumbrado/update";
		} else {
			return "alumbrado";
		}
	}

	@PostMapping("/update")
	public RedirectView update(@ModelAttribute("alumbrado") AlumbradoInteligente alumbradoInteligente) {
		dispositivoIOTService.insertOrUpdate(alumbradoInteligente);
		return new RedirectView(ViewRouteHelper.ALUMBRADO_ROOT);
	}

	@GetMapping("/delete/{id}")
	public RedirectView delete(@PathVariable("id") int id) {
		dispositivoIOTService.remove(id);
		return new RedirectView(ViewRouteHelper.ALUMBRADO_ROOT);
	}*/

	/* ***************************************** */
	// EVENTOS
	/* ***************************************** */

	/*
	@PreAuthorize("hasAnyAuthority('ROLE_ADMIN', 'ROLE_AUDITOR')")
	@GetMapping("/eventos")
	public ModelAndView index2(Model modelo, @Param("palabraClave") String palabraClave) {
		ModelAndView mAV = new ModelAndView(ViewRouteHelper.ALUMBRADOYEVENTO_LIST);
		List<Medicion> medicion = medicionService.listAll(palabraClave);
		List<Evento> listaEventos = new ArrayList<>();
		Evento evento = new Evento();

		for (Medicion med : medicion) {
			if (med instanceof MedicionAlumbrado) {
				if (med.medicionDispositivoIOT().getDescripcion() != null) {
					listaEventos.add(med.medicionDispositivoIOT());
					evento = med.medicionDispositivoIOT();

					eventoService.insertOrUpdate(evento);

				}
			}

		}

		modelo.addAttribute("listaEventos", listaEventos);
		return mAV;
	}
	*/
	

}
