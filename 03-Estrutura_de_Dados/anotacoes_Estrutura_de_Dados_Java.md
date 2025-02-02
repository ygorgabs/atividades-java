# Estrutura de Dados

## Vetores

É uma estrutura de dados do mesmo tipo, ordenada e alocada de uma só vez em um bloco sequencial de memória, ou seja, possuem tamanho fixo. Com vetores é possível ter acesso imediato aos elementos de acordo com sua posição, entreanto, é mais difícil realizar modificações entre as posições do vetor.

**OBS:** Quando criamos um vetor de tipo referência cada posição vai armazenar um ponteiro para o objeto na memoria heap. Sendo assim, quando vamos definir o valor daquela posição do vetor é necessário instanciar para criar o objeto.

## Listas

É uma estrutura de dados homogênea(os dados tem que ser do mesmo tipo), ordenada, que inicia vazia e os dados são alocados dinamicamente dependendo da necessidade. Quando alocamos um elemento na lista, dizemos que ele ocupa um nó. No Java as listas são uma interface do tipo List. Essa interface possui implementação nas classes ArrayList, LinkedList, etc.

Vantagens:
* Tamanho variável
* Facilidade para inserir ou deletar informações

Desvantagens:
* Acesso sequencial - para acessar um elemento é necessário percorrer a lista até ele. Obs: dependendo da implementação da interface o acesso pode ser facilitado.

No java as listas não aceitam tipos primitivos, então é necessário usar as wrapper classes para definir o tipo de dados e para instanciar é necessário usar a classe que implementa a interface List. Exemplo: `List <String> list = new ArrayList<>();`

## Matrizes

É um arranjo biddimensional, de dados homogêneos e ordenada. Pode ser entendido como um vetor com linhas e colunas. Assim como os vetores, as matrizes também são alocados em um bloco continuo de memória. Possui as mesmas vantagens e desvantagens de um vetor.

Exemplo: `int[][] mat = new int [n][n];`

Para encontrar o numero de linhas da matriz usar `mat.length`.
Para encontrar o numero de colunas da matriz usar: `mat[n].length`. Sendo "n" o número da linha.