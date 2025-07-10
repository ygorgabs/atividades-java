package academy.devdojo.maratonajava.javacore.Dconstrutores.dominio;

public class Anime {
    private String nome;
    private String tipo;
    private String genero;
    private int episodios;
    private String estudio;

    public Anime(String nome, String tipo, String genero, int episodios){
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
        this.genero = genero;
    }

    public Anime(String nome, String tipo, String genero, int episodios, String estudio){
        this(nome, tipo, genero, episodios);
        this.estudio = estudio;
    }

    public Anime(){

    }

    public void imprime(){
        System.out.println("Nome do anime: " + this.nome + "\nTipo: " + this.tipo + "\nGenero: " + this.genero + "\nNum. de episódios: " + this.episodios + "\nEstudio: " + this.estudio);
    }

    public String getEstudio() {
        return estudio;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }

    public int getEpisodios() {
        return this.episodios;
    }
}
