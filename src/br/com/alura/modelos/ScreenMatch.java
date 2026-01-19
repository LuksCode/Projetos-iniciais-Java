package br.com.alura.modelos;

public class ScreenMatch {
    private String tituloFilme;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaAvaliacao;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;
    private String diretor;


    public String getTituloFilme() {
        return tituloFilme;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
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
        System.out.println("Título: " + getTituloFilme());
        System.out.println("Ano de lançamento: " + getAnoDeLancamento());

        exibirDadosAdicionais();

        System.out.println("Diretor: " + diretor);
        System.out.println("Duração: " + getDuracaoEmMinutos() + " minutos");
        System.out.println("Plano: " + isIncluidoNoPlano());
        System.out.printf("Número total de avaliações: %d%n", getTotalDeAvaliacoes());
        System.out.printf("A média das avaliações no total é de: %.2f%n" , retornarMedia());
        System.out.println();
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

    // Mét/odo vazio que as filhas podem (ou não) sobrescrever
    public void exibirDadosAdicionais() {
        // Fica vazio na mãe
    }
}
