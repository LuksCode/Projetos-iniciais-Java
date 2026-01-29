package br.com.alura.screenmatch.calculos;

import br.com.alura.modelos.Filme;
import br.com.alura.modelos.ScreenMatch;

public class FiltroRecomendacao {

    public void filtrar(Classificavel classificavel) {
        if (classificavel.getClassificacao() >= 4) {
            System.out.println(" Está entre os mais avaliados!\n");
        } else if (classificavel.getClassificacao() >= 2 ) {
            System.out.println("Avaliações medianas.\n");
        } else {
            System.out.println("Assistir mais tarde.\n");
        }
    }

}
