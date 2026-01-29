package br.com.alura.MainScreenMatch;

import br.com.alura.modelos.Filme;
import br.com.alura.modelos.ScreenMatch;
import br.com.alura.modelos.Serie;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;

import java.util.ArrayList;
 // Classe de testes com Listas
public class PrincipalComListas {
    public static void main(String[] args) {

        Filme velozesFilme = new Filme("Velozes e Furiosos", 2001);

        velozesFilme.avaliar(8.5);

        Filme creedFilme = new Filme("Creed: Nascido Para Lutar", 2015);

        creedFilme.avaliar(9);

        Filme oppenheimerFilme = new Filme("Oppenheimer", 2023);

        oppenheimerFilme.avaliar(8.2);

        Serie lostSerie = new Serie("Lost", 2004);
        var peakyBlindersSerie = new Serie("Peaky Blinders", 2013);

        ArrayList<ScreenMatch> listaDeAssistidos = new ArrayList<>();

        listaDeAssistidos.add(velozesFilme);
        listaDeAssistidos.add(creedFilme);
        listaDeAssistidos.add(oppenheimerFilme);
        listaDeAssistidos.add(lostSerie);
        listaDeAssistidos.add(peakyBlindersSerie);
        peakyBlindersSerie.setTotalVisuzalicoes(200);

        System.out.println(listaDeAssistidos);

        System.out.println("------- Lista de Assistidos -------");
        for (ScreenMatch item : listaDeAssistidos) {
            System.out.println(item.getTitulo());
            if (item instanceof Filme filme && filme.getClassificacao() > 2) {
                System.out.println(filme.getClassificacao());
            }
            if (item instanceof Serie serie) {
                System.out.println(serie.getClassificacao());
            }

        }
    }
}
