package br.com.alura.modelos;

public class ContaBancaria {
    private int numeroConta;
    private double saldo = 500;
    public String titular;

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void depositarConta(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Depósito realizado! Saldo disponíovel: " + saldo);
        } else {
            System.out.println("Valor inválido!");
        }
    }

        public void sacarConta(double valorSaque) {
            if(valorSaque > saldo) {
                System.out.println("Valor maior que saldo! Erro.");
            } else {
                this.saldo -= valorSaque;
                System.out.println("Saque realizado com sucesso! Saldo disponível: " + saldo);
            }
    }

    public double getSaldo() {
        return saldo;
    }

    public void exibirInformacoesConta() {
        System.out.println("Número da conta: " + numeroConta);
        System.out.println("Saldo disponível: " + saldo);
        System.out.println("Titular: " + titular);
    }

}
