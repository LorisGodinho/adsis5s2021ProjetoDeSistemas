package br.unicesumar.aula20210407.comObserver;

public class AppComObserver {


    public static void main(String[] args) {        
        CartãoDeCrédito visa4486 = new CartãoDeCrédito();
        /*
        //Listener implementado como classe anônima.
        CartãoDeCréditoListener listener = new CartãoDeCréditoListener(){
            @Override
            public void débitoEfetuado(double valorDebitado) {
                System.out.println("Opa, fomos notificados de um débito no cartão! Valor: " + valorDebitado);
            }            
        };
        */

        //Mesmo listener implementado como lambda.
        CartãoDeCréditoListener listener = (valorDebitado) -> {
            System.out.println("Opa, fomos notificados de um débito no cartão! Valor: " + valorDebitado);
        };

        //visa4486.habilitarSMS("(44) 99984-1234");
        //visa4486.habilitarEmail("arthur.zavadski@unicesumar.edu.br");

        visa4486.setListener(listener);
        visa4486.setListener(new NotificadorDeDébitoViaSMS("(44) 99984-1234"));

        visa4486.debitar(500.00);
        visa4486.debitar(500.00);
        visa4486.debitar(210.00);

        System.out.println("Foi. Total a pagar: " + visa4486.getValorPendentePagamento());
        visa4486.pagar(710.00);
        System.out.println("Foi. Total a pagar: " + visa4486.getValorPendentePagamento());
    }
    
}
