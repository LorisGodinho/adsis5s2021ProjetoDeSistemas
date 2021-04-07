package br.unicesumar.aula20210407.comObserver;

public class CartãoDeCrédito {
    private double valorPendentePagamento = 0.00;
    private CartãoDeCréditoListener listener;

    public void debitar(double valor) {
        if (listener != null) {
            listener.débitoEfetuado(valor);
        }
        this.valorPendentePagamento += valor;
    }

    public void setListener(CartãoDeCréditoListener listener) {
        this.listener = listener;
    }

    public void pagar(double valor) {
        this.valorPendentePagamento -= valor;
    }

    public double getValorPendentePagamento() {
        return valorPendentePagamento;
    }
}
