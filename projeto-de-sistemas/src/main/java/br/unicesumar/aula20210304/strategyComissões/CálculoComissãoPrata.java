package br.unicesumar.aula20210304.strategyComissões;

public class CálculoComissãoPrata implements CálculoDeComissão {
    private final double TETO_MÁXIMO = 3_000.00;

    @Override
    public double calcularComissão(Double valorDaVenda) {
        double percentualDeComissão = 0.00;
            if (valorDaVenda > 0.01 && valorDaVenda < 7_500.00) {
            percentualDeComissão = 2.0;
        } else if (valorDaVenda > 7_500) {
            percentualDeComissão = 3.0;
        }
        double valorAntesDoTeto = valorDaVenda * (percentualDeComissão/100);
        if (valorAntesDoTeto <= TETO_MÁXIMO) {
            return valorAntesDoTeto;
        }
        return TETO_MÁXIMO;
}

}