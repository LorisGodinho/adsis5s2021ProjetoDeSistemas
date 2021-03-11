package br.unicesumar.aula20210304.strategyComissões;

public class CálculoComissãoBronze implements CálculoDeComissão {

    @Override
    public double calcularComissão(Double valorDaVenda) {
        double percentualDeComissão = 0.00;
        if (valorDaVenda > 0.01 && valorDaVenda < 1_000.00) {
            percentualDeComissão = 1.5;
        } else if (valorDaVenda > 1_000 && valorDaVenda < 5_000.00) {
            percentualDeComissão = 1.7;
        } else if (valorDaVenda > 5_000) {
            percentualDeComissão = 2.0;
        }
        return valorDaVenda * (percentualDeComissão/100);
}

}
