package com.example.demo.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


// classe para acessar a view .. 

@Controller
public class HomeController {

@GetMapping("/")
public String Conteudo() {
	
	return "/conteudo";
	
}
	
	
	
}
