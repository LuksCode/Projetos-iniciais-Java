package br.com.Melodix.modelos;

public class Musica extends br.com.Melodix.modelos.Audio implements Classificar {
    private String album;
    private String artista;
    private String genero;

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public void exibirDetalhesAdicionais() {
        System.out.println("Artista: " + getArtista());
        System.out.println("Gênero: " + getGenero());
        super.exibirDetalhesAdicionais();
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    @Override
    public int classificou(int curtida) {
        if ( curtida > 100000){
            System.out.println("Música mais bombada do momento: " + getTitulo());
            return 10;
        }
        else {
            System.out.println("Música com números medianos: " + getTitulo());
            return 8;
        }
    }
}
