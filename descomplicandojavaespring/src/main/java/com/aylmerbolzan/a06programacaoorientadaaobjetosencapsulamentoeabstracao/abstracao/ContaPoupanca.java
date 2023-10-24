package com.aylmerbolzan.a06programacaoorientadaaobjetosencapsulamentoeabstracao.abstracao;

public class ContaPoupanca extends Conta {

    @Override
    public void consultarSaldo() {
        System.out.println("Seu saldo é R$00,00");
    }

    @Override
    public void fazerPix() {
        System.out.println("PIX não disponível");
    }
    
}
