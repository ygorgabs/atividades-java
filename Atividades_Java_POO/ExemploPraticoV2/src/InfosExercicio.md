# Exemplo Prático

A atividade consiste em criar uma classe de conta bancária. Caracteristicas dessa classe:

- Tipo da conta receberá os valores: CC - conta corrente e CP - conta poupança
- Metodo abrir conta e fechar conta altera o status
- Quando abre a conta é necessario informar o tipo
- Quando abre a conta corrente ganha 50 e quando é poupança ganha 150
- Fechar conta nao pode ter saldo positivo ou negativo
- Deposito o status e verdadeiro
- Saque o status verdadeiro e saldo
- Mensalidade sera cobrada direta do saldo. cc 12 reais cp 20 reais
- Todos os atributos devem ter o get e set
- Metodo construtor status falso e saldo 0

Algoritmo da atividade solicitada

```
Classe ContaBanco

publico numConta: inteiro
protegido tipo: caractere
privado dono: caractere
privado saldo: real
privado status: logico

Metodo ContaBanco()
    status <- falso
    saldo <- 0
FimMetodo

publico Metodo abrirConta(t:caractere)
    tipo <- t

    se (tipo = "CC") entao 
        saldo = saldo + 50
    senao se (tipo = "CP") entao
        saldo = saldo + 150
    FimSe 
    FimSe

    status <- verdadeiro

FimMetodo

publico Metodo fecharConta()
    Se (saldo = 0) entao
        status <- falso
    senao se (saldo > 0) entao
        Escreval("Por favor, realize o saque do saldo antes de fechar a conta")
    senao 
        Escreval("Por favor, quite os debitos antes de fechar a conta")
    FimSe
    FimSe
    FimSe

FimMetodo

publico Metodo depositar(valor:real)
    se (status = verdadeiro) entao
        saldo <- saldo + valor
    senao
        Escreval("A conta precisa estar ativa para depositar")
    FimSe
FimMetodo

publico Metodo sacar(valor:real)
    se (status = verdadeiro) entao
       se (saldo > valor) entao
            saldo <- saldo - valor
        senao
            Escreval("Saldo insuficiente")
        FimSe
    senao
        Escreval("Impossivel sacar")
    FimSe
FimMetodo

publico Metodo pagarMensal()
   var v: real

   se (tipo = "CC") entao
        v <- 12
    senao se (tipo = "CP") entao
        v <- 20
    FimSe

    se (status = verdadeiro) entao 
        se (saldo > v) entao
            saldo <- saldo + v
        senao
            Escreval("Saldo insuficiente")
        Fimse
    senao
        Escreval("Impossivel pagar")
    Fimse
FimMetodo

publico Metodo getNumConta()
    retorne numConta
FimMetodo

publico Metodo setNumConta(num:inteiro)
    numConta <- num
FimMetodo

publico Metodo getTipo()
    retorne tipo
FimMetodo

publico Metodo setTipo(t:caractere)
    tipo <- t
FimMetodo

publico Metodo getDono()
    retorne dono
FimMetodo

publico Metodo setDono(d:caractere)
    dono <- d
FimMetodo

publico Metodo getSaldo()
    retorne saldo
FimMetodo

publico Metodo setSaldo(v:inteiro)
    saldo <- s
FimMetodo

publico Metodo getStatus()
    retorne status
FimMetodo

publico Metodo setStatus(s:logico)
    status <- s
FimMetodo

FimClasse
```

