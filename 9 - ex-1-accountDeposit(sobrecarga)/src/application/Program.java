package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		
		// locale US e Scanner para console
		Locale.setDefault(Locale.US);		
		Scanner sc = new Scanner(System.in);	
		
		Account account1;
		
		// entrada de dados
		System.out.print("Enter account number: ");
		int accountNumber = sc.nextInt();
		
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();	
		System.out.print("Is there na initial deposit (y/n)? ");
		char initialValueAnswer = sc.next().charAt(0); // validar caractere
		
		if (initialValueAnswer == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialValue = sc.nextDouble();
			account1 = new Account(accountNumber, holder, initialValue);
		}
		else {
			account1 = new Account(accountNumber, holder);
		}
		
		System.out.println();
		System.out.println("Account data:");
		System.out.println(account1);
		System.out.println();
		
		System.out.print("Enter a deposit value: ");
		account1.deposit(sc.nextDouble());
		System.out.println("Updated account data: ");
		System.out.println(account1);
		System.out.println();
		
		System.out.print("Enter a withdraw value: ");
		account1.withdraw(sc.nextDouble());
		System.out.println("Updated account data: ");
		System.out.println(account1);
		
		sc.close();
	}

}
