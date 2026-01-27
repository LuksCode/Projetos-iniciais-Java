package br.com.alura.MainScreenMatch;

import br.com.alura.modelos.Episodios;
import br.com.alura.modelos.Filme;
import br.com.alura.modelos.Serie;
import br.com.alura.screenmatch.calculos.CalculadorTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;

import java.util.ArrayList;


public class PrincipalScreenMatch {
    public static void main(String[] args) {

        Filme velozesFilme = new Filme("Velozes e Furiosos");
        velozesFilme.setDiretor("Rob Cohen");
        velozesFilme.setAnoDeLancamento(2001);
        velozesFilme.setIncluidoNoPlano(true);
        velozesFilme.setDuracaoEmMinutos(107);


        velozesFilme.avaliar(8);
        velozesFilme.avaliar(8.4);
        velozesFilme.avaliar(6.6);

        velozesFilme.exibirFichaTecnica();

        Serie lostSerie = new Serie("Lost");
        lostSerie.setAnoDeLancamento(2004);
        lostSerie.setDiretor("Jack Bender");
        lostSerie.setTemporadas(10);
        lostSerie.setEpisodiosPorTemporada(20);
        lostSerie.setMinutosPorEpisodio(60);
        lostSerie.setAtiva(false);
        lostSerie.setIncluidoNoPlano(true);

        lostSerie.avaliar(5);
        lostSerie.avaliar(10);
        lostSerie.avaliar(9);

        lostSerie.exibirFichaTecnica();

        var peakyBlindersSerie = new Serie("Peaky Blinders");

        peakyBlindersSerie.setAnoDeLancamento(2013);
        peakyBlindersSerie.setDiretor("Steven Knigh");
        peakyBlindersSerie.setTemporadas(6);
        peakyBlindersSerie.setEpisodiosPorTemporada(6);
        peakyBlindersSerie.setMinutosPorEpisodio(50);
        peakyBlindersSerie.setAtiva(false);
        peakyBlindersSerie.setIncluidoNoPlano(true);

        peakyBlindersSerie.avaliar(10);
        peakyBlindersSerie.avaliar(7.0);
        peakyBlindersSerie.avaliar(6.8);

        peakyBlindersSerie.exibirFichaTecnica();


        Filme creedFilme = new Filme("Creed: Nascido Para Lutar");

        creedFilme.setAnoDeLancamento(2015);
        creedFilme.setDiretor("Ryan Coogler");
        creedFilme.setIncluidoNoPlano(true);
        creedFilme.setDuracaoEmMinutos(133);

        creedFilme.avaliar(10);
        creedFilme.avaliar(9.5);
        creedFilme.avaliar(8.9);
        creedFilme.avaliar(8.7);

        creedFilme.exibirFichaTecnica();


        Filme oppenheimerFilme = new Filme("Oppenheimer");

        oppenheimerFilme.setAnoDeLancamento(2023);
        oppenheimerFilme.setDiretor("Christopher Nolan");
        oppenheimerFilme.setDuracaoEmMinutos(180);
        oppenheimerFilme.setIncluidoNoPlano(true);

        oppenheimerFilme.avaliar(10);
        oppenheimerFilme.avaliar(9.6);

        oppenheimerFilme.exibirFichaTecnica();

        CalculadorTempo calculadorTempo = new CalculadorTempo();

        calculadorTempo.calcularCatalogo(velozesFilme);
        calculadorTempo.calcularCatalogo(lostSerie);
        calculadorTempo.calcularCatalogo(creedFilme);
        calculadorTempo.calcularCatalogo(oppenheimerFilme);
        System.out.println("Temp médio para ver todos os filmes da lista: " + calculadorTempo.getTempoTotal());


        FiltroRecomendacao filtro = new FiltroRecomendacao();

        filtro.filtrar(velozesFilme);
        filtro.filtrar(creedFilme);
        filtro.filtrar(oppenheimerFilme);

        Episodios episodio = new Episodios();

        episodio.setSerie(lostSerie);
        episodio.setNumero(1);
        episodio.setNome("Piloto");
        episodio.setTotalVisualizacoes(50);
        filtro.filtrar(episodio);


        ArrayList<Filme> listaDeFilmes = new ArrayList<>();

        listaDeFilmes.add(velozesFilme);
        listaDeFilmes.add(creedFilme);
        listaDeFilmes.add(oppenheimerFilme);


        System.out.println("Tamanho da lista: " + listaDeFilmes.size());
        System.out.println("toString do filme: " + listaDeFilmes.get(0).toString());
        System.out.println(listaDeFilmes);
        System.out.println();


        ArrayList<Serie> listaDeSeries = new ArrayList<>();

        listaDeSeries.add(lostSerie);
        listaDeSeries.add(peakyBlindersSerie);
        System.out.println("Quantidade de séries: " + listaDeSeries.size());
        System.out.println("Segunda Série: " + listaDeSeries.get(1).getTitulo());
        System.out.println(listaDeSeries);

    }

}
