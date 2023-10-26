package com.aylmerbolzan.a07programacaoorientadaaobjetosherancaepolimorfismo.polimorfismo;

public class Pagamento {

    // Valor à vista
    public Double pagamento(Double valor){
        return valor;
    }

    // Calcula o valor das parcelas
    public Integer pagamento(Integer valorInteger, Integer parcelas){
    return valorInteger/parcelas;
    }

    // Juros
    public Long pagamento (Integer valorInteger, Integer parcelas, Long juros){
            return (valorInteger/parcelas) + juros;
    }
}
