package com.aylmerbolzan.a06programacaoorientadaaobjetosencapsulamentoeabstracao.interfaces;


public class BankMain {
    public static void main(String[] args) {
        
        System.out.println("Seja bem vindo ao Bank Main");

        // Conta corrente

        ContaCorrente ccAylmer = new ContaCorrente();

        ccAylmer.consultarSaldo();
        ccAylmer.fazerPix();


        // Conta poupança

        ContaPoupanca cpAylmer = new ContaPoupanca();

        cpAylmer.consultarSaldo();
        cpAylmer.fazerPix();

    }
}
