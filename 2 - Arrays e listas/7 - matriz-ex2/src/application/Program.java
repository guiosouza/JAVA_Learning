package application;

import java.util.Scanner;


public class Program {
	
	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		
		// ENTRADA DE DADOS
		System.out.print("Qual será a quantidade de colunas e linhas da matriz? ");
		int n = sc.nextInt();

		/* INSTANCIANDO MATRIA NA MEMÓRIA	
		 * 1 - tipo das variáveis
		 * 2 - duas chaves para mostrar que tem duas dimensões
		 * 3 - colocar nas chaves o tamanho que será a matriz
		 */
		int[][] mat = new int[n][n];
		
		System.out.println("Digite os valores abaixo para a matrix: ");
		
		// Primeiro for para percorrer as linhas
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				
				// matriz na posição linha i e coluna j recebe:
				mat[i][j] = sc.nextInt();
			} 
		}
		
		// Diagonal
		System.out.println();
		System.out.print("Diagonal principal: ");
		
		for (int i = 0; i < mat.length; i ++) {
			System.out.print(mat[i][i] + " ");
		}
		
		
		// contar os números negativos
		int contador = 0; 
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				
				// se for negativo adiciona no contador
				if (mat[i][j] < 0) {
					contador = contador + 1;
				}
			} 
		}
		
		// imprimir números negativos
		System.out.println();
		System.out.print("Quantidade de números negativos: " + contador);
		
		sc.close();
		
		// ---------------------------------

		/* OBSERVAÇÕES
		 * - A matriz é um vetor de vetores
		 * - Poderíamos fazer assim no loop:
	     * ---------------------------------
	     * for (int i = 0; i < n; i++) {
		       for (int j = 0; j < n; j++) {
					
					mat[i][j] = sc.nextInt();
				} 
			}	
	     * ---------------------------------
		 * mat[][] é o array principal
		 * mat[i].length se refere ao tamanho da linha do índice
		 * que é percorrido como se fossem colunas
		 * portanto: percorremos o indíces e depois as linhas :)
		 */
	}
}