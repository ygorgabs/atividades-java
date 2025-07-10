# Anotações do Curso de Java Orientado a Objetos

## O que é Programação Orientada a Objetos

* Alan Kay - Criador
* Funcionario da Xerox
* Criou a linguagem de programação Smalltalk para ser usada em um prototipo da empresa
* Smalltalk, primeira linguagem orientada a objetos

O objetivo da programação orientada a objetos é mudar o foco na hora de programar, pensar menos em detalhes (ciruitos, peças específicas, etc) e mais no objeto a ser programado. Desta forma, simplificando o ato de programar.

A maioria das principais linguagens de programação mais utilizadas atualmente são orientadas a objetos ou, pelo menos, utilizam os seus conceitos.

Vantagens:

* Confiável - O isolamento das partes gera um software seguro, por não afetar o conjunto completo no caso de modificações
* Oportuno - Possivel desenvolver as varias partes do software em paralelo
* Manutenível - Atualização mais fácil e que beneficia o todo
* Extensível - Software não estático, podendo adicionar mais funcionalidades
* Reutilizável - Poder reutilizar objetos de outros sistemas
* Natural - Mais fácil de entender e se preocupa mais com a funcionalidade do que com os detalhes da implementação

## Objetos

Um objeto pode ser uma coisa material ou abstrata que pode ser descrita por suas características, comportamento e estado.

Em outras palavras todo objeto tem: atributos, métodos(funções e procedimentos) e estado(caracteristicas atuais que podem ser identificadas através dos atributos).

O estado de uma classe/objeto é definido em um momento específico.

* __Classe__ : pode ser considerado um molde para criar um objeto. Exemplo:

```
public class Caneta {

    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    void rabiscar(){
        if(this.tampada){
            System.out.println("ERRO! Não posso Rabiscar");
        }else{
            System.out.println("Estou rabiscando");
        }
    }
}
```

* __Instanciar__ : gerar um objeto a partir de uma classe. Exemplo:

```
Caneta c1 = new Caneta();
c1.cor = "Azul";
c1.ponta = 0.5f;
c1.tampada = "falso";
c1.rabiscar(); // esse é um método pois tem parenteses

```
   * É possível criar vários objetos com atributos diferentes usando a mesma classe.

Definição bibliografica: 

**Classe** define os atributos e métodos comuns que serão compartilhados por um objeto.

**Objeto** é uma instância de uma classe.

## Visibilidade de um Objeto

A visibilidade indica o nível de acesso aos componentes de uma classe. Existem 3

