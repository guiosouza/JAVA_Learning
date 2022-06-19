# APRENDIZADO DE JAVA COM ORIENTAÇÃO A OBJETO
Repositório dedicado ao aprendizado de JAVA :)

Segue abaixo a resolução de algumas situações que fiz usando a *programação orientada a objetos* em JAVA.

> See you at the end of the code! :)

## ÍNDICE

1) Meu primeiro programa com orientação a objeto ([código](https://github.com/guiosouza/JAVA_Learning/tree/main/1%20-%20triangle-orientacao-objeto/src));
2) Usando `String toString()` para saída de dados ([código](https://github.com/guiosouza/JAVA_Learning/tree/main/2%20-%20rectangle-orientacao-objeto/src));
3) Usando métodos para manipular atributos da classe ([código](https://github.com/guiosouza/JAVA_Learning/tree/main/3%20-%20product-orientacao-objeto/src));
4) Usando um método dentro de outro ([código](https://github.com/guiosouza/JAVA_Learning/tree/main/4%20-%20employee-orientacao-objeto/src)); 
5) Condicionais dentro de um método ([código](https://github.com/guiosouza/JAVA_Learning/tree/main/5%20-%20notas-orientacao-objeto/src)); 
6) Métodos que não precisam de instância (static) ([código](https://github.com/guiosouza/JAVA_Learning/tree/main/6%20-%20static-member-test/src));
7) Passando mais de um parâmetro no método static ([código](https://github.com/guiosouza/JAVA_Learning/tree/main/7%20-%20static-member-dolar/src)); 
8) Usando construtores e encapsulamento ([código](https://github.com/guiosouza/JAVA_Learning/tree/main/8%20-%20product-using-constructor/src));
9) Validação do tipo `char` e método dentro de um construtor ([código](https://github.com/guiosouza/JAVA_Learning/tree/main/9%20-%20ex-1-accountDeposit(sobrecarga)/src));
10) Equação do segundo grau com `switch` e ecapsulamento ([código](https://github.com/guiosouza/JAVA_Learning/tree/main/10%20-%20ex-2-bhaskara/src));


## 1) Meu primeiro programa com orientação a objeto

Iniciando na programação orientada a objeto, vi a utilidade de métodos que podem ser reaproveitados depois. Exemplo desse [código](https://github.com/guiosouza/JAVA_Learning/blob/main/1%20-%20triangle-orientacao-objeto/src/entities/Triangle.java):

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

## 2) Usando `String toString()` para saída de dados

Esse exercício é muito parecido com o [anterior](https://github.com/guiosouza/JAVA_Learning/tree/main/1%20-%20triangle-orientacao-objeto/src)
Aprendi que posso usar o método `toString()` para exibir os dados de uma maneira eficaz. A classe instanciada não precisa chamar o método na hora da execução, basta apenas escrever o nome do objeto. Por exemplo:

Na classe molde temos:

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

No script que irá executar temos:

```sh
System.out.print(r1);
```

## 3) Usando métodos para manipular atributos da classe

Aqui comecei a ter uma ideia de que certos atributos precisam de métodos para serem manipulados (dependendo). O operador de atribuição `+=` e `-=` são uma boa pedida. [O exercício](https://github.com/guiosouza/JAVA_Learning/tree/main/3%20-%20product-orientacao-objeto/src) é basicamente para criar uma classe de produto onde alteramos valores de quantidade de produtos e valores monetário totais do estoque. Segue o diagrama que ajuda a criar a classe:

<img
  src ="https://github.com/guiosouza/JAVA_Learning/blob/main/repo%20images/product.png"
/>


## 4) Usando um método dentro de outro

Esse problema pede entrada as seguintes entradas de dados (nome, salário bruto, imposto). Depois ele pede um percentual para aumentar o salário líquido. Aí que entra a pegada desse exercício: para retornar esse valor, tive que usar o retorno do método do salário líquido e somar ele (coisa que achei que não ia funcionar, pois escreve o método com o nome completo na soma). Verifique:

```sh
public void increaseSalary(double percentage) {
	grossSalary = grossSalary * percentage / 100 + netSalary();
}
```
*Observação: não usei atribuição `*=` para não me confundir mais.*

## 5) Condicionais dentro de um método

A coisa mais legal que vi nesse script é sobre as possibilidades de uso dos métodos. Como eles são funcões, podem fazer de tudo, inclusive usar condicionais. Ficou muito elegante fazer esse "cálculo" ou processamento em outra classe que não fosse a de execução `Program`. Nesse problema, estamos tratando de um script para dar retorno se um aluno passou ou não, de acordo com 3 notas. E também quanto faltou para passar, caso falhar. Segue método discutido acima:

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

Os métodos estáticos podem passar despercebidos, uma vez que, se instanciarmos um objeto várias vezes, nossa aplicação vai funcionar. A vantagem aqui é que ao usar tais métodos, não teremos de ficar criando instância e consequentemente vai diminuir o tamanho do código. A solução [aqui](https://github.com/guiosouza/JAVA_Learning/tree/main/6%20-%20static-member-test/src) é somente para calcular circumferência, volume e PI de um círculo.

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

Esse script é uma melhoria do [exercício 3](https://github.com/guiosouza/JAVA_Learning/tree/main/3%20-%20product-orientacao-objeto/src). Com o encapsulamento o acesso a variáveis que são "perigosas" de manipular (podem atrapalhar o funcionamento correto do script) fica restrito. Com os `getters` e `setters` eu posso até acessar as variáveis, porém sob determinada condição. Principais vantagens do encapsulamento e construtores:

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
    * Impede que valores sejam alterados de forma indiscriminada. Para "encapsularmos" uma classe, podemos deixar os seus atributos em modo `private` e daí para obtermos os valores em outras classes, vamos usar os métodos `get` e `set` que impõem certos limites se assim desejarmos. [Neste mesmo exercício aqui](https://github.com/guiosouza/JAVA_Learning/blob/main/8%20-%20product-using-constructor/src/entities/Product.java) repare que o método `setQuantity` não existe porque já foi criado um método próprio para realizar essa operação (método que segue uma regra de negócio). :)


## 9) Validação por `char` e método dentro de um construtor

Neste [exemplo], usamos uma validação usando a posição de caractere `sc.next().charAt(0)`. Tentei usar por string com uma única letra, mas não funcionou. Outro destaque aqui é método dentro do construtor:

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

Assim quando a classe for instanciada ela já vai passar um valor para ser depositado!


## 10) Equação do segundo grau com switch e encapsulamento

A solução aqui foi um pouco diferente e deu um certo trabalho. O script é simplesmente para resolver equações de segundo grau **completas** ou **incompletas**. Utilizei o `switch` tanta na [classe de entrada de dados](https://github.com/guiosouza/JAVA_Learning/blob/main/10%20-%20ex-2-bhaskara/src/application/Program.java) quanto na [classe molde](https://github.com/guiosouza/JAVA_Learning/blob/main/10%20-%20ex-2-bhaskara/src/entities/Bhaskara.java) que faz as operações.

