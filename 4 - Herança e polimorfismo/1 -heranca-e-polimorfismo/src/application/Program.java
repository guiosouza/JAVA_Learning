package application;

import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		// INSTANCIANDO OBJETO QUE POSSUI E ENUMS
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Account acc1 = new Account(1001, "Alex", 1000.00);
		acc1.withDraw(200.0);
		System.out.println("Com desconto por ser conta normal: " + acc1.getBalance());
		
		Account acc2 = new SavingsAccount(1002, "Maria", 1000.0, 0.01);
		acc2.withDraw(200);
		System.out.println("Sem desconto por ser poupança (tem @Override): " + acc2.getBalance());
		
		Account acc3 = new BusinessAccount(1003, "Bob", 1000.0, 500.0);
		acc3.withDraw(200);
		System.out.println("Sem desconto por ser business (tem @Override): " + acc3.getBalance());
		
		sc.close();
		
	}	
}