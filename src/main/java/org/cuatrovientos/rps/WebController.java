package org.cuatrovientos.rps;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WebController {
	
	@GetMapping("/playgame")
	public String playGame(//TODO Add request parameter choice String theChoice) {
		
		//TODO Add attribute to the model "yourChoice", theChoice
		
		return "results";		
	}

}
