package com.aylmerbolzan.a06programacaoorientadaaobjetosencapsulamentoeabstracao;

public class Estudante {

    private String nome;
    private String stack;
    
    // Getters e Setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getStack() {
        return stack;
    }
    public void setStack(String stack) {
        this.stack = stack;
    }    
    
    public String estudar(){
        return "Estou estudando Java e Spring Boot";
    }

    public void dormir(){
        System.out.println("É hora de dar tchau");
    }

}
