package br.com.alura.contabancaria;

import br.com.alura.modelos.ContaBancaria;

import java.util.Scanner;

public class MainAccountBank {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ContaBancaria minhaConta = new ContaBancaria();

        minhaConta.setNumeroConta(21092055);
        minhaConta.titular = "Lucas Lopes Freire";
        minhaConta.getSaldo();

        boolean sair = true;
        while (sair) {

            System.out.println(
                    """
                    Selecione uma das opções abaixo:
                    
                    1 - Verificar saldo disponível
                    2 - Depositar
                    3 - Sacar
                    4 - Sair 
                    """);


            short opcao = Short.parseShort(scanner.nextLine());

            switch (opcao) {
                case 1 -> System.out.println("Saldo disponível: " + minhaConta.getSaldo());
                case 2 -> {
                    System.out.println("Qual valor deseja depositar?");
                    double valorDeposito = Double.parseDouble(scanner.nextLine());
                    minhaConta.depositarConta(valorDeposito);
                }
                case 3 -> {
                    System.out.println("Qual valor deseja sacar:");
                    double valorSacado = Double.parseDouble(scanner.nextLine());
                    minhaConta.sacarConta(valorSacado);
                }
                case 4 -> {
                    System.out.println("Você optou por sair, encerrando o prograama!");
                    System.out.println();
                    sair = false;
                }
            }
        }

        System.out.println("Relatório antes do fechamento do programa: ");
        System.out.println();
        minhaConta.exibirInformacoesConta();

    }
}
