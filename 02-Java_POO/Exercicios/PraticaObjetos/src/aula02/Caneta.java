package aula02;

public class Caneta {

    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;


    void status(){
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ponta: "+ this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Está tampada? " + this.tampada);
    }

    void rabiscar(){
        if(this.tampada){
            System.out.println("ERRO! Não posso Rabiscar");
        }else{
            System.out.println("Estou rabiscando");
        }
    }

    void tampar(){
        this.tampada = true; //this é uma referencia ao próprio objeto que está sendo chamado
    }

    void destampar(){
        this.tampada = false;
    }
}
