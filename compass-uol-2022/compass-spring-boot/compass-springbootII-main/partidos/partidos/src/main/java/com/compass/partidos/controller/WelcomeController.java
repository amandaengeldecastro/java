package com.compass.partidos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WelcomeController {

	@RequestMapping("/")
	@ResponseBody
	public String welcome() {
		return "Seja bem vindo!";
	}
}

