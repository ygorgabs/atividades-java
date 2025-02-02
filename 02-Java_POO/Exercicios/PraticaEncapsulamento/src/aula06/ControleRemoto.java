package aula06;

public class ControleRemoto implements Controlador { //implements é o inca que estou implementando a classe
    private int volume;
    private boolean ligado;
    private boolean tocando;

    public ControleRemoto(){
        volume = 50;
        ligado = false;
        tocando = false;
    }

    private int getVolume() {
        return volume;
    }

    private boolean isLigado() {
        return ligado;
    }

    private boolean isTocando() {
        return tocando;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }


    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        if(isLigado()){
            System.out.println("--------MENU----------");
            System.out.println("Está ligado? " + this.isLigado());
            System.out.println("Esta tocando? " + this.isTocando());
            System.out.print("Volume: "+this.getVolume());
            for(int i = 0; i <= this.getVolume(); i+=10){
                System.out.print("[]");
            }
            System.out.println(" ");
        }else{
            System.out.println("Impossivel abrir menu");
        }
    }

    @Override
    public void fecharMenu() {
        if(isLigado()){
            System.out.println("Fechando menu...");
        }
    }

    @Override
    public void maisVolume() {
        if(this.isLigado()){
            this.setVolume(this.getVolume()+5);
        }else{
            System.out.println("Impossivel aumenta volume");
        }
    }

    @Override
    public void menosVolume() {
        if(this.isLigado()){
            this.setVolume(this.getVolume()-5);
        }else{
            System.out.println("Impossivel diminuir volume");
        }
    }

    @Override
    public void ligarMudo() {
        if(this.isLigado() && this.getVolume() > 0){
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if(this.isLigado() && this.getVolume() == 0){
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        if(this.isLigado() && !(this.isTocando())){
            this.setTocando(true);
        }else{
            System.out.println("Não consegui reproduzir");
        }
    }

    @Override
    public void pause() {
        if(this.isLigado() && this.isTocando()){
            this.setTocando(false);
        }else{
            System.out.println("Não consegui pausar");
        }
    }
} // fim classe
