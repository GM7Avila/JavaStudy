package entities;

public class Account {
	
	public int numAcc;
	protected int typeAcc; //cc -> corrente | cp -> poupança
	private String owner;
	private double balance;
	private boolean status;
	
	public Account(int numAcc, int typeAcc, String owner) {
		this.numAcc = numAcc;
		this.typeAcc = typeAcc;
		this.owner = owner;
		this.balance = 0;
		this.status = false;
	}
	public void openAcc(){
		if(this.status==false) {
			this.status = true;
		}
	}
	public int closeAcc(){
		if (balance>=0) {
			this.status = false;
			return 0;
		} else return 1;
	}
	public void depositar(double value){
		this.balance += value;
	}
	public void sacar(double value){
			this.balance -= value;	
		//limite de saque de acordo com o dinheiro na conta
	}
	public void pagarMensalidade(){
		if(this.getTypeAcc() == 0) {
			this.balance -= 12;
		} else if (this.getTypeAcc() == 1) {
			this.balance -= 20;
		}
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
			return "Account [numAcc=" + numAcc + ", typeAcc [Conta Corrente] " + typeAcc + ", owner=" + owner + ", balance=" + balance
					+ ", status=" + status + "]";
		} else if (typeAcc ==1) {
			return "Account [numAcc=" + numAcc + ", typeAcc [Conta Poupanca] " + typeAcc + ", owner=" + owner + ", balance=" + balance
					+ ", status=" + status + "]";
		} else return "Error";
		
		
	}
	
	// DADOS DA CONTA
	
}