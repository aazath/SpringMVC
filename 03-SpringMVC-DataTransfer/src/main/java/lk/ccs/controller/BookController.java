package lk.ccs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BookController {

	@GetMapping("/book")
	public String getBookDetails(@RequestParam("bkname") String bname, @RequestParam("author") String author,
			Model model) {
		String info = bname.concat(" is writtern by "+author);
		model.addAttribute("bookInfo", info);
		return "index";
	}
}
