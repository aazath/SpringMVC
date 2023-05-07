package lk.ccs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class QueryController {

	@GetMapping("/query")
	public String getQuery(@RequestParam("name") String reqName, Model model) {
		
		reqName = reqName.concat(" Welcome to CCS Campus");
		model.addAttribute("query", reqName);
		return "student";
	}
}
