public class Audio {
    private String titulo;
    private int duracao;
    private int totalDeReproducoes;
    private int curtidas;
    private String classificacao;

    public void curtirAudio(Audio audio){
        curtidas = curtidas + 1;
        System.out.println("Você curtiu esse som");
    }

    public void reproduzirAudio(Audio audio){
        totalDeReproducoes = totalDeReproducoes + 1;
        System.out.println("Reproduzindo o audio ");
    };
}
