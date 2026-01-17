package br.com.alura.MainScreenMatch;

import br.com.alura.modelos.ScreenMatch;

public class PrincipalScreenMatch {
    public static void main(String[] args) {

        ScreenMatch meuFilme = new ScreenMatch();
        meuFilme.setTituloFilme("Velozes e Furiosos");
        meuFilme.setAnoDeLancamento(2001);
        meuFilme.setIncluidoNoPlano(true);
        meuFilme.setDuracaoEmMinutos(107);

        meuFilme.exibirFichaTecnica();

        meuFilme.avaliar(8);
        meuFilme.avaliar(8.4);
        meuFilme.avaliar(6.6);


        System.out.printf("Número total de avaliações: %d%n ", meuFilme.getTotalDeAvaliacoes());

        System.out.printf("A média das avaliações no total é de: %.2f" , meuFilme.retornarMedia());


    }
}
