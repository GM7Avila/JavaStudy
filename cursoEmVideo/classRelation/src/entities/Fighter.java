package entities;

public class Fighter {

	private String name;
	private String nationality;
	private int age;
	private double height;
	private double weight;
	private String category;
	private int wins;
	private int defeats;
	private int ties;
	
	
	
	public Fighter(String name, String nat, int age, double he, double we, int w, int d, int t) {
		this.name = name;
		this.nationality = nat;
		this.age = age;
		this.setHeight(he);
		this.setWeight(we); 
		this.wins = w;
		this.defeats = d;
		this.ties = t;
	}

	//métodos especiais
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nat) {
		this.nationality = nat;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double he) {
		this.height = he;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double we) {
		this.weight = we;
		
		this.setCategory(we);
		
	}

	public String getCategory() {
		return category;
	}

	private void setCategory(double we) {
		if(we < 52.2) {
			this.category = "Inválido";
		} else if(we <= 70.3) {
			this.category = "Leve";
		} else if (we <= 83.9) {
			this.category = "Médio";
		} else if (we <= 120.2) {
			this.category = "Pesado";
		} else { 
			this.category = "Inválido";
		}
	}

	public int getWins() {
		return wins;
	}

	public void setWins(int w) {
		this.wins = w;
	}

	public int getDefeats() {
		return defeats;
	}

	public void setDefeats(int d) {
		this.defeats = d;
	}

	public int getTies() {
		return ties;
	}

	public void setTies(int t) {
		this.ties = t;
	}
	
	//métodos do lutador
	public void status() {
		System.out.println("Name: " + this.getName());
		System.out.println("W [" + this.getWins() + "], T [" + this.getTies() + "], D [" + this.getDefeats() + "]");
	}
	 
	public void winFight() {
		this.setWins(this.getWins() + 1);
	}
	
	public void loseFight() {
		this.setDefeats(this.getDefeats() + 1);
	}
	
	public void tieFight() {
		this.setTies(this.getTies() + 1);
	}

	public void apresentation(){
		System.out.println("Name: " + this.getName() + ";");
		System.out.println("Nationality: " + this.getNationality() + ";");
		System.out.println("Age: " + this.getAge() + " years old;");
		System.out.println("Weight: " + this.getWeight() + " Kg, Height: " + this.getHeight() + "m;");
		System.out.println("Category: " + this.getCategory() + ";");
		System.out.println("W [ " + this.getWins() + "], T [" + this.getTies() + "], D [" + this.getDefeats() + "]");
	}
	
}


