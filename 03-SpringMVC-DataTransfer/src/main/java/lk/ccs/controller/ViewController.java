package lk.ccs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {
	
	@GetMapping("/msg")
	public String getMessage(Model model) {
		model.addAttribute("msg", "Welcome to CCS");
		return "index";
	}
}
