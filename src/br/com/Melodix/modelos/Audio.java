package br.com.Melodix.modelos;

public class Audio {
    private String titulo;
    private double duracaoTempo;
    private int totalReproducoes;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getDuracaoTempo() {
        return duracaoTempo;
    }

    public void setDuracaoTempo(double duracaoTempo) {
        this.duracaoTempo = duracaoTempo;
    }



    public int getTotalReproducoes() {
        return totalReproducoes;
    }

    public void setTotalReproducoes(int totalReproducoes) {
        this.totalReproducoes = totalReproducoes;
    }

    public void exibirInformacoes() {
        System.out.println("Título: " + getTitulo());

        exibirDetalhesAdicionais();

        System.out.println("Tempo de duração: " + getDuracaoTempo() + " Minutos" );
        System.out.println("Total de reproduções: " + getTotalReproducoes());
        System.out.println();
    }

    public void exibirDetalhesAdicionais() {

    }

}
