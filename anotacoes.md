# Anotações do Curso de Java

Aula 06

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