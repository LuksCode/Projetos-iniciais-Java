package br.com.alura.screenmatch.calculos;
import br.com.alura.modelos.Filme;
import br.com.alura.modelos.ScreenMatch;

public class CalculadorTempo extends ScreenMatch {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

    public void calcularFilme(Filme filme) {
        tempoTotal += filme.getDuracaoEmMinutos();

    }

}
