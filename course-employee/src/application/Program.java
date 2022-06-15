package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {
	
	public static void main(String[] args) {
		
		// locale US e Scanner para console
		Locale.setDefault(Locale.US);		
		Scanner sc = new Scanner(System.in);

		Employee emplo1 = new Employee ();
		
		System.out.print("Name: ");
		emplo1.name = sc.next();
		System.out.print("Gross Salary: ");
		emplo1.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		emplo1.tax = sc.nextDouble();
		
		System.out.println();
		System.out.print("Employee: " + emplo1.netSalary());
		System.out.println();
		
		System.out.println();
		System.out.print("Which percentage to increase salary? ");
		emplo1.increaseSalary(sc.nextDouble());
		System.out.println();
		
		System.out.print("Updated data: " + emplo1.grossSalary);
		
		sc.close();
	}
}
