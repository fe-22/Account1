package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
	
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account account;
		
		System.out.println("Digite o numero da conta:   ");
		int conta = sc.nextInt();
		System.out.println("conta corrente ou poupança? (CC/P)");
		String ccp  = sc.nextLine();
		sc.nextLine();
		System.out.println("Voçê fará um deposito inicial?  (S/N)");
		String DepositInitial = Character.toString('S');
		
		sc.next().charAt(0);
		
		
		if(DepositInitial == "S") {	
			System.out.printf("Valor do deposito inicial %.2f/n:  R$   ");
			
			double Deposit = sc.nextDouble();
			account = new Account();
			
		}
		
		else {
			account = new Account();
		}
		
		System.out.println();
		System.out.println("Data da conta:   ");
		System.out.println(account);
		
		
		System.out.println();
		System.out.print("Entre com o valor do deposito:   ");
		double valorDeposito = sc.nextDouble();
		account.InitialDeposit(valorDeposito);
		System.out.println("Atualização da conta:  ");
		System.out.println(account);
		
		
		System.out.println();
		System.out.println("Digite o valor para saque:  ");
		double valorSaque = sc.nextDouble();
		account.saque(valorSaque);
		System.out.println("Atualize os dados da conta:  ");
		System.out.println(account);
		
		sc.close();
		

	}

}
