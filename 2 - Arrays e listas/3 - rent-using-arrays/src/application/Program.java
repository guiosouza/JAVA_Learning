package application;

import java.text.ParseException;
import java.util.Scanner;

import entities.Room;

public class Program {
	
	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		Room[] vect = new Room[10];
		
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		
		// Percorrer vetor
		for (int i = 1; i <= n; i++) {
			
			System.out.println();
			System.out.println("Rent #" + i + ":");
			System.out.print("Name: ");
			sc.nextLine();		
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			
			// O índice do quarto é informado e recebe o objeto também
			vect[room] = new Room(name, email);
		}
		
		System.out.println();
		System.out.println("Busy rooms:");
		
		// Percorre todos os quartos, os que não forem null, são imprimidos
		// Isso serve para que seja exibido em ordem crescente
		for (int i = 0; i < 10; i++) {
			if (vect[i] != null) {
				System.out.println(i + ": " + vect[i]);
			}
		}
		sc.close();
	}
}
