package application;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import entities.Product;

public class Program {
	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 900.0));
		list.add(new Product("Notebook", 1200.0));
		list.add(new Product("Tablet", 400.0));
		
		// MÉTODO 1 - Usando classe separada
		list.sort(new MyComparator());
		
		
		// MÉTODO 2 - Usando 
		Comparator<Product> comp = new Comparator<Product>() {
			
			@Override
			public int compare(Product p1, Product p2) {
				// o que que é comparar um produto com outro?
				// comparando por nomes igualando os tamanhos dos caracteres
				return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
			}	
		};
		
		// MÉTODO 3 - Função anônima
		Comparator<Product> compare = (p1, p2) -> {
			return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
		};
		
		
		// MÉTODO 4 - o sort já usa o Comparator no parâmetro, sem precisar instanciar
		list.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));
		
		for (Product p : list) {
			System.out.println(p);
		} 
	}
}