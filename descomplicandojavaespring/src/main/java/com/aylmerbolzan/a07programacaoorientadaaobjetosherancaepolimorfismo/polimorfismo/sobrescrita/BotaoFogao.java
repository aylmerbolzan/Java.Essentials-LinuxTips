package com.aylmerbolzan.a07programacaoorientadaaobjetosherancaepolimorfismo.polimorfismo.sobrescrita;

public class BotaoFogao extends Botao {
    
    @Override
    public void ligar() {
        super.ligar();
        System.out.println("Hora de esquentar a comida");
    }
    

    @Override
    public void desligar() {
        super.desligar();
    }

}
