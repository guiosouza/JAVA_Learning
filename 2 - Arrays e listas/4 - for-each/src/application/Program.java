package application;

import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] vect = new String[] {"Guilherme", "João", "Maria"};
		
		// dentro da condição: tipo, apelido : nome da coleação;
		for (String obj : vect) {
			System.out.println(obj);
		}
		
		sc.close();
	}
}