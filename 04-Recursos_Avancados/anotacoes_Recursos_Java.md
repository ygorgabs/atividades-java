# Recursos Avaçados

## Classe Object e toString()

Todas as classes do Java são subclasses da classe Object e herdam os seguintes métodos:

* getClass: retorna o tipo de objeto
* equals: compara se dois objetos são iguais
* hashCode: retorna o código hash do objeto
* toString: converte o objeto para String

O método toString pode ser sobrescrito na classe criada para apresentar o conteudo necessário. Dentro de metodos de saida como `System.out.print()` se usarmos como parametro um objeto instanciado sem explicitar o método, automaticamente o Java chama o método toString. 

## Membros estáticos

São atributos ou métodos declarados com o modificador `static` e que não precisam ser instanciados dentro de um objeto para serem chamados, e são chamado na aplicação a partir do nome da classe. Por este motivo são também chamados de membros de classe.

Sao utilizadas normalmente em classes utilitarias, como a **classe Math**, e na declaração de constantes.

Uma classe também pode receber o modificador `static`, porém esse tipo de classe não pode ser instanciada.

**OBS:** Não é possível chamar um método que não possui o modificador estático dentro de um método estático, quando estão na mesma classe.

Um método ou atributo pode receber o modificador `static` para os casos que o seu resultado independe de um objeto especifico, como é no caso de constantes e calculos matemáticos.

## Tipos de Referência x Tipos de Valor

### **Variáveis de tipo referência:** 

São variáveis em que seu tipo é uma classe. Essas váriaveis não armazenam valores, mas sim um endereço de memória, que aponta para um local na memoria chamado *heap* que armazena as informações de um objeto. Exemplo: Classe String.

Principais características:

- Usufrui recursos do POO
- Objetos precisam ser instanciados ou apontar para um objeto existente
- Aceita valor nulo
- Objetos não sao desalocados pelo garbage colector

**Valores Padrão:** Quando instanciamos uma classe ou array seu atributos recebem valores padrão que podem ser
- números(int, double, etc): 0
- boolean: false
- char: caractere 0
- objeto(String ou outra classe): null

**Null Pointer Exception:** Esse é um erro que aparece no Java quando tentamos usar metodos ou atributos de variáveis de tipo referência que estão com valor nulo ou que ainda não foram instanciados. Isto acontece pois a variável não possui o "ponteiro" que indica qual objeto acessar, então o Java lança uma exceção que pode interromper o programa. Na maioria dos casos, esse tipo de erro se deve a um problema na lógica do programa, então examine o código caso se depare com `NullPointerException`.

### **Váriaveis de tipo valor** 

São variáveis de tipos primitivos. Elas são "caixas" que realmente armazenam valores no campo de memória chamado stack. Exemplo: int, char, double, boolean.

Principais características: 

- São mais simples e performáticas
- Não precisam ser instanciadas, assim que declaradas podem ser usadas
- Não aceita valor nulo
- Variáveis são desalocadas imediatamente assim que o escopo é finalizado.

## Desalocação de Memória

**Garbage colector:** Processo que gerencia o uso da memória. Ele monitora o uso do heap e desaloca objetos que não possuem mais referência, ou seja, não possui mais variáveis do tipo rerencia apontando para seu endereço.

**Desalocação por escopo:** Processo que elimina as variáveis do tipo valor após o fim do escopo. Exemplo, váriavel declarada dentro de um if e que será eliminada após o fim do if.

## Boxing, Unboxing e Wrapper Classes

**Boxing:** Processo de conversão de um objeto do tipo valor(primitivo) para um tipo de referência compatível. Exemplo:

```
int x = 20;
Object obj = x;
```

**Unboxing:** Processo de conversão de um objeto de tipo referência para um objeto de tipo valor. Exemplo:

```
int x = 20;
Object obj = x;
int y = (int) obj;
```

**Wrapper Classes:** São classes equivalente aos tipos primitivos, e que permitem utilizar os benefícios da Orientação a Objetos. É normalmente usada em sistemas de informação, para compatibilizar o programa com os bancos de dados, visto que muitos campos dos BD aceitam valores nulos.

As wrapper classes do Java são: Boolean, Character, Byte, Short, Integer, Long, Float e Double.

**OBS**: As wrapper classes tem o mesmo nome dos tipos primitivos, mas para diferenciá-las, elas começam com a letra maiúscula.

## Data e Hora 

Objetos data-hora no Java são imutáveis. para realizar modificações é necessário criar um novo objeto.

Principais classes de Data e Hora (A partir do Java 8)

Data-Hora local:

- LocalDate: para Data
- LocalDateTime: Data e Hora

Data-Hora Global

- Instant: para pegar um instante no tempo.

Outros:

- Duration
- ZoneId
- ChronoUnit

## Enum 

Os Enums são tipos especiais que agrupam valores fixos e pré-definidos. É uma lista de opções que garante que somente aqueles valores seja aceitos, evitando erros e deixando o código mais claro. Exemplo:

```
public enum DiaDaSemana {
    SEGUNDA, TERCA, QUARTA, QUINTA, SEXTA, SABADO, DOMINGO;
}

// uso

DiaDaSemana hoje = DiaDaSemana.SEXTA;
System.out.Print(hoje);
```

Características:

* Todo Enum extende a classe java.lang.Enum
* Não existe herança entre enums, ou seja, não podem herdar atributos e métodos de outras enums
* Podem implementar interfaces
* Não podem ser instanciadas com new
* Podem ser comparadas usando ==
* Pode ser declarado separadamente ou dentro da classe
* Permite adicionar comportamentos(métodos) a essas constantes

*OBS:* Cada enum valor do enum é uma instancia, por esse motivo quando definimos um contrutor, cada enum deve passar os respectivos parametros.

Todo enumerador possui um método chamado values() que retorna um array com todos os valores contidos naquele enum.

Outro método é o valueOf(), que recebe um parametro String e retorna a constante correspondente. Esse método é case sensitive, entao se o parametro nao for exatamente o nome da constante que deseja ele irá lançar uma excessão.

Outra coisa possível com enums é utilizar métodos abstratos para que sejam aplicados aplicações diferentes para o método dependendo da constante.