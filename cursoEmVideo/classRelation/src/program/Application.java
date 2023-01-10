package program;

import entities.Combat;
import entities.Fighter;

public class Application {

	public static void main(String[] args) {
		
		Fighter fighter[] = new Fighter[6];
		
		//String name, String nat, int age, double he, double we, int w, int d, int t
		
		fighter[0] = new Fighter("Shen Huang", "Japan", 34, 1.75f, 67.9f, 2, 3, 2);
		fighter[1] = new Fighter("Anderson Medeiros", "Brasil", 38, 1.85f, 72.9f, 7, 0, 0);
		fighter[2] = new Fighter("Steven Tyson", "USA", 40, 1.88f, 95.5f, 1, 5, 1);
		fighter[3] = new Fighter("Zlatan Ibrahimovic", "Sweden", 42, 1.95, 95.2f, 6, 0, 1);
		fighter[4] = new Fighter("Pedro Vaz", "Portugal", 28, 1.98f, 112.9f, 2, 1, 4);
		fighter[5] = new Fighter("Adom", "Gana", 37, 1.70f, 66.9f, 5, 2, 0);
		
		
		for(int i=0; i<6; i++) {
			fighter[i].status();
		}
		
		Combat UFC = new Combat();
		UFC.setFight(fighter[2], fighter[3]);
		UFC.fight();
		
	}

}
