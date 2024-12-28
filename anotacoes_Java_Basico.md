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

Exemplo:

```

if (idade<= 16 && idade <18 ){
    System.out.print("Voto Opcional")
}
```

### Condição Composta

Estrutura condicional composta terá dois blocos de para executar, um se a condição proposta for verdadeira e outro se a condição for falsa. **Estrutura If...Else**

Exemplo:

```

            if (i < 16){
                    lblR.setText("Não vota!");
            }else {
                    lblR.setText("Voto Obrigatório");
            }
```

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

### Condição de Múltipla Escolha (Switch)

Estrutura condicionais onde é possivel vários cenários de escolha dependendo do conteudo da váriavel. Cada cenário tem um bloco de código a ser realizado. **Estrutura Switch...Case**

No java, ao final de cada bloco de código é necessário usar `break;`
A opção `Default:` é a usada para caso nenhuma das opções anteriores seja verdadeira. É opcional.
Switch não funciona para intervalos de números, é necessário criar um  caso para cada número. Essa estrutura só funciona com números inteiros, não sendo possível usar com variáveis double/float.

Exemplo:

```

int perna = tec.nextInt();
        String tipo;
        System.out.print("Isso é um(a): ");

        switch (perna){
            case 1:
                tipo = "Saci";
                break;
            case 2:
                tipo = "Bípede";
                break;
            case 3:
                tipo = "Tripé";
                break;
            case 4:
                tipo = "Quadrúpede";
                break;
            case 6:
                tipo = "Aranha";
                break;
            default:
                tipo = "ET";
        }
        System.out.println(tipo);

```

## Estruturas de Repetição

Estruturas de repetição executam um determinado bloco de código enquanto uma condição for verdadeira.

### Repetição com Teste no Início

Nessa estrutura a verificação se a condição é verdadeira ocorre no inicio da execução e vai repetir até que a condição se torne falsa. Esse bloco de código pode não ser executado caso a condição seja falsa logo no início. No Java é utilizado o `while`.

Exemplo: 

```
int cc = 0;

while(cc < 4){
    System.out.print("Cambalhota");
    cc++;
}

```

**MUDANÇAS DE FLUXO DE UM LAÇO DE REPETIÇÃO**

Existem comando que podem alterar o fluxo de execução de um bloco de código dentro de um laço de repetição.

* `continue` : ao chegar nesse comando os próximos comandos são ignorados e o laço volta para a condição.
* `break`: ao chegar nesse comando os próximos comandos serão ignorados e o laço é finalizado.

### Repetição com Teste no Final

Essa estrutura de repetição verifica se uma condição é verdadeira ao final da execução de um bloco de código. Garante que esse bloco seja executado ao menos uma vez. No java é utilizado o `do...while`.

No java essa estrutura, diferente do portugol, funciona como um `while` invertido

Exemplo:

```
int cc = 0;

do{
    System.out.print("Cambalhota");
    cc++;
}while(cc < 4);

```

**_OBS:_** Nessa estrutura de controle é necessário usar _ponto e virgula_ após a condição lógica.

### Repetição com Variável de controle

Essa estutura diferente das outras já possui uma váriavel declarada nativamente dentro do comando para realizar a iteração. Estrutura ideal para repetir um bloco de codigo um exato determinado número de vezes. No java é utilizado o `for`.

O incremento da váriavel de controle é realizado dentro da estrutra. No java o incremento é obrigatório.

Exemplo:

```
for (int cc = 0; cc < 4; cc++){
    System.out.print("Cambalhota");
}
```

**LAÇOS ANINHADOS**

É possível utilizar uma estrutura de repetição dentro da outra. No entanto, cabe apontar que ao iniciar o laço principal, será realizado todas as iterações do laço de dentro para, ai sim,  finalizar iteração do laço principal.

## Vetores

Um vetor em Java é tratado como uma váriavel composta. Esses vetores também são objetos e possuem métodos e atributos. A primeira casa de um vetor, assim como em outras linguagens, é o 0.

Exemplo de delaração de vetor: 

`int num[] = new int [4];` 

Atribuir valores em Java é simples. Para colocar em uma casa específica do vetor é so colocar o nome dele e entre colchetes o número da casa. Exemplo:

` num[0] = 3; `

Outra forma é declarar e popular o vetor e ao mesmo tempo. Exemplo:

`int num[] = {3,5,8,2};`

Todo vetor tem um tamanho e esse tamanho é definido ao declara-lo.

### Foreach

Estrutura de repetição usada para iterar dentro de um vetor. No java ele é uma espécie de for simplificado. A cada iteração a variavel criada dentro do for vai receber o valor da posição do vetor. Não é preciso declarar um contador.

Exemplo:

```
int num[] = {3,5,8,2};

for(int valor : num){
    System.out.print(valor);
}
```

### Classe Arrays

O java tem uma classe chamada Arrays que é posível trabalhar mais facilmente com vetores, podendo colocar eles em ordem ou fazer uma busca dentro do vetor.

* `Arrays.Sort(num);` - método para colocar o vetor em ordem crescente.
* `Arrays.binarySearch(num,1);`- método que realiza um busca retorna em qual posição esta um valor dentro do vetor, sendo o primeiro parametro o vetor e o segundo parametro o que deseja buscar. Se não localizar ele vai retornar um valor negativo.
* `Arrays.fill(num,0);` - método que pode ser usado para preencher todas as casas do vetor com um mesmo valor.

**_OBS_** Não existem vetores com indices negativos no Java.

## Métodos

É possível criar um bloco de código que pode ser reutilizado várias vezes para evitar repetições e deixar o código mais limpo. Em algoritmos são chamados de procedimentos e funções.
Em Java, não existe uma palavra para definir uma função ou procedimento como `function` no JavaScript, por exemplo. 

No lugar de funções, a linguagem utiliza _métodos_, que cumprem o mesmo papel, e são definidos pelo seu tipo de retorno.

### Método sem retorno - *void*  - Exemplo:

Esse tipo de método não retorna nada para onde ele está sendo chamado, apenas executa o bloco de código.

```
void soma(int a, int b){
    int s = a+b;
    System.out.print(s);
}

soma(5,2);
```

### Método com retorno - *tipo primitivo(int, String, float...)* - Exemplo:

Esses tipo de método irá retornar para onde ele está sendo chamado um valor de acordo com o tipo primitivo escolhido ao criá-lo

```
int soma(int a, int b){
    int s = a+b;
    return s;
}

int sm = soma(5,2);
```

*_OBS_*: um método `static` indica que ele pertence a classe que foi declarada e não a uma instancia dela. 
*_OBS 2_*: não é possivel chamar um método não estático dentro de um método estático.
