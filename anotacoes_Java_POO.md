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

_**OBS 2**_: Em algumas IDEs é possível gerar os métodos getter, setter e constructor automaticamente. Exemplo: **IntelliJ alt+insert**

_**OBS 3**_: É uma boa prática usar os metodos get e set até mesmo dentro da classe original.

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
