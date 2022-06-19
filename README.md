# APREDIZADO DE JAVA COM ORIENTAÇÃO A OBJETO
Repositório dedicado ao aprendizado de JAVA :)

Segue abaixo a resolução de algumas situações que fiz usando a *programação orientada a objetos*.

> See you at the end of the code! :)

## ÍNDICE

1) Meu primeiro programa com orientação a objeto;
2) Usando String toString() para saída de dados;
3) Usando métodos para manipular atributos da classe;
4) Usando um método dentro de outro; 
5) Condicionais dentro de um método; 
6) Métodos que não precisam de instância (static);
7) Passando mais de um parâmetro no método static; 
8) Usando construtores e ecapsulamento;
9) Validação de por 'char' e método dentro de um construtor
10) Equação do segundo grau com switch e ecapsulamento;

![](header.png)

## 1) Meu primeiro programa com orientação a objeto

Vale o destaque aqui para a criação de métodos para reaproveitar se precisar:

```sh
public class Triangle {
	public double a;
	public double b;
	public double c;
	
	public double area() {
		double p = (a + b + c) / 2.0;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}
}
```

## 2) Usando String toString() para saída de dados

Esse exercício muito parecido com o anterior [anterior](https://github.com/guiosouza/JAVA_Learning/tree/main/1%20-%20triangle-orientacao-objeto/src)
Aprendi que posso usar o método `toString()` para exibir os dados de uma maneira eficaz. A classe instanciada não precisa chamar o método na hora da execução, basta apenas escrever o nome do objeto. Por exemplo:

Na classe:

```sh
public String toString() {
	return "AREA: "
			+ area()
			+ "\nPERIMETER: "
			+ perimeter()
			+ "\nDIAGONAL: "
			+ diagonal();
}
```

No script que irá executar:

```sh
System.out.print(r1);
```

## 3) Usando métodos para manipular atributos da classe

Aqui comecei a ter uma ideia de que certos atributos precisam de métodos para serem manipulados (dependendo). O operador de atribuição `+=` e `-=` são uma boa pedida. [O exercício](https://github.com/guiosouza/JAVA_Learning/tree/main/3%20-%20product-orientacao-objeto/src) é basicamente para criar uma classe de produto onde altermos valores de quantidade e valor monetário total do estoque. Segue o diagrama que ajuda a criar a classe:

<img
  src ="https://github.com/guiosouza/JAVA_Learning/blob/main/repo%20images/product.png"
/>



## 4) Usando um método dentro de outro

Problema que pede entrada de dados (nome, salário bruto, imposto). Depois ele pede um percentual para aumentar o salário líquido. Aí que entra a pegada desse exercício: para retornar esse valor, tive que usar o retorno do método do salário líquido (coisa que achei que não ia funcionar). Olhe o método:

```sh
public void increaseSalary(double percentage) {
	grossSalary = grossSalary * percentage / 100 + netSalary();
}
```
*Observação: não usei atribuição `*=` para não me confundir mais.*

## 5) Condicionais dentro de um método

A coisa mais legal que vi nesse script é sobre as possibilidades de uso dos métodos. Como eles são funcões, podem fazer de tudo, inclusive usar condicionais. Ficou muito elegante fazer esse "cálculo" ou processamento em outra classe que não fosse a de execução Program. Estamos tratando de um script para dar retorno se um aluno passou ou não, de acordo com 3 notas. E também quanto faltou para passar caso falhasse. Segue método falado:

```sh
public double missingPoints() {
	if (finalGrade() < 60.0) {
		return 60.0 - finalGrade(); // diferença
	} else {
		return 0.0;
	}
}
```

## 6) Métodos que não precisam de instância (static);

Os métodos estáticos podem passar despercebidos, uma vez que, se instanciarmos um objeto vários vezes com o código paracido, mesmo assim vai funcionar. A vantagem aqui é que ao usar tais métodos, não teremos de ficar criando instância e consequentemente vai diminuir o tamanho do código. A solução [aqui](https://github.com/guiosouza/JAVA_Learning/tree/main/6%20-%20static-member-test/src) é somente para calcular circumferência, volume e PI de um círculo.

## 7) Passando mais de um parâmetro no método static

A solução [deste exercício]()
