package br.com.alura.modelos;

import br.com.alura.screenmatch.calculos.Classificavel;

public class Filme extends ScreenMatch implements Classificavel {


    @Override
    public int getClassificacao() {
        return (int) retornarMedia() / 2;
    }

    @Override
    public String toString() {
        return "Filme: " + this.getTitulo() + " (" + this.getAnoDeLancamento() + ")";
    }

    public Filme(String nomeFilme){
        this.setTitulo(nomeFilme);
    }

}

