package application;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
				
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		// tenta executar, caso dê erro (fica dendo do catch) ele executa a próxima
		try {
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);
		}
		// 'e' é apelido para a exceção
		catch (ArrayIndexOutOfBoundsException e) { // para pegar problema de não achar índice de array
			System.out.println("Invalid position!");
		}
		catch(InputMismatchException e) { // para pegar problema de digitar tipo de dado errado 
			System.out.println("Invalid character");
		}
		
		System.out.println("End of program");
		
		sc.close();
		
	}	
}