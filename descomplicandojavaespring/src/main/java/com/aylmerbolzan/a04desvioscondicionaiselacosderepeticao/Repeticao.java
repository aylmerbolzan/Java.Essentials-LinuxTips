package com.aylmerbolzan.a04desvioscondicionaiselacosderepeticao;

import java.util.Scanner;

public class Repeticao {
    public static void main(String[] args) {
        // For
        for (int i = 0; i<=100; i++){
            System.out.println("Nessa repetição i está valendo " + i);
        }


        // While
        Scanner in = new Scanner(System.in);
        int valorSecreto = 0;
        while (valorSecreto != 12345){
            System.out.println("Adivinhe o valor secreto");
            valorSecreto = in.nextInt();
            if (valorSecreto == 12345) {
                System.out.println("Você acertou!");
            } else {
                System.out.println("Você errou!");
            }
        }


        // Do While
        int valor = 10;
        do {
        System.out.println(valor);
        valor++;
        } while (valor <= 50);
    }
}
