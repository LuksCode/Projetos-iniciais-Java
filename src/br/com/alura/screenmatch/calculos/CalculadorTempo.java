package br.com.alura.screenmatch.calculos;
import br.com.alura.modelos.Filme;
import br.com.alura.modelos.ScreenMatch;
import br.com.alura.modelos.Serie;

public class CalculadorTempo{
    private int tempoTotal;

    public int getTempoTotal() {
        return this.tempoTotal;
    }

    public void calcularCatalogo(ScreenMatch calcular) {
        this.tempoTotal += calcular.getDuracaoEmMinutos();

    }

}
