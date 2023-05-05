package lk.ccs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FirstApp {

	@GetMapping("/welcome")
	public ModelAndView displayMessage() {
		ModelAndView mView = new ModelAndView();
		mView.addObject("message", "First Application...");
		mView.setViewName("index");
		return mView;
	}

	@GetMapping("/java")
	public String display(Model model) {
		model.addAttribute("message", "Java is awesome");

		return "index";

	}
}
