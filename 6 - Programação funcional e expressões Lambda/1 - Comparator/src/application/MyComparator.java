package application;

import java.util.Comparator;

import entities.Product;

public class MyComparator implements Comparator<Product> {

	@Override
	public int compare(Product p1, Product p2) {
		// o que que é comparar um produto com outro?
		// comparando por nomes igualando os tamanhos dos caracteres
		return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
	}


}