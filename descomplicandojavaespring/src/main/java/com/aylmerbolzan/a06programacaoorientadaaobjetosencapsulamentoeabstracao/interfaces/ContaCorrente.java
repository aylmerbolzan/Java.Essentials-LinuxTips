package com.aylmerbolzan.a06programacaoorientadaaobjetosencapsulamentoeabstracao.interfaces;

public class ContaCorrente implements Conta {

    @Override
    public void consultarSaldo() {
        System.out.println("Seu saldo é R$12,34");
    }

    @Override
    public void fazerPix() {
        System.out.println("Digite o valor que você deseja transferir");
    }
    

}
