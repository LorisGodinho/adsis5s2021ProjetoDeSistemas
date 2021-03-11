package br.unicesumar.aula20210304.strategyComissões;

public class Venda {

    private Vendedor vendedor;
    private double valor;
    private CálculoDeComissão cálculoDeComissão;

    public Venda(Vendedor vendedor, double valor, CálculoDeComissão cálculoDeComissão) {
        this.vendedor = vendedor;
        this.valor = valor;
        this.cálculoDeComissão = cálculoDeComissão;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public double getValor() {
        return valor;
    }

	public double calcularValorComissão() {
		return this.cálculoDeComissão.calcularComissão(valor);
	}

}
