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
			System.out.print("\n0. Conta Corrente\n1. Conta Poupança\n");
			System.out.print("=> ");
			typeAcc = sc.nextInt();
				if (typeAcc != 0 && typeAcc != 1) {
					System.out.println("Insira um valor válido");
				} else a = 0;
			
		} while (a == 1);
		
			System.out.print("\nInsert a owner name: ");
			owner = sc.next();
			
			Account acc = new Account(numberAccount, typeAcc, owner);
			acc.openAcc();
			if(typeAcc == 0) {
				balanceMod += 100;
				acc.setBalance(balanceMod);
			} else if(typeAcc == 1) {
				balanceMod += 150;
				acc.setBalance(balanceMod);
			} else System.out.println("Valor inválido");		
			
			int ans = 0;
			double value = 0;
			do {
				//criar o método tela inicial aqui;
				System.out.println("O que você deseja fazer?\n");
				System.out.println("0. Verificar dados da conta");
				System.out.println("1. Verificar saldo bancário");
				System.out.println("2. Sacar");
				System.out.println("3. Depositar");
				System.out.println("4. Pagar mensalidade");
				System.out.println("5. Encerrar conta");
				System.out.println("6. Sair");
				
				System.out.print("=> ");
				ans = sc.nextInt();
				
					switch(ans) {
						case 0: 
							if (acc.getStatus()==true) {
								System.out.println(acc.toString());
							} else if (acc.getStatus()==false) {
								System.out.println("Não é possível verificar os dados da conta, ela não se encontra ativa.");
							}
							
							//chamar o metodo tela inicial novamente.
							break;
						case 1: 
							if (acc.getStatus()==true) {
								System.out.printf("Saldo: " + acc.getBalance() + "\n");
							} else if (acc.getStatus()==false) {
								System.out.println("Não é possível verificar os dados da conta, ela não se encontra ativa.");
							}
							break;
						case 2:
							if (acc.getStatus() == true) {
								System.out.println("Informe a quantidade de saque: ");
								value = sc.nextDouble();
								acc.sacar(value);
								
								System.out.println("Novo saldo: " + acc.getBalance());
								System.out.println();

							} else if (acc.getStatus() == false) {
								System.out.println("Não foi possível concluir a operação, a conta se encontra fechada.\n");
							}
							break;
						case 3: 
							if (acc.getStatus() == true) {
								System.out.println("Informe a quantidade de depósito: ");
								value = sc.nextDouble();
								acc.depositar(value);
								
								System.out.println("Novo saldo: " + acc.getBalance());
								System.out.println();

							} else if (acc.getStatus() == false) {
								System.out.println("Não foi possível concluir a operação, a conta se encontra fechada.\n");
							}
						
							break;
						case 4: 
							if (acc.getStatus() == true) {
								acc.pagarMensalidade();
							} else if (acc.getStatus() == false) {
								System.out.println("Não foi possível concluir a operação, a conta se encontra fechada.\n");
							}
							break;
						case 5: 
							if (acc.getStatus()==true) {
								acc.closeAcc();
								
								if(acc.closeAcc() == 0) {
									System.out.println("Conta trancada. Status = fechada [" + acc.getStatus() + "]\n");
								} else if (acc.closeAcc() == 1) {
									System.out.println("Você possui débitos pendentes; Não foi possível fechar sua conta.");
									System.out.println("Status da conta: " +acc.getStatus());
								}
							} else if (acc.getStatus()==false) {
								System.out.println("A conta " + acc.getNumAcc() + " se encontra fechada. Deseja reativa-la?");
								System.out.println("0. Sim.\n1. Não\n");
								
								int answr = sc.nextInt();
								System.out.print("=> ");

								if (answr == 0) {
									acc.openAcc();
									System.out.println("Bem vindo de volta " + acc.getOwner());
								} else if (answr == 1) {
									System.out.println("Operação cancelada.");
									break;
								} else break;
								
							}
							
							break;
					}
			} while(ans!=6);
			
			System.out.println("Volte sempre.");
	}
	
}

