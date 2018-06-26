package com.co.cbg.sbt.app.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LocaleController {

	//El referer nos entrega la referencia de la última url
	//Esta función nos redirecciona a la última ruta de la app
	@GetMapping("/locale")
	public String locale(HttpServletRequest request) {
		String ultimaUrl = request.getHeader("referer");
		
		return "redirect:".concat(ultimaUrl) ;
	}
}
