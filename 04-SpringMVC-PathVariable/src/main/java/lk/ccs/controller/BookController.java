package lk.ccs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class BookController {

	@GetMapping("/books/{bookName}/{author}")
	public String getBookDetails(@PathVariable("bookName") String book, @PathVariable("author") String authString,
			Model model) {

		String message =  book + " was authored by "+ authString;
		model.addAttribute("book",message);
		return "index";
	}
}
