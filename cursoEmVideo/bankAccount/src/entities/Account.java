package entities;

public class Account {
	
	public int numAcc;
	protected int typeAcc; 
	private String owner;
	private double balance;
	private boolean status;
	
	public Account(int numAcc, int typeAcc, String owner) {
		this.numAcc = numAcc;
		this.typeAcc = typeAcc;
		this.owner = owner;
		this.balance = 0.00;
		this.status = false;
	}
	
	public void openAcc(int typeAcc){
		if(this.status==false) {
			this.setStatus(true);
		}
		
		this.setTypeAcc(typeAcc);
		
		if(typeAcc == 0) {
			this.setBalance(100);
		} else if(typeAcc ==1) {
			this.setBalance(150);
		}
	}
	
	public int closeAcc(){
		if (balance==0) {
			this.setStatus(false);
			return 0;
		} else return 1;
	}
	
	public void deposit(double value){
		this.setBalance(this.getBalance() + value);
	}
	public int withdrawal(double value){
		
		if(this.getBalance() >= value) {
			this.setBalance(this.getBalance() - value);
			return 0;
		} else if(this.getBalance() < value){
			return 1;
		} else return 3;
		
	}
	public void monthlyPayment(){
		double monthly = 20;
		
		if(this.getTypeAcc() == 0) {
			monthly = 12;
		} 
		
		this.setBalance(this.getBalance() - monthly);
		System.out.println("Value: " + monthly);
	}
	
	// # GETERS & SETTERS
	public int getNumAcc() {
		return numAcc;
	}

	public void setNumAcc(int numAcc) {
		this.numAcc = numAcc;
	}

	public int getTypeAcc() {
		return typeAcc;
	}

	public void setTypeAcc(int typeAcc) {
		this.typeAcc = typeAcc;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
	public String toString() {
		
		if(typeAcc == 0) {
			return    "- Account [Number Account: "+ numAcc + "]" 
					+ "\n- TypeAcc [Checking Account - " + typeAcc + "]"
					+ "\n- Owner [" + owner + "]"
					+ "\n- Balance [$" + balance + "]"
					+ "\n- Status Account [" + status + "]";
		} else if (typeAcc ==1) {
			return "- Account [Number Account: "+ numAcc + "]"
					+ "\n- TypeAcc [Savings Account - " + typeAcc + "]"
					+ "\n- Owner [" + owner + "]"
					+ "\n- Balance  [$" + balance + "]"
					+ "\n- Status Account [" + status + "]";
		} else return "[Error! bad value]";
		
		
	}
	
	// DADOS DA CONTA
	
}
