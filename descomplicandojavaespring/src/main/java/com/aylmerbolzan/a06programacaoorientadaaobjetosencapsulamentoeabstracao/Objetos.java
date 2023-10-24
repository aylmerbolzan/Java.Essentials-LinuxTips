package com.aylmerbolzan.a06programacaoorientadaaobjetosencapsulamentoeabstracao;

public class Objetos {
    public static void main(String[] args) {

        Estudante aylmerBolzan = new Estudante();

        aylmerBolzan.setNome("Aylmer");
        aylmerBolzan.setStack("Java e Spring");

        System.out.println(aylmerBolzan.getNome());
        System.out.println(aylmerBolzan.getStack());
    }
    
}
