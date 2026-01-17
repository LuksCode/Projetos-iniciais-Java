package br.com.alura.modelos;

public class ScreenMatch {
    private String tituloFilme;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaAvaliacao;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;


    public String getTituloFilme() {
        return tituloFilme;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setTituloFilme(String tituloFilme) {
        this.tituloFilme = tituloFilme;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        if(anoDeLancamento < 1888){
            System.out.println("Erro, data de lançamento além do esperado!");
        } else {
            this.anoDeLancamento = anoDeLancamento;
        }
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void exibirFichaTecnica(){
        System.out.println("Nome do filme: " + getTituloFilme());
        System.out.println("Ano de lançamento: " + getAnoDeLancamento());
        System.out.println("Duração do filme: " + getDuracaoEmMinutos());
        System.out.println("Plano: " + incluidoNoPlano);

    }

    public void avaliar(double nota) {
        somaAvaliacao += nota;
        totalDeAvaliacoes++;
    }

    public double retornarMedia() {
        return somaAvaliacao / totalDeAvaliacoes;

    }

     public int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }
}
