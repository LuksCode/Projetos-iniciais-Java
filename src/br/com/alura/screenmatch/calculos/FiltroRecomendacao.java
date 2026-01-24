package br.com.alura.screenmatch.calculos;

public class FiltroRecomendacao {

    public void filtrar(Classificavel classificavel) {
        if (classificavel.getClassificacao() >= 4) {
            System.out.println("Está entre os mais avaliados!");
        } else if (classificavel.getClassificacao() >=2 ) {
            System.out.println("Avaliações medianas.");
        } else {
            System.out.println("Assistir mais tarde.");
        }
    }

}
