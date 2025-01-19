# Atalhos no Eclipse IDE

## Tabela de shortcuts

| **Atalho (Mac)**             | **Atalho (Windows)**        | **Descrição**                                                                                                                                   |
|------------------------------|-----------------------------|---------------------------------------------------------------------------------------------------------------------------------------------------|
| Command + 3                 | Ctrl + 3                   | Foca na caixa de pesquisa do Quick Access.                                                                                                       |
| Command + S                 | Ctrl + S                   | Salva o editor atual.                                                                                                                            |
| Command + 1                 | Ctrl + 1                   | Sugere correções rápidas (Quickfix) para erros e avisos, dependendo da posição do cursor.                                                        |
| Control + Espaço             | Ctrl + Espaço               | Assistência de conteúdo e autocompletar código.                                                                                                  |
| Command + Shift + F         | Ctrl + Shift + F           | Formata o código fonte.                                                                                                                          |
| Control + Q                 | Ctrl + Q                   | Move o cursor para a última posição editada.                                                                                                     |
| Command + D                 | Ctrl + D                   | Exclui a linha atual no editor.                                                                                                                  |
| Command + Shift + O         | Ctrl + Shift + O           | Organiza os imports no arquivo Java atual.                                                                                                       |
| Command + 2 + L             | Ctrl + 2 + L               | Atribui a instrução a uma nova variável local.                                                                                                   |
| Command + 2 + F             | Ctrl + 2 + F               | Atribui a instrução a um campo.                                                                                                                  |
| Command + O                 | Ctrl + O                   | Mostra um resumo rápido da estrutura da classe Java.                                                                                             |
| Command + fn + F11          | Ctrl + F11                 | Executa a classe Java aberta, se existir um método `main`, ou executa a última aplicação lançada.                                                 |
| Command + Shift + R         | Ctrl + Shift + R           | Abre/Pesquisa recursos (arquivos, pastas).                                                                                                       |
| Command + Shift + T         | Ctrl + Shift + T           | Abre/Pesquisa tipos (classes, interfaces), útil para encontrar classes.                                                                          |
| Command + E                 | Ctrl + E                   | Seleciona um editor entre os editores atualmente abertos.                                                                                        |
| Command + fn + F8           | Ctrl + F8                  | Atalho para alternar entre perspectivas.                                                                                                         |
| Command + [ ou Command + ]  | Alt + ← ou Alt + →         | Vai para a posição anterior/próxima no histórico do editor.                                                                                      |
| Fn + F3                     | F3                         | Move o cursor para a declaração da variável.                                                                                                     |
| Command + Shift + P         | Ctrl + Shift + P           | Move o cursor para o colchete correspondente.                                                                                                    |
| Command + .                 | Ctrl + .                   | Vai para o próximo problema no código.                                                                                                           |
| Command + Shift + .         | Ctrl + ,                   | Vai para o problema anterior no código.                                                                                                         |
| Fn + F4                     | F4                         | Mostra a hierarquia de tipos da variável.                                                                                                        |
| Command + K                 | Ctrl + K                   | Busca a próxima ocorrência do texto pesquisado no editor aberto.                                                                                 |
| Command + Shift + G         | Ctrl + Shift + G           | Pesquisa referências no workEspaço.                                                                                                               |
| Command + T                 | Ctrl + T                   | Mostra a hierarquia de tipos da classe Java atual.                                                                                               |
| Command + M                 | Ctrl + M                   | Maximiza o editor Java.                                                                                                                          |
| Fn + Shift + F2             | Shift + F2                 | Mostra o Javadoc do método ou classe.                                                                                                            |
| Command + Option + R        | Alt + Shift + R            | Renomeia pacotes, classes, etc.                                                                                                                  |
| Command + Option + T        | Alt + Shift + T            | Abre o menu de refatoração rápida.                                                                                                               |

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
