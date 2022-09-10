package com.uber.demolending.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.uber.demolending.models.Client;
import com.uber.demolending.repos.ClientRepository;

@Controller
public class ClientController {
	
	@Autowired
	ClientRepository clientRepo;
	
	@GetMapping("/")
	public String home (Model model) {
		return "index";
	}
	
	@PostMapping("/")
	public String request (Model model) {
		Client client = new Client();
		clientRepo.save(client);
		return "redirect:/";
	}

}
