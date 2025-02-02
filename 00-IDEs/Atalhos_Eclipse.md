# Atalhos no Eclipse IDE

## Tabela de shortcuts

# Atalhos no Eclipse (Windows)

| **Atalho (Windows)**        | **Descrição**                                                                                                                |
|-----------------------------|----------------------------------------------------------------------------------------------------------------------------|
| Ctrl + 3                   | Foca na caixa de pesquisa do Quick Access.                                                                                  |
| Ctrl + S                   | Salva o editor atual.                                                                                                       |
| Ctrl + 1                   | Sugere correções rápidas (Quickfix) para erros e avisos, dependendo da posição do cursor.                                   |
| Ctrl + Espaço               | Assistência de conteúdo e autocompletar código.                                                                            |
| Ctrl + Shift + F           | Formata o código fonte.                                                                                                     |
| Ctrl + Q                   | Move o cursor para a última posição editada.                                                                                |
| Ctrl + D                   | Exclui a linha atual no editor.                                                                                             |
| Ctrl + Shift + O           | Organiza os imports no arquivo Java atual.                                                                                  |
| Ctrl + 2 + L               | Atribui a instrução a uma nova variável local.                                                                              |
| Ctrl + 2 + F               | Atribui a instrução a um campo.                                                                                             |
| Ctrl + O                   | Mostra um resumo rápido da estrutura da classe Java.                                                                        |
| Ctrl + F11                 | Executa a classe Java aberta, se existir um método `main`, ou executa a última aplicação lançada.                            |
| Ctrl + Shift + R           | Abre/Pesquisa recursos (arquivos, pastas).                                                                                  |
| Ctrl + Shift + T           | Abre/Pesquisa tipos (classes, interfaces), útil para encontrar classes.                                                     |
| Ctrl + E                   | Seleciona um editor entre os editores atualmente abertos.                                                                   |
| Ctrl + F8                  | Atalho para alternar entre perspectivas.                                                                                    |
| Alt + ← ou Alt + →         | Vai para a posição anterior/próxima no histórico do editor.                                                                 |
| F3                         | Move o cursor para a declaração da variável.                                                                                |
| Ctrl + Shift + P           | Move o cursor para o colchete correspondente.                                                                               |
| Ctrl + .                   | Vai para o próximo problema no código.                                                                                      |
| Ctrl + ,                   | Vai para o problema anterior no código.                                                                                     |
| F4                         | Mostra a hierarquia de tipos da variável.                                                                                   |
| Ctrl + K                   | Busca a próxima ocorrência do texto pesquisado no editor aberto.                                                            |
| Ctrl + Shift + G           | Pesquisa referências no workspace.                                                                                          |
| Ctrl + T                   | Mostra a hierarquia de tipos da classe Java atual.                                                                          |
| Ctrl + M                   | Maximiza o editor Java.                                                                                                     |
| Shift + F2                 | Mostra o Javadoc do método ou classe.                                                                                       |
| Alt + Shift + R            | Renomeia pacotes, classes, etc.                                                                                             |
| Alt + Shift + T            | Abre o menu de refatoração rápida.                                                                                          |
| Ctrl + Shift + ↓           | Copia o código para a linha de baixo.                                                                                       |
| Ctrl + N                   | Cria um novo projeto usando o assistente.                                                                                   |
| Ctrl + Alt + N             | Cria um novo projeto, arquivo, classe, etc.                                                                                 |
| Ctrl + Shift + W           | Fecha todos os arquivos abertos.                                                                                            |
| Ctrl + Shift + S           | Salva todos os arquivos abertos.                                                                                            |
| F5                         | Atualiza o conteúdo do elemento selecionado com o sistema de arquivos local.                                                |
| Ctrl + F6                  | Alterna para o próximo editor.                                                                                              |
| Ctrl + F7                  | Alterna entre visões (painéis).                                                                                             |
| Ctrl + F10                 | Mostra o menu da visão atual.                                                                                               |
| Ctrl + Shift + F6          | Alterna para o editor anterior.                                                                                             |
| Alt + Shift + M            | Extrai uma seleção para um método.                                                                                          |
| Alt + Shift + L            | Extrai uma seleção para uma variável local.                                                                                 |
| Alt + Shift + V            | Move o elemento selecionado para outra classe ou arquivo.                                                                   |
| Ctrl + Shift + F7          | Alterna para a visão anterior.                                                                                              |
| Ctrl + /                   | Comenta ou descomenta uma linha ou seleção (adiciona `//`).                                                                 |
| Ctrl + Shift + /           | Adiciona um comentário de bloco ao redor da seleção (adiciona `/* ... */`).                                                 |
| Ctrl + Shift + \           | Remove um comentário de bloco.                                                                                              |
| Ctrl + Shift ++ ou -       | Amplia ou reduz o zoom no texto do editor.                                                                                  |

---

## Tabela de Templates

| **Atalho**         | **Descrição**                                             | **Código Gerado**                                                                                      |
|---------------------|---------------------------------------------------------|-------------------------------------------------------------------------------------------------------|
| `sysout` + Ctrl+Espaço | Imprime no console com `System.out.println()`.          | `System.out.println();`                                                                               |
| `syserr` + Ctrl+Espaço | Imprime no console com `System.err.println()`.          | `System.err.println();`                                                                               |
| `for` + Ctrl+Espaço   | Gera um loop `for` básico.                               | `for (int i = 0; i < ; i++) { }`                                                                      |
| `foreach` + Ctrl+Espaço | Gera um loop `for-each`.                               | `for (Object object : collection) { }`                                                               |
| `if` + Ctrl+Espaço    | Gera uma estrutura condicional `if`.                     | `if (condition) { }`                                                                                 |
| `try` + Ctrl+Espaço   | Gera um bloco `try-catch`.                               | `try { } catch (Exception e) { }`                                                                    |
| `while` + Ctrl+Espaço | Gera um loop `while`.                                    | `while (condition) { }`                                                                              |
| `do` + Ctrl+Espaço    | Gera um loop `do-while`.                                 | `do { } while (condition);`                                                                          |
| `switch` + Ctrl+Espaço | Gera um bloco `switch`.                                 | `switch (variable) { case value: break; default: break; }`                                           |
| `main` + Ctrl+Espaço  | Gera um método `main`.                                   | `public static void main(String[] args) { }`                                                         |
| `synchronized` + Ctrl+Espaço | Gera um bloco sincronizado.                       | `synchronized (object) { }`                                                                          |

---

### Personalizar Templates
- Para criar ou editar templates:
  1. Vá em **Window** → **Preferences**.
  2. Acesse **Java** → **Editor** → **Templates**.
  3. Clique em **New...** para adicionar novos atalhos ou **Edit...** para personalizar os existentes.
