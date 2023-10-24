package com.aylmerbolzan.a07programacaoorientadaaobjetosherancaepolimorfismo.heranca;

public class Pessoa {
    public static void main(String[] args) {
        DesenvolvedorBackEnd desenvolvedorBackEnd = new DesenvolvedorBackEnd("Aylmer Bolzan", "Java e Spring", 5000.0);
        desenvolvedorBackEnd.codar();

        DesenvolvedorFrontEnd desenvolvedorFrontEnd = new DesenvolvedorFrontEnd("Aylmer Bolzan", "JavaScript", 8000.0);
        desenvolvedorFrontEnd.codar();
    }
}
