package com.dojosninjas.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.dojosninjas.models.Dojo;
import com.dojosninjas.models.Ninja;
import com.dojosninjas.services.DandNService;

@Controller
public class NinjaController {
	@Autowired
	private DandNService dnService;
	
	@GetMapping("/ninja")
	public String newNinja(@ModelAttribute("ninja")Ninja ninja, Model viewModel) {
		List<Dojo> listDojos=this.dnService.listDojos();
		viewModel.addAttribute("listDojos", listDojos);
		return "ninja.jsp";
	}
	
	@PostMapping("/newNinja")
	public String saveNinja(@Valid @ModelAttribute("ninja")Ninja ninja, BindingResult result, Model viewModel) {
		if (result.hasErrors()) {
			List<Dojo> listDojos=this.dnService.listDojos();
			viewModel.addAttribute("listDojos", listDojos);
			return "ninja.jsp";
		}
		this.dnService.saveNinja(ninja);
		return "redirect:/dojo/"+ninja.getDojo().getId();
	}
	

}
