package br.com.alura.modelos;

import br.com.alura.screenmatch.calculos.Classificavel;

public class Serie extends ScreenMatch  implements Classificavel {
    private int temporadas;
    private boolean ativa;
    private int episodiosPorTemporada;
    private int minutosPorEpisodio;
    private int totalVisuzalicoes;

    public int getTotalVisuzalicoes() {
        return totalVisuzalicoes;
    }

    public void setTotalVisuzalicoes(int totalVisuzalicoes) {
        this.totalVisuzalicoes = totalVisuzalicoes;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;

    }

    @Override
    public void exibirDadosAdicionais() {
        System.out.println("Temporadas: " + temporadas);
        System.out.println("Status da Série: " + ativa);
    }

    @Override
    public int getDuracaoEmMinutos() {
        return temporadas * episodiosPorTemporada * minutosPorEpisodio;
    }

    @Override
    public String toString() {
        return "Série: " + this.getTitulo() + " (" + this.getAnoDeLancamento() + ")";
    }

    public Serie(String titulo, int anoDeLancamento) {
        super(titulo, anoDeLancamento);
    }

    @Override
    public int getClassificacao() {
        if (totalVisuzalicoes > 100) {
            return 4;
        } else {
            return 2;
        }

    }
}

