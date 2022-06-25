package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Program {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		// não aceita tipo primitivo, por isso o integer;
		// arraylist é melhor para implementar a interface List;
		List<String> list = new ArrayList<>();
		
		list.add("Phlipe");
		list.add("Guilherme");
		list.add("Ana");
		list.add("Eduardo");
		list.add("Gustavo");
		list.add("Everaldo");
		
		// adicionando na posição 2;
		list.add(2, "Samuel");
		System.out.println("O tamanho da lista é de " + "[" + list.size() + "]" + " lugares.");	
		
		for (String lista : list) {
			System.out.println(lista);
		}
		System.out.println("--------------------------------------------------");
		
		// remove da lista tal que: se caractere array 0 é a letra "E";
		list.removeIf(lista -> lista.charAt(0) == 'E');
		
		for (String lista : list) {
			System.out.println(lista);
		}
		
		System.out.println("--------------------------------------------------");
		
		System.out.println("Índice de Guilherme: " + list.indexOf("Guilherme"));
		System.out.println("Índice de Gus: " + list.indexOf("Gus")); // - 1 não tem	
		System.out.println("Índice de Gus: " + list.indexOf("Gus")); // - 1 não tem
		
		System.out.println("--------------------------------------------------");
		
		/* filtrando a lista anterior;
		 * O que foi feito abaixo:
		 *  1 - convertemos para stream();
		 *  2 - fazemos a operação lambda de filtro;]
		 *  3 - Depois voltar para o formato de lista;
		 */
		List<String> result = list.stream().filter(lista -> lista.charAt(0) == 'G').collect(Collectors.toList());
		for (String lista : result) {
			System.out.println(lista);
		}
		
		System.out.println("--------------------------------------------------");
		// se não existir ele vai retornar null;
		String name = list.stream().filter(lista -> lista.charAt(0) == 'G').findFirst().orElse(null);
		System.out.println(name);
		sc.close();
	}
}