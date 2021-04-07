package br.unicesumar.aula20210407.comObserver;

public class NotificadorDeDébitoViaSMS implements CartãoDeCréditoListener {
    private String número;
    private SMSService smsService = new SMSService();

    public NotificadorDeDébitoViaSMS(String número) {
        this.número = número;
    }

    @Override
    public void débitoEfetuado(double valorDebitado) {
        smsService.sendMessage(número, "[ SMS to "+ número+" ] ==> Cartão debitado no valor de " + valorDebitado );
    }

}
