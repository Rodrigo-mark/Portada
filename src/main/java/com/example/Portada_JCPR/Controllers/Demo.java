package com.example.Portada_JCPR.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Demo {
	
	@GetMapping("/Demo/Portada")
	public String Portada()
	{
		return "Portada";
		}
}
