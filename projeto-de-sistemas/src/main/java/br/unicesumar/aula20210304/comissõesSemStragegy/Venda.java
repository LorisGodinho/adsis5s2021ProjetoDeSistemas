package br.unicesumar.aula20210304.comissõesSemStragegy;

public class Venda {

    private Vendedor vendedor;
    private double valor;

    public Venda(Vendedor vendedor, double valor) {
        this.vendedor = vendedor;
        this.valor = valor;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public double getValor() {
        return valor;
    }

	public double calcularValorComissão() {
        final double TETO_MÁXIMO = 3_000.00;
        double percentualDeComissão = 0.00;
        if (this.vendedor.getCategoriaAtual() == CategoriaVendedor.BRONZE) {
            if (this.valor > 0.01 && this.valor < 1_000.00) {
                percentualDeComissão = 1.5;
            } else if (this.valor > 1_000 && this.valor < 5_000.00) {
                percentualDeComissão = 1.7;
            } else if (this.valor > 5_000) {
                percentualDeComissão = 2.0;
            }
            return this.valor * (percentualDeComissão/100);
        } else if (this.vendedor.getCategoriaAtual() == CategoriaVendedor.PRATA) {
            if (this.valor > 0.01 && this.valor < 7_500.00) {
                percentualDeComissão = 2.0;
            } else if (this.valor > 7_500) {
                percentualDeComissão = 3.0;
            }
            double valorAntesDoTeto = this.valor * (percentualDeComissão/100);
            if (valorAntesDoTeto <= TETO_MÁXIMO) {
                return valorAntesDoTeto;
            }
            return TETO_MÁXIMO;
        } else if (this.vendedor.getCategoriaAtual() == CategoriaVendedor.OURO) {
            return this.valor * (3.0/100);
        }
		return 0;
	}

}
