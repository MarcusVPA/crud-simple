package com.marcus.crud;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ApplicationController {
	
	@GetMapping("/index")
	public String goHome() {
		return "index";
	}
	
	@GetMapping("/login")
	public String goLogin() {
		return "login";
	}
	
	@GetMapping("/logout")
	public String goLogout() {
		return "login";
	}	
	
	@GetMapping("/register")
	public String goRegister() {
		return "register";
	}
	

}
