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
Classe Caneta
    modelo: Caractere
    cor: Caractere
    ponta: Real
    carga: Inteiro
    tampada: Lógico

    Metodo rabiscar()
        Se(tampada) entao
            Escreva(Erro)
        Senao
            Escreva("Rabisco")
        Fimse
    FimMetodo
FimClasse
```

* __Instanciar__ : gerar um objeto a partir de uma classe. Exemplo:

```
c1 = nova Caneta
c1.cor = "Azul"
c1.ponta = 0.5
c1.tampada = "falso"
c1.rabiscar() // esse é um método pois tem parenteses

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
Classe Caneta
    publico modelo: Caractere
    publico cor: Caractere
    privado ponta: Real
    protegido carga: Inteiro
    protegido tampada: Lógico

    publico Metodo rabiscar()
        Se(tampada) entao
            Escreva(Erro)
        Senao
            Escreva("Rabisco")
        Fimse
    FimMetodo
FimClasse
```

**OBS**: Toda linguagem de programação define uma visibilidade padrão para os objetos, que podem ser modificadas declarando-as como no exemplo

**OBS 2**: Procurar sobre UML e Diagrama de Classes

## Métodos Especiais

Métodos em geral podem ser criados seguindo a lógica conveniente ou usando o nome que o dev achar mais adequado. No entanto existem alguns métodos com funções específicas em que, por convenção se usa padrões para criá-los e nomeá-los. 

### Método Acessor (Getter)

Por segurança definimos um nível de acesso private ou protected para algum atributo de uma classe, porém a informação desse atributo pode ser necessária. É nesses casos, onde o usamos os métodos getter.

### Métodos Modificadores (Setter)

São métodos modificam o status de um atributo da classe. Pelos mesmos motivos do método acessor é necessário restringir o acesso direto ao atributo, mas é possível modificar usando esses métodos. Normalmente, são métodos que exigem um parâmetro do usuário para serem executados e esses parâmetros serão tratados dentro do método para, ai sim, modificar o atributo.

Exemplo de criação:

```
Classe Caneta
    publico modelo: Caractere
    privado ponta: Real

    publico Metodo getModelo()
        retorne modelo
    FimMetodo

    publico Metodo setModelo(m:Caractere)
        modelo = m
    FimMetodo

    publico Metodo getPonta()
        retorne ponta
    FimMetodo

    publico Metodo setPonta(p:Real)
        ponta = p
    FimMetodo
FimClasse
```

Exemplo de uso:

```
c1 = nova Caneta
c1.setModelo("Bic Cristal")
c1.setPonta(0.5)
Escreva(c1.getModelo())
Escreva(c1.getPonta())
```

### Método Construtor (Construct)

Método que irá ser chamado para executar automaticamente algum procedimento ou modificação sem a interferência direta do usuário. Esses métodos são chamados assim que o objeto é criado e podem receber parâmetros ou não.

Exemplos:

```
Classe Caneta
    
    Metodo construtor()
        tampar()
        cor = "Azul"
    FimMetodo
FimClasse

c1 = nova Caneta
```

```
Classe Caneta
    
    Metodo construtor(m:caractere,c:caractere,p:real)
        setModelo(m)
        setPonta(p)
        setCor(c)
    FimMetodo
FimClasse

c1 = nova Caneta("Bic","Azul",0.5)
```











