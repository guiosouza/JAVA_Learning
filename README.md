# APREDIZADO DE JAVA COM ORIENTAÇÃO A OBJETO
Repositório dedicado ao aprendizado de JAVA :)

Segue abaixo a resolução de algumas situações que fiz usando a *programação orientada a objetos*.

> See you at the end of the code! :)

## ÍNDICE

- Meu primeiro programa com orientação a objeto;
- Usando String toString() para saída de dados;
- Usando métodos para manipular atributos da classe;
- Usando um método dentro de outro; 
- Condicionais dentro de um método; 
- Métodos que não precisam de instância (static);
- Passando mais de um parâmetro no método static; 
- Usando construtores e ecapsulamento;
- Validação de por 'char' e método dentro de um construtor
- Equação do segundo grau com switch e ecapsulamento;

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

_For more examples and usage, please refer to the [Wiki][wiki]._

## Development setup

Describe how to install all development dependencies and how to run an automated test-suite of some kind. Potentially do this for multiple platforms.

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

## 3) Usando métodos para manipular atributos da classe

* 0.1.1
    * FIX: Crash when calling `baz()` (Thanks @GenerousContributorName!)
* 0.1.0
    * The first proper release
    * CHANGE: Rename `foo()` to `bar()`
* 0.0.1
    * Work in progress

## Meta

Your Name – [@YourTwitter](https://twitter.com/dbader_org) – YourEmail@example.com

Distributed under the XYZ license. See ``LICENSE`` for more information.

[https://github.com/yourname/github-link](https://github.com/dbader/)

## Contributing

1. Fork it (<https://github.com/yourname/yourproject/fork>)
2. Create your feature branch (`git checkout -b feature/fooBar`)
3. Commit your changes (`git commit -am 'Add some fooBar'`)
4. Push to the branch (`git push origin feature/fooBar`)
5. Create a new Pull Request

<!-- Markdown link & img dfn's -->
[npm-image]: https://img.shields.io/npm/v/datadog-metrics.svg?style=flat-square
[npm-url]: https://npmjs.org/package/datadog-metrics
[npm-downloads]: https://img.shields.io/npm/dm/datadog-metrics.svg?style=flat-square
[travis-image]: https://img.shields.io/travis/dbader/node-datadog-metrics/master.svg?style=flat-square
[travis-url]: https://travis-ci.org/dbader/node-datadog-metrics
[wiki]: https://github.com/yourname/yourproject/wiki

Os códigos escritos levaram em consideração alguns padrões de organização como por exemplo:

- Seperação dos scripts por pacotes corretos. Isso porque é mais adequado criar uma entidade para cada tipo execução.

<img
  src ="https://github.com/guiosouza/JAVA_Learning/blob/main/repo%20images/product.png"
/>

<img
  src ="https://github.com/guiosouza/JAVA_Learning/blob/main/repo%20images/rectangle.png"
/>
