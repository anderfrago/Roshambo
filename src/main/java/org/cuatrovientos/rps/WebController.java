package org.cuatrovientos.rps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WebController {
	
	@Autowired
	public ScoreRepository scoreRepo;
	
	@ResponseBody
	@GetMapping("/score")
	public Score getScore(){
		Score score;
		try {
			score = scoreRepo.findById(new Integer(1)).get();
		} catch(Exception e ) {
			score = new Score(11,22,33);
			scoreRepo.save(score);
		}
		return score;
	}
	
	@GetMapping("/playgame")
	public String playGame(@RequestParam(name="choice") String theChoice, Model model) {
		
		// Logic considering that the computer always select rock
		
		// TODO Increase/decrease the value of score
		
		String theOutcome = "tie";
		if(theChoice.equalsIgnoreCase("paper")) {
			theOutcome = "win";			
		}
		if(theChoice.equalsIgnoreCase("scissors")) {
			theOutcome = "loss";			
		}
		
		model.addAttribute("theOutcome", theOutcome);
		model.addAttribute("yourChoice", theChoice);
		
		return "results";		
	}

}
