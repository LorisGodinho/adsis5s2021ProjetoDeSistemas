package br.unicesumar.aula20210407.semObserver;

public class AppSemObserver {


    public static void main(String[] args) {        
        CartãoDeCrédito visa4486 = new CartãoDeCrédito();

        visa4486.habilitarSMS("(44) 99984-1234");
        visa4486.habilitarEmail("arthur.zavadski@unicesumar.edu.br");

        visa4486.debitar(500.00);
        visa4486.debitar(500.00);
        visa4486.debitar(210.00);

        System.out.println("Foi. Total a pagar: " + visa4486.getValorPendentePagamento());
        visa4486.pagar(710.00);
        System.out.println("Foi. Total a pagar: " + visa4486.getValorPendentePagamento());
    }
    
}
