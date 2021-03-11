package br.unicesumar.aula20210304.strategyComissões;

public class CálculoComissãoOuro implements CálculoDeComissão {

    @Override
    public double calcularComissão(Double valorDaVenda) {
        return valorDaVenda * (3.0/100);
    }

}