* Público (+) - O objeto *public* pode ser usado por qualquer um onde ele esteja disponível. Todas as classes tem acesso.
* Privado (-) - O objeto *private* somente uma "pessoa" tem acesso a esse objeto. Somente a classe atual tem acesso.
* Protegido (#) - O objeto *protected* somente quem tem a permissão pode usar. A Somente a classe atual e suas subclasses tem acesso.

Exemplo:

```
public class Caneta {

    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;

    public void rabiscar(){
        if(this.tampada){
            System.out.println("ERRO! Não posso Rabiscar");
        }else{
            System.out.println("Estou rabiscando");
        }
    }

}
```

**OBS**: Toda linguagem de programação define uma visibilidade padrão para os objetos, que podem ser modificadas declarando-as como no exemplo

**OBS 2**: Procurar sobre UML e Diagrama de Classes

## Métodos Especiais

Métodos em geral podem ser criados seguindo a lógica conveniente ou usando o nome que o dev achar mais adequado. No entanto existem alguns métodos com funções específicas em que, por convenção, se usa padrões para criá-los e nomeá-los. 

### Método Acessor (Getter)

Por segurança definimos um nível de acesso private ou protected para algum atributo de uma classe, porém a informação desse atributo pode ser necessária. É nesses casos, onde o usamos os métodos getter.

### Métodos Modificadores (Setter)

São métodos modificam o status de um atributo da classe. Pelos mesmos motivos do método acessor é necessário restringir o acesso direto ao atributo, mas é possível modificar usando esses métodos. Normalmente, são métodos que exigem um parâmetro do usuário para serem executados e esses parâmetros serão tratados dentro do método para, ai sim, modificar o atributo.

Exemplo de criação:

```
public class Caneta {
    private String modelo;
    private float ponta;

    public String getModelo(){
        return this.modelo;
    }

    public void setModelo(String m){
        this.modelo = m;
    }

    public float getPonta(){
        return this.ponta;
    }

    public void setPonta(float p){
        this.ponta = p;
    }
}
```

Exemplo de uso:

```
Caneta c1 = new Caneta();
c1.setModelo("Bic Cristal");
c1.setPonta(0.5);
System.out.print(c1.getModelo());
System.out.print(c1.getPonta());
```

### Método Construtor (Construct)

Método que irá ser chamado para executar automaticamente algum procedimento ou modificação sem a interferência direta do usuário. Esses métodos são chamados assim que o objeto é criado e podem receber parâmetros ou não.

Exemplos:

```
public Caneta(){
        this.tampada();
        this.cor = "Azul";
    } // Metodo construtor sem parametros

Caneta c1 = new Caneta();
```

```
public Caneta(String m, String c, float p){
        this.modelo = m;
        this.cor = c;
        this.ponta = p;
    } //metodo construtor com parametros

Caneta c1 = new Caneta("BIC","Azul",0.5f);
```

_**OBS**_: No Java não precisa colocar o tipo de retorno no método construtor e o nome do método tem que ser o mesmo nome da classe.

_**OBS 2**_: Em classes com sobrecarga de construtores, é possível invocar um construtor a partir de outro utilizando a palavra-chave `this()`. Essa chamada deve, obrigatoriamente, ser a primeira instrução dentro do construtor, caso contrário ocorrerá um erro de compilação. Esse recurso é útil para evitar repetição de código entre construtores.

_**OBS 3**_: Em algumas IDEs é possível gerar os métodos getter, setter e constructor automaticamente. Exemplo: **IntelliJ alt+insert**

## Encapsulamento

Conceito de encapsulamento: Ocultar partes independentes da implementação, permitindo construir partes invisíveis ao mundo exterior.

Um software encapsulado segue padrões que irá proteger o usuario(dev) do código, evitando que um codigo "estrague" o trabalho do dev e que o dev "estrague" o codigo encapsulado. resumidamente é um envolucro que protege um código e padroniza ao mesmo tempo.

Um objeto encapsulado ele trabalha através de mensagens que irá receber e enviar informações para o usuario. Para o usuario saber o que aquele objeto faz será utilizado as interfaces que estabelecem esses limites do que aquele objeto é capaz de fazer.

Conceito de interface: Lista de serviços fornecidas por um componente. É o contato externo, que define o que pode ser feito com um objeto dessa classe.

_**OBS**_: Encapsular não é obrigatório, mas é uma boa prática de POO.

Vantagens:

* Tornar mudanças invisíveis
* Facilitar reutilizar código
* Reduzir efeitos colaterais

As interfaces não possuem atributos, somente métodos. Esses são métodos abstratos, pois não executam ação dentro do método, apenas indica a ação que será realizada. Todos os métodos da interface são publicos.

Quando se realiza o encapsulamento, todos os atributos de uma classe serão privados. Na classe deve ser indicado que ela implementará os metodos da interface(esses métodos serão colocados dentro da classe). Além desses métodos, devem ser implentados os getters e setters, visto que os atributos estão privados.

A interface é implementada em um arquivo diferente da classe.

* No Java utilizamos o modificador `abstract` nos métodos criados dentro das interfaces
* Para implentar uma interface numa classe usamos o `implements`. Exemplo: `public class ControleRemoto implements Controlador`

## Relacionamento entre classes

Além de atributos e métodos é possível com as classes criar relacionamentos entre elas.

### Relacionamento por agregação

Tipo abstrato de dados: transformar as classes em determinados tipos, criando, dessa forma, uma instancia de uma classe dentro de outra. Exemplo:

_Classe lutador instanciada dentro da classe Luta_

```
 public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
}
```

É possível usar tipos abstratos como parametros nos métodos.

Se usado um tipo abstrato de dados, também é possível utilizar no objeto desse tipo os métodos da classe instanciada. Exemplo: `desafiado.getCategoria();`

- Se existir um relacionamento entre as classes, deve ter um **papel**, um verbo que identifica essa relação. No caso das classes lutador e luta é o verbo **disputa**.
- Toda relação tem sua multiplicidade, que é o nivel de ocorrencia daquela relação. Exemplo: um lutador pode disputar **nenhuma ou várias lutas**, e uma luta pode ser disputada por **vários** lutadores.

**OBS:** O relacionamento dentro Diagrama de Classes é uma evolução do Diagrama de Entidade-Relacionamento(DER), por isto as semelhanças. No entanto, no Diagrama de Classes possui dados(atributos) e métodos, dirente do DER que só possui dados.

Um relacionamento por agregação é do tipo _tem um_. Determinada classe A tem um atributo que pertence a classe B, ou é uma instancia, criando assim o relacionamento com a outra classe.

## Herança

Conceito: Permite basear uma nova classe na definição de outra classe previamente existente. A herança é aplicada tanto para as características(atributos), quanto para os comportamentos(métodos)

Com a herança é possível criar uma classe sem precisar escrever tudo do zero, herdando elementos de outra classe.

* Classe Mãe(superclasse): quem passa as suas características e métodos.
* Classe Filha(subclasse): quem herda as características e métodos da classe mãe. Nesse caso, não necessita declarar novamente os métodos e atributos da superclasse, pois automaticamente serão associados a subclasse.

**OBS**: O conceito de superclasse e subclasse depende do ponto de vista. Um classe mãe também pode ser uma classe filha de outra. Um classe que não tem uma classe mãe é chamada de raiz. Já as subclasses que não dão origem a outras classes são chamadas de folhas.

* Classe ancestral: que ligação indireta com outra classe, sem considerar a classe mãe.
* Classe descendente: recebe herança indeireta de outra classe, sem ser sua subclasse.

### Herança de implementação

É uma herança pobre, pois não implementa mais nenhum método ou atributo, somente herda da superclasse. Utilizada para implementar uma classe abstrata.

### Herança para diferença

É uma herança forte, pois a subclasse que herda os métodos e atributos, também vai implementar os seus próprios.

### Abstrato e Final

As classes e métodos podem ser abstratas ou finais. Conceito:

* Classe abstrata: não pode ser instanciada. Só pode servir como progenitora(superclasse).
* Método abstrato: que é declarado, mas não implementado na progenitora. Só pode ser colocado dentro de uma interface ou classe abstrata.
* Classe final: Não pode ser herdada por outra classe. Obrigatoriamente folha.
* Método final: Não pode ser sobrescrito pelas subclasses. Obrigatoriamente herdado.

## Polimorfismo

**Polimorfo**: Muitas formas - Permite que um mesmo nome represente vários comportamentos diferentes.

* Assinatura do método: Quantidade e os tipos dos parâmetros do método. Métodos com essas caracterísitcas iguais tem a mesma assinatura.

### Polimorfismo de Sobreposição

Conceito: acontece quando substituímos um método de uma super classe na sua subclasse, usando a mesma assinatura.

- Nesse casso, no Java usamos o `@Override` para sobrescrever o método já proposto na classe mãe e alteramos o comportamento dele.
- A sobreposição acontece somente uma vez para o método dentro da classe e para realiza-la é obrigatório manter a mesma assinatura do método. 

### Polimorfismo de Sobrecarga

No Polimorfismo de Sobrecarga utilizamos vários métodos com o mesmo nome, porém com assinaturas diferentes (diferindo em número, tipo ou ordem dos parâmetros). Eles devem estar dentro da mesma classe. Esse tipo de polimorfismo permite usar diferentes soluções para uma mesma ação, de acordo com o contexto em que o método é utilizado, ou seja a assinatura.


**RESUMO**

![Tipos de Polimorfismo](image.png)