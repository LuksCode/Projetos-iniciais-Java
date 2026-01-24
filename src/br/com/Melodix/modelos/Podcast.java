package br.com.Melodix.modelos;

public class Podcast extends Audio implements Classificar {
    private String host;
    private String descricao;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    @Override
    public void exibirDetalhesAdicionais() {
        System.out.println("Host: " + getHost());
        System.out.println("Descrição: " + getDescricao());
        super.exibirDetalhesAdicionais();
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public int classificou(int curtida) {
        if ( curtida > 1000){
            System.out.println("Um dos podcasts mais ouvidos! " + getHost());
            return 10;
        }
        else {
            return 8;
        }
    }
}
