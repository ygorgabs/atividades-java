# Anotações do Curso de Java

Tipos de cometários no Java

` // Este é um comentário de linha `

```
/*

    Comentário de multiplas linhas,
    é possivel escrever quantas linhas precisar
    até indicar o final
*/
```

```

/**
    Comentario para documentação - ex:

    Nome do programa
    @author Ygor
    @version 1.0
    @since 12-12-2024
*/
```

## Tipos primitivos

 Java é uma linguagem **fortemente tipada** por isso os tipos da variável importam ao declarar uma variável.
 Existem 3 formas de declarar uma variável, - Exemplo:

 * Normal: `int num = 3;`
 * Typecast: `int num = (int) 3;`
 * Com Classes(Wrapper class): `Integer num = new Integer(3);`

 **FAMILIA DE TIPOS**

![Familia dos tipos Java](<Captura de tela 2024-12-12 222018.png>)

**Utilizando a classe Scanner para receber dados**

`Scanner teclado = new Scanner(System.in);`

```
int idade = teclado.nextInt(); //para receber valores inteiros
float salario = teclado.nextFloat(); //para receber valores reais
String nome = teclado.nextLine(); //para receber strings
```

Existem outros tipos que o scanner pode receber(Olhar na IDE ou na internet).

## Operadores Aritméticos

* Adicão (+)
* Subtração (-)
* Multiplicação (*)
* Divisão (/)
* Resto (%)

Java segue a ordem de precedencia matemática, primeiro Divisão, Multiplicação e Resto, depois as outras operações.

### Operadores Unários

* Incremento (++)
* Decremento (--)

A posição desses operadores, antes ou depois da variável, influencia no resultado  do calculo.
A esquerda ele realiza o incremento/decremento antes da operação. A direita ele realiza o incremento/decremento depois.

### Operadores de Atribuição

* Somar e atribuir (+=)
* Subtrair e atribuir (-=)
* Multiplicar e atribuir (*=)
* Dividir e atribuir (/=)
* Resto e atribuir (%=)

### Classe Math

Outros cálculos e operações matemáticas no Java são realizadas através da Classe Math. Exemplo de operações que existem na classe Math: 

![Exemplo Math](<Captura de tela 2024-12-15 151649.png>)

Arredondamentos com a classe Math: 

![Arredondamentos](<Captura de tela 2024-12-15 152415.png>)

**Math.random** - gerador de números

Cria um número aleatório entre 0 e 1 (valor double)