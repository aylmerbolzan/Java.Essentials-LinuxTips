package com.aylmerbolzan.a03tiposdedadoseoperadores;


public class Operadores {
    public static void main(String[] args) {
        
        //Operadores de atribuição
        int idade = 25;
        System.out.println(System.lineSeparator() + "Valor atribuído à idade: " + idade + System.lineSeparator());


        //Operadores matemáticos
        int soma = idade + 5;
        System.out.println("Resultado da soma: " + soma + System.lineSeparator());
        
        int multiplicacao = soma * 2;
        System.out.println("Resultado da multiplicação: " + multiplicacao + System.lineSeparator());
        
        int divisao = multiplicacao / 2;
        System.out.println("Resultado da divisão: " + divisao + System.lineSeparator());

        int modulo = divisao % 4;
        System.out.println("Resultado do módulo: " + modulo + System.lineSeparator());

        
        //Incremento e decremento
        int incremento = 15;
        System.out.println("Valor antes do incremento: " + incremento);
        incremento++;
        System.out.println("Valor depois do incremento: " + incremento + System.lineSeparator());

        int decremento = 20;
        System.out.println("Valor antes do decremento: " + decremento);
        decremento--;
        System.out.println("Valor depois do decremento: " + decremento + System.lineSeparator());


        //Operadores de igualdade
        long valor1 = 1L;
        long valor2 = 2L;

        if(valor1 == valor2) {
            System.out.println("Valores iguais");
        } else {
             System.out.println("Valores diferentes");
        }


        double valor3 = 10.2;
        double valor4 = 100.2;

        if(valor3 != valor4) {
            System.out.println("Valores diferentes" + System.lineSeparator());
        } else {
             System.out.println("Valores iguais");
        }
        

        //Operadores relacionais
        long valor5 = 1234;
        long valor6 = 12345;

        if(valor5 > valor6) {System.out.println(valor5 + " é maior que " + valor6);}
        if(valor5 >= valor6) {System.out.println(valor5 + " é maior ou igual que " + valor6);}
        if(valor5 < valor6) {System.out.println(valor5 + " é menor que " + valor6);}
        if(valor5 <= valor6) {System.out.println(valor5 + " é menor ou igual que " + valor6 + System.lineSeparator());}


        //Operadores lógicos
        boolean verdadeiro = true;
        boolean falso = false;

        System.out.println(verdadeiro || falso);
        System.out.println(verdadeiro && falso);
    }
}
