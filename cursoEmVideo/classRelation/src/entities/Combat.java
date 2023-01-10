package entities;

import java.util.Random;

public class Combat {

	private Fighter challenger;
	private Fighter challenged;
	private int rounds;
	private boolean status;
	
	//métodos de Combate
	public void setFight(Fighter l1, Fighter l2) {
		if (l1.getCategory().equals(l2.getCategory()) && l1 != l2) {
			this.status = true;
			this.challenger = l1;
			this.challenged = l2;
		} else {
			this.status = false;
			this.challenger = null;
			this.challenged = null;
		}
	} 
	
	public void fight() {
		if(this.status) {
			System.out.println("### CHALLENGER ###");
			this.challenger.apresentation();
			System.out.println("### CHALLENGED ###");
			this.challenged.apresentation();
			
			Random randomic = new Random();
			int winner = randomic.nextInt(3);
			
			switch (winner) {
				case 0 : //tie
					System.out.println("There was a tie!");
					this.challenged.tieFight();
					this.challenger.tieFight();
					break;
				case 1 : 
					System.out.println(this.challenged.getName() + "wins!");
					this.challenged.winFight();
					this.challenger.loseFight();
					break;
				case 2 : 
					System.out.println(this.challenger.getName() + "wins!");
					this.challenger.winFight();
					this.challenged.loseFight();
					break;
					
			}
			
		} else {
			System.out.println("The fight was not approved.");
		}
	}

	//métodos especiais
	
	public Fighter getChallenger() {
		return challenger;
	}

	public void setChallenger(Fighter challenger) {
		this.challenger = challenger;
	}

	public Fighter getChallenged() {
		return challenged;
	}

	public void setChallenged(Fighter challenged) {
		this.challenged = challenged;
	}

	public int getRounds() {
		return rounds;
	}

	public void setRounds(int rounds) {
		this.rounds = rounds;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
	
	
}
