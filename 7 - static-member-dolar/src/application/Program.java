package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Dolar;

public class Program {
	
	public static void main(String[] args) {
		
		// locale US e Scanner para console
		Locale.setDefault(Locale.US);		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar price? ");
		double value = sc.nextDouble();
		System.out.println();
				
		System.out.print("How many dollars will be bought? ");
		double quantity = sc.nextInt();
		System.out.println();
		
		
		System.out.print("Amount to be paid in reais = " + Dolar.calculatorDolar(value, quantity));		
		sc.close();
	}
}
