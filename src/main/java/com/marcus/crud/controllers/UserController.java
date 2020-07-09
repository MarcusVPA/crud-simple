package com.marcus.crud.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import com.marcus.crud.models.User;
import com.marcus.crud.services.UserService;

@Controller
public class UserController {

	@Autowired 
	private UserService userService;
	
	@GetMapping("/users")
	public String getCountries() {
		return "User";
	}
	
	@PostMapping(value="users/addNew")
	public RedirectView addNew(User user, RedirectAttributes redir) {

		if((user.getFirstname()!= "") && (user.getLastname()!= "") && (user.getPassword()!= "")) {
			userService.save(user);			
		}else {
			RedirectView  redirectView = new RedirectView("/register",true);
		    redir.addFlashAttribute("message",	"You must fill in all of the fields");
		    return redirectView;
		}
		RedirectView  redirectView = new RedirectView("/login",true);
	    redir.addFlashAttribute("message",	"You successfully registered! You can now login");
	    return redirectView;
	}
	
}
