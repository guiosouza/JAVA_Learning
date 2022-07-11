package application;

import java.text.ParseException;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);

		method1();
		
		System.out.println("End of program");
		
	}
	
	public static void method1() {
		System.out.println("***METHOD1 START***");
		method2();
		System.out.println("***METHOD1 END***");
	} 

	public static void method2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("***METHOD2 START***");
		// tenta executar, caso dê erro (fica dendo do catch) ele executa a próxima
		try {
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);
		}
		// 'e' é apelido para a exceção
		catch (ArrayIndexOutOfBoundsException e) { // para pegar problema de não achar índice de array
			System.out.println("Invalid position!");
			e.printStackTrace(); // mostrar de onde vem a sequência de erros
		} 
		catch (InputMismatchException e) { // para pegar problema de digitar tipo de dado errado
			System.out.println("Input error");
		}	
		sc.close();
		System.out.println("***METHOD2 END***");
	}
}