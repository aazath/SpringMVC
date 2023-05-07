package lk.ccs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/second")
public class SecondController {

	@GetMapping("/welcome")
	public String displayGreeting(Model model) {
		model.addAttribute("greeting","Welcome to our website from 2nd");
		return "index";
	}
	
	@GetMapping("/name")
	public String displayName(Model model) {
		model.addAttribute("greeting","My name is Aazath from 2nd");
		return "index";
	}
}
