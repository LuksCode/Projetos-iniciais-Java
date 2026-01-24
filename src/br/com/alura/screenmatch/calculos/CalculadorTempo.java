package br.com.alura.screenmatch.calculos;
import br.com.alura.modelos.Filme;
import br.com.alura.modelos.ScreenMatch;

public class CalculadorTempo extends ScreenMatch {
    private int tempoTotal;

    public int getTempoTotal() {
        return this.tempoTotal;
    }

    public void calcularCatalogo(ScreenMatch calcular) {
        this.tempoTotal += calcular.getDuracaoEmMinutos();

    }

}
