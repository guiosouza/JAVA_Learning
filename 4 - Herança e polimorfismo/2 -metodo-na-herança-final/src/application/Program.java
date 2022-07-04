package application;

import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;

import entities.Account;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		// INSTANCIANDO OBJETO QUE POSSUI E ENUMS
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Account x = new Account(1020, "Alex", 1000.0);
		Account y = new SavingsAccount(1023, "Maria", 1000.0, 0.01);
		x.withDraw(50.0);
		y.withDraw(50.0);
		
		System.out.println(x.getBalance());
		System.out.println(y.getBalance());

		sc.close();
		
	}	
}