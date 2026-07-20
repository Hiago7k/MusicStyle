class Main{
    static void main() {
        System.out.println("Musics & Podcast for public and free");

    Musicas musica1 = new Musicas();
    musica1.setTitulo("Impossible");
    musica1.setAutor("James Arthur");
    musica1.setClassificacao("Loves Songs");
    musica1.setCurtidas(50000);
    musica1.setDuracao(500);
    musica1.setTotalDeReproducoes(2300000);

        System.out.println("\nExibindo informações da musica " + musica1.getTitulo());
        System.out.println("Titulo " + musica1.getTitulo());
        System.out.println("Autor " + musica1.getAutor());
        System.out.println("Classificação " + musica1.getClassificacao());
        System.out.println("Número de curtidas " + musica1.getCurtidas());
        System.out.println("Duração em segundos " + musica1.getDuracao());
        System.out.println("Visualizações " + musica1.getTotalDeReproducoes());




    }
}