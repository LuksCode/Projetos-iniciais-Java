package br.com.alura.MainScreenMatch;

import br.com.alura.modelos.Filme;
import br.com.alura.modelos.Serie;
import br.com.alura.screenmatch.calculos.CalculadorTempo;


public class PrincipalScreenMatch {
    public static void main(String[] args) {

        Filme velozesFilme = new Filme();
        velozesFilme.setTituloFilme("Velozes e Furiosos");
        velozesFilme.setDiretor("Rob Cohen");
        velozesFilme.setAnoDeLancamento(2001);
        velozesFilme.setIncluidoNoPlano(true);
        velozesFilme.setDuracaoEmMinutos(107);


        velozesFilme.avaliar(8);
        velozesFilme.avaliar(8.4);
        velozesFilme.avaliar(6.6);

        velozesFilme.exibirFichaTecnica();

        Serie lost = new Serie();

        lost.setTituloFilme("Lost");
        lost.setAnoDeLancamento(2004);
        lost.setDiretor("Jack Bender");
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(20);
        lost.setMinutosPorEpisodio(60);
        lost.setAtiva(false);
        lost.setIncluidoNoPlano(true);

        lost.avaliar(5);
        lost.avaliar(10);
        lost.avaliar(9);

        lost.exibirFichaTecnica();

        CalculadorTempo calculadorTempo = new CalculadorTempo();

        calculadorTempo.calcularFilme(velozesFilme);
        System.out.println(calculadorTempo.getTempoTotal());


    }
}
