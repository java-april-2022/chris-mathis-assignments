package com.mathis.bookClub.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


import com.mathis.bookClub.models.Book;
import com.mathis.bookClub.models.LoginUser;
import com.mathis.bookClub.models.User;
import com.mathis.bookClub.services.BookService;
import com.mathis.bookClub.services.UserService;

@Controller
public class LoginController {
	
	@Autowired
	private BookService bookService;
	
	@Autowired
	private UserService UserService;
	
	@GetMapping("/")
	public String login(@ModelAttribute("newUser")User user, @ModelAttribute("newLogin")LoginUser loginuser) {
		return "login.jsp";
	}
	
	@PostMapping("/newUser")
	public String register(@Valid @ModelAttribute("newUser") User user, BindingResult result, HttpSession session, @ModelAttribute("newLogin") LoginUser loginuser) {
		UserService.validation(user, result);
		if(result.hasErrors()) {
			return "login.jsp";
		}
		UserService.register(user);
		session.setAttribute("userInSession", user);
		return "redirect:/home";
	}
	
	@PostMapping("/login")
	public String login(@Valid @ModelAttribute("newLogin") LoginUser loginuser, BindingResult result, HttpSession session, @ModelAttribute("newUser") User user) {
		UserService.login(loginuser, result);
		if(result.hasErrors()) {
			return "login.jsp";
		}
		User loggedInUser=UserService.findByEmail(loginuser.getEmail());
		session.setAttribute("userInSession", loggedInUser);
		return "redirect:/home";				
	}
	
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/";
	}
	
	@GetMapping("/home")
	public String home(HttpSession session, Model model) {
		if(session.getAttribute("userInSession")!=null) {
			model.addAttribute("books", bookService.allBooks());
			return "home.jsp";
		}
		else {
			return "redirect:/";
		}
		
	}
	
	@GetMapping("/new")
	public String add(HttpSession session, @ModelAttribute("newBook") Book book) {
		if(session.getAttribute("userInSession")!= null) {
			return "add.jsp";
		}
		else {
			return "redirect:/";
		}
	}
	
	@PostMapping("/newBook")
	public String newBook(@Valid @ModelAttribute("newBook") Book book, BindingResult result) {
		if (result.hasErrors()) {
			return "add.jsp";
		}
		else {
			bookService.add(book);
			return "redirect:/home";
		}	
	}
	
	@GetMapping("/details/{id}")
	public String details(@PathVariable Long id, Model model, HttpSession session) {
		if(session.getAttribute("userInSession")!=null) {
			Book book=bookService.details(id);
			model.addAttribute("book", book);
			return "details.jsp";
		}
		else {
			return "redirect:/";
		}
	}
		
	
}
