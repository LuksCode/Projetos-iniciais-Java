package br.com.alura.MainScreenMatch;

import br.com.alura.modelos.Episodios;
import br.com.alura.modelos.Filme;
import br.com.alura.modelos.Serie;
import br.com.alura.screenmatch.calculos.CalculadorTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;


public class PrincipalScreenMatch {
    public static void main(String[] args) {

        Filme velozesFilme = new Filme();
        velozesFilme.setTitulo("Velozes e Furiosos");
        velozesFilme.setDiretor("Rob Cohen");
        velozesFilme.setAnoDeLancamento(2001);
        velozesFilme.setIncluidoNoPlano(true);
        velozesFilme.setDuracaoEmMinutos(107);


        velozesFilme.avaliar(8);
        velozesFilme.avaliar(8.4);
        velozesFilme.avaliar(6.6);

        velozesFilme.exibirFichaTecnica();

        Serie lostSerie = new Serie();

        lostSerie.setTitulo("Lost");
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


        Filme creedFilme = new Filme();

        creedFilme.setTitulo("Creed: Nascido Para Lutar");
        creedFilme.setAnoDeLancamento(2015);
        creedFilme.setDiretor("Ryan Coogler");
        creedFilme.setIncluidoNoPlano(true);
        creedFilme.setDuracaoEmMinutos(133);

        creedFilme.avaliar(10);
        creedFilme.avaliar(9.5);
        creedFilme.avaliar(8.9);
        creedFilme.avaliar(8.7);

        creedFilme.exibirFichaTecnica();

        CalculadorTempo calculadorTempo = new CalculadorTempo();

        calculadorTempo.calcularCatalogo(velozesFilme);
        calculadorTempo.calcularCatalogo(lostSerie);
        calculadorTempo.calcularCatalogo(creedFilme);
        System.out.println("Temp médio para ver todos os filmes da lista: " + calculadorTempo.getTempoTotal());



        FiltroRecomendacao filtro = new FiltroRecomendacao();

        filtro.filtrar(velozesFilme);
        filtro.filtrar(creedFilme);

        Episodios episodio = new Episodios();

        episodio.setSerie(lostSerie);
        episodio.setNumero(1);
        episodio.setNome("Piloto");
        episodio.setTotalVisualizacoes(50);

        filtro.filtrar(episodio);


    }
}
