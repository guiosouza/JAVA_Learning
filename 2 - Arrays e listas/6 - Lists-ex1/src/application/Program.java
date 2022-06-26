package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Employee;

public class Program {
	
	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		
		// 1 - criando uma lista do tipo da classe Employee para poder receber todos dados
		List<Employee> list = new ArrayList<>();
		
		System.out.print("How many employees will be registered? ");
		int N = sc.nextInt();
		
		// 2 - for para adicionar na lista
		for (int i = 0; i < N; i++) {
			System.out.println("Employee #" + (i + 1) + ":");
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			sc.nextLine();
			System.out.print("Name: ");
			String name =  sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			
			Employee employee1 = new Employee(id, name, salary);
			
			// adicionar na lista
			list.add(employee1);
			System.out.println();
		}
		
		
		// 3 - verifica o id
		// foi criada uma função para verificação
		System.out.print("Enter the employee id that will have salary increase: ");
		int idSalary = sc.nextInt();
		sc.nextLine();
		
		Integer pos = position(list, idSalary);
		if (pos == null) {
			System.out.println("The informed id doesn't exist!");
		}
		else {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			
			/* get(pos) acessa o funcionário que está na posição pos
			 * 
			 */
			list.get(pos).increaseSalary(percentage);
			
			System.out.println();
			System.out.println("List of employees:");

			// for each para imprimir a lista de funcionários
			for (Employee employee1 : list) {
				System.out.println(employee1);
			}
		}
		

		
		sc.close();
	}
	/* ----------------------------------------------------------- 
	* - vai receber uma lista de funcionários e um id
	* - o papel desse método é dizer qual é a posição do id na lista
	* - 
	*/
	public static Integer position(List<Employee> list, int id) {
		for (int i = 0; i < list.size(); i ++) {

			
			/* ----------------------------------------------------------- 
			* list.get() - pega um elemento na posição
			* .getId(i) - pega o id de list da classe Employee (até arreia essa POO)
			*/
			if (list.get(i).getId() == id) {
				return i;
			}
		}
		// esgotou o for, retorna null
		return null;
	}
}
