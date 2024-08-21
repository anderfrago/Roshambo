package org.cuatrovientos.rps;

import org.springframework.data.annotation.Id;

public class Score {
	
	private int wins, losses, ties;
	
	@Id
	private Integer id;

	public Score(int wins, int losses, int ties) {
		super();
		this.wins = wins;
		this.losses = losses;
		this.ties = ties;
	}
 
	public int getWins() {
		return wins;
	}

	public void setWins(int wins) {
		this.wins = wins;
	}

	public int getLosses() {
		return losses;
	}

	public void setLosses(int losses) {
		this.losses = losses;
	}

	public int getTies() {
		return ties;
	}

	public void setTies(int ties) {
		this.ties = ties;
	}
	
	

}
