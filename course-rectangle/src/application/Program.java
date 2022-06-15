package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Program {
	
	public static void main(String[] args) {
		
		// locale US e Scanner para console
		Locale.setDefault(Locale.US);		
		Scanner sc = new Scanner(System.in);
		
		Rectangle r1 = new Rectangle();
		
		System.out.println("Enter rectangle width and height: ");
		r1.width = sc.nextDouble();
		r1.height = sc.nextDouble();
		
		System.out.print(r1);
		
		sc.close();
	}
}
