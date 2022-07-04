package application;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.CompanyTax;
import entities.IndividualTax;
import entities.TaxPayer;

public class Program {

	public static void main(String[] args) throws ParseException {
				
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<TaxPayer> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i ++) {
			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Individual or company (i/c)? ");
			char ch = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			double anualIncome = sc.nextDouble();
			
			if(ch == 'i') {
				System.out.print("Health expenditures: ");
				double healthExpen = sc.nextDouble();
				list.add(new IndividualTax(name, anualIncome, healthExpen));
			}
			
			else {
				System.out.print("Number of employees: ");
				int employees = sc.nextInt();
				list.add(new CompanyTax(name, anualIncome, employees));
			}
		}
		
		double totalTaxes = 0.0;
		
		System.out.println();
		System.out.println("TAXES PAID:");
		for(TaxPayer x : list) {
			System.out.println(x.getName() + ": $ " + String.format("%.2f", x.TaxPaid()));
			totalTaxes = totalTaxes + x.TaxPaid();
		}
		
		System.out.println();
		System.out.println("TOTAL TAXES: $ " + String.format("%.2f", totalTaxes));
		
		sc.close();
		
	}	
}