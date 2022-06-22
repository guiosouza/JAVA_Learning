package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Products;

public class Program {
	
	public static void main(String[] args) {
		
		// locale US e Scanner para console
		Locale.setDefault(Locale.US);		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many products do you wanna include? ");
		int n = sc.nextInt();
		
		Products[] vect = new Products[n];
		
		for (int i = 0; i < vect.length; i++) {
			sc.nextLine(); // consumir a quebra de linha que ficou pendente;
			System.out.print("Enter the name of the product " + (i + 1) + ": ");
			String name = sc.nextLine();
			System.out.print("Enter the price of the product " + (i + 1) + ": ");
			double price = sc.nextDouble();
			vect[i] = new Products(name, price);
		}
		
		double sum = 0;
		
		for (int i = 0; i < vect.length; i++) {
			sum = sum + vect[i].getPrice();
		}
		
		double average = sum / vect.length;
		
		System.out.print("Average price is: " + average);
		
		sc.close();
	}
}
