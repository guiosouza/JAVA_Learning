package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Program {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		// não aceita tipo primitivo
		// arraylist é melhor para implementar a interface List;
		// - 1 List (declaração)
		// - 2 Tipo da lista <String>
		// - 3 Instância = classe que implementa a interface será ArrayList<>();
		List<String> list = new ArrayList<>();
		
		// 1 - ADICIONANDO ITENS NA LISTA
		list.add("Phlipe");
		list.add("Guilherme");
		list.add("Ana");
		list.add("Eduardo");
		list.add("Gustavo");
		list.add("Everaldo");
		
		// 2 - ADICIONANDO EM DETERMINANDA POSIÇÃO (NA 2);
		list.add(2, "Samuel");
		System.out.println("O tamanho da lista é de " + "[" + list.size() + "]" + " lugares.");	
		
		// 3 - IMPRIMINDO A LISTA COM FOR EACH;
		for (String lista : list) {
			System.out.println(lista);
		}
		System.out.println("--------------------------------------------------");
		
		// 4 - REMOVENDO DA LISTA: SE O 'CHAR' DA PRIMEIRA LETRA DA STRING FOR 'E', SERÁ REMOVIDO DA LISTA;
		// Função lambda. Pega um valor 'lista' que é string,e e me retorna se 'char' na posição 0 é true;
		list.removeIf(lista -> lista.charAt(0) == 'E');
		
		// 5 - IMPRIMINDO LISTA NOVAMENTE
		for (String lista : list) {
			System.out.println(lista);
		}
		
		System.out.println("--------------------------------------------------");
		
		// 6 - MOSTRANDO BUSCAS NA LISTA
		System.out.println("Índice de Guilherme: " + list.indexOf("Guilherme"));
		System.out.println("Índice de Gus: " + list.indexOf("Gus")); // - 1 não tem	
		System.out.println("Índice de Gus: " + list.indexOf("Gus")); // - 1 não tem
		
		System.out.println("--------------------------------------------------");
		
		/* 7 - FILTRANDO COM STREAM
		 * O que foi feito abaixo:
		 *  1 - convertemos para stream();
		 *  2 - fazemos a operação lambda de filtro;
		 *  3 - Depois voltar para o formato de lista;
		 *  4 - Lembrando que result é uma nova lista que recebe o filtro da lista 'list'
		 */
		List<String> result = list.stream().filter(lista -> lista.charAt(0) == 'G').collect(Collectors.toList());
		for (String lista : result) {
			System.out.println(lista);
		}
		
		// 8 - ENCONTRAR UM ELEMENTO DA LISTA QUE ATENDA UM CERTO PREDICADO
		// Queremos encontrar o primeiro elemento com a letra 'G'
		System.out.println("--------------------------------------------------");
		// se não existir ele vai retornar null;
		String name = list.stream().filter(lista -> lista.charAt(0) == 'G').findFirst().orElse(null);
		System.out.println(name);
		sc.close();
	}
}
