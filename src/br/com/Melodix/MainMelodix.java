package br.com.Melodix;

import br.com.Melodix.modelos.Audio;
import br.com.Melodix.modelos.Musica;
import br.com.Melodix.modelos.Podcast;

public class MainMelodix {
    public static void main(String[] args) {

        Audio audio = new Audio();

        Musica musica = new Musica();

        musica.setTitulo("Not Like Us");
        musica.setArtista("Kendrick Lamar");
        musica.setDuracaoTempo(4.33);
        musica.setTotalReproducoes(6000000);
        musica.setGenero("Hip-Hop Estadunidense");
        musica.classificou(1000000);
        musica.exibirInformacoes();

        Podcast podcast = new Podcast();


        podcast.setHost("Flow Podcast");
        podcast.setTitulo("Professor Ricardo Marcílio - Geopolítica Atual");
        podcast.setDescricao("Prof. Ricador Marcílio é o kuririn da geografia, geopolítica e atualidades");
        podcast.setDuracaoTempo(151);
        podcast.setTotalReproducoes(524000);
        podcast.classificou(10000);
        podcast.exibirInformacoes();




    }
}
