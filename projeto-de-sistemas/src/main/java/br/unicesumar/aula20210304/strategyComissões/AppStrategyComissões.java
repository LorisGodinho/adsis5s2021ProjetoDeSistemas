package br.unicesumar.aula20210304.strategyComissões;

import java.util.ArrayList;
import java.util.List;

public class AppStrategyComissões {

    public static void main(String[] args) {
        Vendedor josias = new Vendedor("Josias de Albuquerque", CategoriaVendedor.BRONZE);

        List<Venda> vendasDoJosias = new ArrayList<>();
        vendasDoJosias.add(new Venda(josias, 5_000.00, josias.getCalculoPelaCategoria()));
        vendasDoJosias.add(new Venda(josias, 3_000.00, josias.getCalculoPelaCategoria()));
        vendasDoJosias.add(new Venda(josias, 2_000.00, josias.getCalculoPelaCategoria()));
        vendasDoJosias.add(new Venda(josias, 1_000.00, josias.getCalculoPelaCategoria()));

        double valorComissãoJosias = 0.00;
        for (Venda v : vendasDoJosias) {
            valorComissãoJosias += v.calcularValorComissão();
        }
        System.out.println("Comissão do Josias = " + valorComissãoJosias);

    }
    
}
