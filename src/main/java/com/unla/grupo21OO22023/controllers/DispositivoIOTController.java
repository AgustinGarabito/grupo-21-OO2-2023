package com.unla.grupo21OO22023.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

import com.unla.grupo21OO22023.entities.DispositivoIOT;
import com.unla.grupo21OO22023.helpers.ViewRouteHelper;
import com.unla.grupo21OO22023.services.IDispositivoIOTService;

@PreAuthorize("hasAnyAuthority('ROLE_ADMIN', 'ROLE_AUDITOR')")
@Controller
@RequestMapping("/dispositivo")
public class DispositivoIOTController {

	@Autowired
	@Qualifier("dispositivoService")
	private IDispositivoIOTService dispositivoService;

	// MIS DISPOSITIVOS
	@GetMapping("/listaDispositivos")
	public ModelAndView misDispositivos() {
		ModelAndView mAV = new ModelAndView(ViewRouteHelper.LISTA_DISPOSITIVOS);

		List<DispositivoIOT> dispositivos = dispositivoService.getAll();
		mAV.addObject("dispositivos", dispositivos);

		return mAV;
	}

}
