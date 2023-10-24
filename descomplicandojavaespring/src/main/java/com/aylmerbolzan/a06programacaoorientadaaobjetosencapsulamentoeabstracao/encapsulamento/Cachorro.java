package com.aylmerbolzan.a06programacaoorientadaaobjetosencapsulamentoeabstracao.encapsulamento;

public class Cachorro {
    
    //Acesso somente dentro da classe
    private Double peso;
    private Integer idade;
    private void dormir(){
        System.out.println("Acesso dentro da classe");
    }

    //Acesso de todo o projeto
    public Double pesoPublic;
    public Integer idadePublic;
    public void dormirPublic(){
        System.out.println("Acesso dentro do projeto");
    }

    //Acesso somente dentro do pacote
    protected Double pesoProtected;
    protected Integer idadeProtected;
    protected void dormirProtected(){
        System.out.println("Acesso dentro do pacote");
    }
}
