package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// MANIPULAÇÃO DE DATAS
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Enter department's name: ");
		String departmentName = sc.nextLine();
		System.out.println("Enter Worker data: ");
		System.out.print("Name: ");
		String workerName = sc.nextLine();
		System.out.print("Level: ");
		String workerLevel = sc.nextLine();
		System.out.print("Base Salary: ");
		double baseSalary = sc.nextDouble();
		
		/* COMPOSIÇÃO
		 * - instância de Worker recebe no construtor:
		 * - nome, nível do Worker convertido em string, base salário e ...
		 * - também recebe uma instância do departamento porque ...
		 * - porque o departamento está contido no worker
		 */
		Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(departmentName));
		
		System.out.print("How many contracts to this worker? ");
		int n = sc.nextInt();
		
		
		// LOOP FOR PARA INSTANCIAR TODOS OS CONTRATOS
		for (int i = 1; i <= n; i++) {
			System.out.println("Enter contract #" + i + " data: ");
			System.out.print("Date (DD/MM/YYY): ");
			Date contractDate = sdf.parse(sc.next());
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			System.out.print("Durantion (hours): ");
			int hours = sc.nextInt();
			
			HourContract contract = new HourContract(contractDate, valuePerHour, hours);
			
			// - PARA ASSOCIAR O CONTRATO COM O TRABALHADOR
			worker.addContract(contract);
		}
		
		System.out.println();
		System.out.print("Enter month and year to calculate income (MM/YYYY): ");
		
		// VAMOS DIVIDIR A STRING
		
		String monthAndYear = sc.next();
		
		// pega monthAndYear e divide 0 onde começa e posição 2 é onde para (não pega a 2)
		// Integer.parseInt para converter
		int month = Integer.parseInt(monthAndYear.substring(0, 2));
		int year = Integer.parseInt(monthAndYear.substring(3));
		
		System.out.println("Name: " + worker.getName());
		System.out.println("Department: " + worker.getDepartment().getName()); // COMPOSIÇÃO :)
		System.out.println("Income for " + monthAndYear + ": " + worker.income(year, month));


				
		sc.close();
	}	
	
}