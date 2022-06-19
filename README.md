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
9) Validação de tipo 'char' e método dentro de um construtor
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

A solução [deste exercício](https://github.com/guiosouza/JAVA_Learning/tree/main/7%20-%20static-member-dolar/src) visa calcular o valor que será pago no final pelo usuário de acordo com o preço do dólar e quantos dólares serão comprados.

Dou destaque aqui na solução que encontrei de usar dois parâmetros no método do cálculo. Como os dois valores serão usados como parâmetros e não preciso ficar criando atributos, aqui também um método estático é a melhor solução:

```sh
package entities;

public class Dolar {
	
	public static double calculatorDolar(double value, double quantity) {
		double valueRaw = value * quantity;
		return valueRaw = valueRaw + (valueRaw * 0.06);
	}

}
```
## 8) Usando construtores e ecapsulamento

Esse script é uma melhoria do [exercício 3](https://github.com/guiosouza/JAVA_Learning/tree/main/3%20-%20product-orientacao-objeto/src). Com o encapsulamento o acesso a variáveis que são perigosas (podem atrapalhar o funcionamento correto do script) fica restrito. Com os `getters` e `setters` eu posso até acessar as variáveis, porém sob determinada condição. Principais vantagens do encapsulamento e construtores:

* Construtores:
    * Obriga o objeto a ser criado com atributos preenchidos. O construtor é criado pelo:
```sh
NomeDaClasse(atributo1, atributo2, atributo3, ...) {
	this.atributo1 = atributo1;
	this.atributo2 = atributo2;
	this.atributo3 = atributo3;
}
```
*Lembrando que o 'this' somente é usado para referenciar o atributo da classe e não o parâmetro. Pode-se colocar os nomes dos parametros que quiser, aí nesse caso não precisaria usar o 'this'.*

* Encapsulamento:
    * Impede que valores sejam alterados de forma indiscriminada. Para "encapsularmos" uma classe, podemos deixar os seus atributos em modo `private` e dái para obtermos os valores em outras classes, vamos usar os métodos `get` e `set` que impõe certos limites se assim desejarmos. [Neste mesmo exercício aqui](https://github.com/guiosouza/JAVA_Learning/blob/main/8%20-%20product-using-constructor/src/entities/Product.java) repare que que o método `setQuantity` não existe porque já foi criado um método próprio para realizar essa operação :)


## 9) Validação de por 'char' e método dentro de um construtor

Neste [exemplo], usamos uma validação usando a posição de caractere `sc.next().charAt(0)`. Tentei usar por string com uma única letra, mas não funcionou. Outro destaque aqui é isso:

```sh
public Account(int accountNumber, String holder, double initialValue) {
		this.accountNumber = accountNumber;
		this.holder = holder;
		deposit(initialValue);
}
```

O método `deposit` foi criado logo abaixo:

```sh
public void deposit (double value) {
	accountBalance = accountBalance + value;
}
```

Assim quando a classe for instanciada ela já vai passar um valor para ser depositado :)


## 10) Equação do segundo grau com switch e ecapsulamento

A solução aqui foi um pouco diferente e deu um certo trabalho. O script é simplesmente para resolver equações de segundo grau **completas** ou **incompletas**. Utilizei o `switch` tanta na [classe de entrada de dados](https://github.com/guiosouza/JAVA_Learning/blob/main/10%20-%20ex-2-bhaskara/src/application/Program.java) quanto na [classe que molde](https://github.com/guiosouza/JAVA_Learning/blob/main/10%20-%20ex-2-bhaskara/src/entities/Bhaskara.java) que faz as operações.

