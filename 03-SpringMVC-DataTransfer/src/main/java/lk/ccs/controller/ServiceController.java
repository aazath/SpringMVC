package lk.ccs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ServiceController {

	@GetMapping("/services")
	public String getService(Model model)
	{
		model.addAttribute("cid", "50");
		model.addAttribute("cname", "Enterprise Java");
		model.addAttribute("cost", "20000.00 SLR");
		return "services";
	}
}
