package classes;

public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;

    //Metodos especiais

    public ContaBanco(){
        status = false;
        saldo = 0;
    }

    public int getNumConta(){
        return this.numConta;
    }

    public void setNumConta(int num){
        this.numConta = num;
    }

    public String getTipo(){
        return this.tipo;
    }

    public void setTipo(String t){
        this.tipo = t;
    }

    public String getDono(){
        return this.dono;
    }

    public void setDono(String d){
        this.dono = d;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public void setSaldo(double s){
        this.saldo = s;
    }

    public boolean getStatus(){
        return this.status;
    }

    public void setStatus(boolean s){
        this.status = s;
    }

    // Metodos personalizados

    public void estadoAtual(){
        System.out.println("--------------------------");
        System.out.println("Conta: "+ getNumConta());
        System.out.println("Tipo: "+ getTipo());
        System.out.println("Dono: "+getDono());
        System.out.println("Saldo: "+ getSaldo());
        System.out.println("Aberta: "+ getStatus());
    }

    public void abrirConta(String t){
        setTipo(t);
        setStatus(true);

        if(this.tipo.equals("CC")){
            setSaldo(50);
        }else if(this.tipo.equals("CP")){
            setSaldo(150);
        }

        System.out.println("Conta aberta com sucesso");
    }

    public void fecharConta(){
        if(this.saldo > 0){
            System.out.println("Por favor, realize o saque do saldo antes de fechar a conta");
        }else if (this.saldo < 0){
            System.out.println("Por favor, quite os debitos antes de fechar a conta");
        }else{
            setStatus(false);
            System.out.println("Conta fechada com sucesso");
        }
    }

    public void depositar(double valor){
        if(this.status){
            setSaldo(getSaldo() + valor);
            System.out.println("Deposito realizado na conta de " + getDono());
        }else{
            System.out.println("A conta precisa estar ativa para depositar");
        }
    }

    public void sacar(double valor){
        if(this.status){
            if(this.saldo >= valor){
                setSaldo(getSaldo() - valor);
                System.out.println("Saque realizado na conta de " + getDono());
            }else{
                System.out.println("Saldo insuficiente");
            }
        }else{
            System.out.println("Impossivel sacar");
        }
    }

    public void pagarMensal(){
        double v = 0;

        if(this.tipo.equals("CC")){
            v = 12;
        }else if(this.tipo.equals("CP")){
            v = 20;
        }

        if(status){
            if(saldo>v){
                setSaldo(getSaldo()-v);
                System.out.println("Mensalidade paga com sucesso");
            }else{
                System.out.println("Saldo Insuficiente");
            }
        }else{
            System.out.println("Impossivel pagar");
        }
    }


}// fim classe
