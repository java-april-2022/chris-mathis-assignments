package com.counter;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String index (HttpSession session, Model model) {
		if (session.getAttribute("count") == null) {
			session.setAttribute("count", 0);
		}
		else {
			Integer numVisits = (Integer) session.getAttribute("count");
			numVisits++;
			session.setAttribute("count", numVisits);
		}
		
			return "index.jsp";
	}
	@RequestMapping("/counter")
	public String visitCounts(HttpSession session, Model model) {
		Integer numVisits = 0;
		if (session.getAttribute("count")== null) {
			session.setAttribute("count", 0);
		}
		else {
			numVisits = (Integer) session.getAttribute("count");
		}
		return "counter.jsp";
	}
	
	@RequestMapping("/reset")
	public String reset(HttpSession session) {
		session.setAttribute("count", 0);
		return"redirect:/counter";
	}

}
