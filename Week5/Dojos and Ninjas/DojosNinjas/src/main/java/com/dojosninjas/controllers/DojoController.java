package com.dojosninjas.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.dojosninjas.models.Dojo;
import com.dojosninjas.services.DandNService;

@Controller
public class DojoController {
	@Autowired
	private DandNService dnService;
	
	@GetMapping("/")
	public String newDojo(@ModelAttribute("dojo")Dojo dojo) {
		return "dojo.jsp";
	}
	
	@PostMapping("/newDojo")
	public String saveDojo(@Valid @ModelAttribute("dojo")Dojo dojo, BindingResult result) {
		if (result.hasErrors()) {
			return "dojo.jsp";
		}
		this.dnService.saveDojo(dojo);
		return "redirect:/ninja";
	}
	
	@GetMapping("/dojo/{id}")
	public String dojoDetails(Model viewModel, @PathVariable("id")Long id) {
		viewModel.addAttribute("dojo", this.dnService.dojoDetails(id));
		return "details.jsp";
	}
	
	

}
