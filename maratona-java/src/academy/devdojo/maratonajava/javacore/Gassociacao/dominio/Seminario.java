package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Seminario {
    private String titulo;
    private Local local;
    private Aluno[] alunos;

    public Seminario(String titulo, Local local) {
        this.titulo = titulo;
        this.local = local;
    }

    public void imprime(){
        System.out.println("Dados do seminario");
        System.out.println("Titulo: " + this.titulo + "\nLocal: " + this.local.getEndereco());

        if(alunos == null) return;

        System.out.print("Alunos: ");
        for (Aluno aluno : this.alunos) {
            System.out.print(aluno.getNome() + " ");
        }
        System.out.println();
        System.out.println("------------------------------------------------");
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }
}
