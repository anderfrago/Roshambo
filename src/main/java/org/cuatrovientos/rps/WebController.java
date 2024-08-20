package org.cuatrovientos.rps;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WebController {
	
	@GetMapping("/playgame")
	public String playGame(@RequestParam(name="choice") String theChoice, Model model) {
		
		model.addAttribute("yourChoice", theChoice);
		
		return "results";		
	}

}
