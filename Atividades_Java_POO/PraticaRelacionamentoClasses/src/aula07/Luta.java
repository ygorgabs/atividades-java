package aula07;

import java.util.Random;

public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovado;

    // Metodos Especiais


    public Lutador getDesafiado() {
        return desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public boolean isAprovado() {
        return aprovado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }

    // Metodos personalizados

    public void marcarLuta(Lutador l1,Lutador l2){

        if(l1.getCategoria().equals(l2.getCategoria()) && (l1 != l2)){
            this.setAprovado(true);
            this.setDesafiado(l1);
            this.setDesafiante(l2);
        }else{
            this.setAprovado(false);
            this.setDesafiado(null);
            this.setDesafiante(null);
        }
    }

    public void lutar(){
        if(isAprovado()){
            System.out.println("#### DESAFIADO ####");
            this.desafiado.apresentar();
            System.out.println("#### DESAFIANTE ####");
            this.desafiante.apresentar();

            Random n = new Random();
            int vencedor = n.nextInt(3);

            switch (vencedor){
                case 0: //empate
                    System.out.println("Empatou!");
                    desafiado.empatarLuta();
                    desafiante.empatarLuta();
                    break;
                case 1: //desafiado vence
                    System.out.println(desafiado.getNome() + " ganhou!");
                    desafiado.ganharLuta();
                    desafiante.perderLuta();
                    break;
                case 2: // desafiante vence
                    System.out.println(desafiante.getNome() + " ganhou!");
                    desafiado.perderLuta();
                    desafiante.ganharLuta();
                    break;
            }

        }else{
            System.out.println("Luta não pode acontecer");
        }
    }
}
