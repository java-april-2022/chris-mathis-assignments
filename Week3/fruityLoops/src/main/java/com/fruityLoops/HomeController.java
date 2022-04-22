package com.fruityLoops;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String index(Model model) {
//		ArrayList<String> fruits = new ArrayList<String>();
//		fruits.add("Kiwi");
//		fruits.add("Mango");
//		fruits.add("Goji Berries");
//		fruits.add("Guava");
//		model.addAttribute("fruitsFromMyController", fruits);
//		
//		ArrayList<Double> price = new ArrayList<Double>();
//		price.add(1.5);
//		price.add(2.0);
//		price.add(4.0);
//		price.add(0.75);
//		model.addAttribute("priceFromMyController", price);
		
		HashMap <String, Double> fruits = new HashMap<String, Double>();
		fruits.put("Kiwi", 1.5);
		fruits.put("Mango", 2.0);
		fruits.put("Goji Berries", 4.0);
		fruits.put("Guava", 0.75);
		model.addAttribute("fruits", fruits);
		return "index.jsp";
	}

}
