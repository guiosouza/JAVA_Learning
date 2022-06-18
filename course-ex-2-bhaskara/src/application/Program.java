package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Bhaskara;

public class Program {

	public static void main(String[] args) {
		
		// locale US e Scanner para console
		Locale.setDefault(Locale.US);		
		Scanner sc = new Scanner(System.in);	
		
		Bhaskara account1;
		
		// entrada de dados
		
		double a = 0; 
		double b = 0;
		double c = 0;
		
		System.out.println("Choose your type of equation:");
		System.out.println(" 1: ax² + bx + c = 0");
		System.out.println(" 2: ax² + c = 0");
		System.out.println(" 3: ax² + bx = 0");
		System.out.println();
		
		System.out.print("Which number? ");
		int equationType = sc.nextInt();
		switch(equationType) {
			case 1: 
				System.out.print("Enter the 'ax²' value: ");
				a = sc.nextDouble();
				System.out.print("Enter the 'bx' value: ");
				b = sc.nextDouble();
				System.out.print("Enter the 'c' value: ");
				c = sc.nextDouble();
				
				Bhaskara equation1 = new Bhaskara(a, b, c);
				equation1.calculator(equationType);
				System.out.print(equation1);
						
				break;
			case 2:
				System.out.print("Enter the 'ax²' value: ");
				a = sc.nextDouble();
				b = 0;
				System.out.print("Enter the 'c' value: ");
				c = sc.nextDouble();
				
				Bhaskara equation2 = new Bhaskara(a, b, c);
				equation2.calculator(equationType);
				System.out.print(equation2);
				
				break;
				
			case 3:
				System.out.print("Enter the 'ax²' value: ");
				a = sc.nextDouble();
				System.out.print("Enter the 'bx' value: ");
				b = sc.nextDouble();
				c = 0;
				
				Bhaskara equation3 = new Bhaskara(a, b, c);
				equation3.calculator(equationType);
				System.out.print(equation3);
				break;
		}
			
		
		
		sc.close();		
		
	}

}
