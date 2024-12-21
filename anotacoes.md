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

Obs: em Java se voce fizer uma conta com inteiros ele vai entender que o resultado que deseja é inteiro. Exemplo:

```
int x = 8, y = 3;
int w = x/y; // (8/3 = 2,66...)
System.out.print(w); // w == 2
```


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

## Operadores Lógicos e Relacionais

### Operador Ternário

Operação lógica simples, similar a um If..Else. Dividem em três componentes: a expressão; condição caso expressão seja verdadeira; e a condição caso a expressão seja falsa.

**Estrutura**: 
`int variavel = condicao ? valorSeTrue : valorSeFalse;`

É uma estrutura mais simples, consegue atribuir valor somente a uma variável por vez.

### Operadores Relacionais

* Maior que (>)
* Menor que (<)
* Maior ou igual (>=)
* Menor ou igual (<=)
* Igual (==)
* Diferente (!=)

*__Obs__*: Ao tentar comparar alguma variável com o operador ==, cuidado se essas variável foram atribuidas em forma de Wrapper class(Exemplo: variáveis String). Neste caso use o método .equals().

### Operadores Lógicos

* .E. (&&)
* .OU. (||)
* .XOU. (^)
* .NÃO. (!)

Tabela Verdade desses operadores:

![Tabela Verdade OP](<Captura de tela 2024-12-16 215146.png>)

É possivel usar mais de um operadore lógico em uma mesma expressão, dividindo com parenteses de acordo com o resultado que deseja. Exemplo: 
`(idade<= 16 && idade <18 )|| (idade > 70)`

## Estruturas condicionais

### Condição Simples

Estrutura condicional simples é aquela que tem somente um **If**, que irá realizar um bloco de código caso a determinada condição seja verdade.


### Condição Composta

Estrutura condicional composta terá dois blocos de para executar, um se a condição proposta for verdadeira e outro se a condição for falsa. **Estrutura If...Else**

### Condição Encadeada

Estrutura que possui duas ou mais condições em sequência. E dentro de cada uma das condições um bloco de código caso verdadeira. **Estrutura If... Else If... Else**

Exemplo:

```
int a = Integer.parseInt(txtAno.getText());
                int i = 2024 - a;
                lblIdade.setText("Idade: "+ i);
                if (i < 16){
                    lblR.setText("Não vota!");
                }else if ((i >= 16 && i <18)||i>70){
                    lblR.setText("Voto Opcional");
                } else {
                    lblR.setText("Voto Obrigatório!");
                }
```