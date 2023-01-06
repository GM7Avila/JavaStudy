package application;

import java.util.Scanner;
import entities.Account;

public class Program {
	static double balanceMod;
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int a = 1;
		int numberAccount = 0;
		int typeAcc = 3;
		String owner;
		
		System.out.println("Creating an Account...");

		do {
			System.out.print("Insert NumberAcc: ");
				numberAccount = sc.nextInt();
			System.out.print("\n0. Cheking Account\n1. Savings Account\n");
			System.out.print("=> ");
			typeAcc = sc.nextInt();
				if (typeAcc != 0 && typeAcc != 1) {
					System.out.println("Enter a valid value");
				} else a = 0;
			
		} while (a == 1);
		
			System.out.print("\nEnter owner's name: ");
			owner = sc.next();
			
			Account acc = new Account(numberAccount, typeAcc, owner);
			acc.openAcc();
			if(typeAcc == 0) {
				balanceMod += 100;
				acc.setBalance(balanceMod);
			} else if(typeAcc == 1) {
				balanceMod += 150;
				acc.setBalance(balanceMod);
			} else System.out.println("Enter a valid value");		
			
			int ans = 0;
			double value = 0;
			do {
				System.out.println("=======================================================");
				//criar o método tela inicial aqui;
				System.out.println("Choose an option:\n");
				System.out.println("0. Verify account data;\n");
				System.out.println("1. Verify bank balance;");
				System.out.println("2. Withdraw amount;");
				System.out.println("3. Cash deposit;");
				System.out.println("4. Pay monthly;");
				System.out.println("5. Close my account;");
				System.out.println("6. Exit");
				
				System.out.print("=> ");
				ans = sc.nextInt();
				System.out.println("=======================================================");

					switch(ans) {
						case 0: 
							if (acc.getStatus()==true) {
								System.out.println(acc.toString());
							} else if (acc.getStatus()==false) {
								System.out.println("It isn't possible to verify the account data because it isn't active.\n");
							}
							//chamar o metodo tela inicial novamente.
							break;
						case 1: 
							if (acc.getStatus()==true) {
								System.out.printf("Balance: " + acc.getBalance() + "\n");
							} else if (acc.getStatus()==false) {
								System.out.println("It isn't possible to verify the account data because it isn't active.\n");
							}
							break;
						case 2:
							if (acc.getStatus() == true) {
								System.out.println("Enter withdrawal amount: ");
								value = sc.nextDouble();
								acc.sacar(value);
								
								System.out.println("New balance: " + acc.getBalance());
								System.out.println();

							} else if (acc.getStatus() == false) {
								System.out.println("It isn't possible to verify the account data because it isn't active.\n");
							}
							break;
						case 3: 
							if (acc.getStatus() == true) {
								System.out.println("Enter deposit amount: ");
								value = sc.nextDouble();
								acc.depositar(value);
								
								System.out.println("New balance: " + acc.getBalance());
								System.out.println();

							} else if (acc.getStatus() == false) {
								System.out.println("It isn't possible to verify the account data because it isn't active.\n");
							}
						
							break;
						case 4: 
							if (acc.getStatus() == true) {
								System.out.println("Monthly paid successfully!");
								acc.monthlyPayment();
							} else if (acc.getStatus() == false) {
								System.out.println("It isn't possible to verify the account data because it isn't active.\n");
							}
							break;
						case 5: 
							if (acc.getStatus()==true) {
								acc.closeAcc();
								
								if(acc.closeAcc() == 0) {
									System.out.println("Account closed. Status [ Closed " + acc.getStatus() + " ]\n");
								} else if (acc.closeAcc() == 1) {
									if (acc.getBalance() < 0) {
										System.out.println("You have outstanding debits; Unable to close your account.");
									} else if (acc.getBalance() > 0) {
										System.out.println("You need to withdraw your entire current balance before closing your accoutn.");
									}
									System.out.println("Account status: " +acc.getStatus());
								}
							} else if (acc.getStatus()==false) {
								System.out.println("The account " + acc.getNumAcc() + " is closed. Do you want to reactivate it?");
								System.out.println("0. Yes.\n1. No\n");
								
								int answr = sc.nextInt();
								System.out.print("=> ");

								if (answr == 0) {
									acc.openAcc();
									System.out.println("Welcome back " + acc.getOwner() + "!");
								} else if (answr == 1) {
									System.out.println("Operation canceled.");
									break;
								} else break;
								
							}
							
							break;
					}
			} while(ans!=6);
			
			System.out.println("Come back often!\n\n [App closed]");
	}
	
}

