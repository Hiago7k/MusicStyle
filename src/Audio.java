public class Audio {

    private String titulo;
    private int duracao;
    private int totalDeReproducoes;
    private int curtidas;
    private String classificacao;

    public void curtirAudio(){
        this.curtidas = curtidas + 1;
        System.out.println("Você curtiu esse som");
    }

    public void reproduzirAudio(){
        this.totalDeReproducoes = totalDeReproducoes + 1;
        System.out.println("Reproduzindo o audio ");
    };

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public int getTotalDeReproducoes() {
        return totalDeReproducoes;
    }

    public void setTotalDeReproducoes(int totalDeReproducoes) {
        this.totalDeReproducoes = totalDeReproducoes;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
}
