package org.cuatrovientos.rps;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WebController {
	
	@GetMapping("/playgame")
	public String playGame(@RequestParam(name="choice") String theChoice, Model model) {
		
		// Logic considering that the computer always select rock
		String theOutcome = "tie";
		if(theChoice.equalsIgnoreCase("paper")) {
			theOutcome = "win";			
		}
		if(theChoice.equalsIgnoreCase("scissors")) {
			theOutcome = "loss";			
		}
		
		model.addAttribute("theOutCome", theOutcome);
		model.addAttribute("yourChoice", theChoice);
		
		return "results";		
	}

}
