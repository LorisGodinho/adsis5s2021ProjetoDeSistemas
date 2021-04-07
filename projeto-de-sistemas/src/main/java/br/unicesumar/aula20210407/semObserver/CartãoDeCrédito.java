package br.unicesumar.aula20210407.semObserver;

public class CartãoDeCrédito {
    private String númeroParaSMS = "";
    private SMSService smsService = new SMSService();
    private double valorPendentePagamento = 0.00;
    private String email = "";
    private EmailService emailService = new EmailService();

    public void debitar(double valor) {
        if (isHabilitadoParaSMS()) {
            smsService.sendMessage(númeroParaSMS, "Cartão debitado, valor: " + valor);
        }
        if (isHabilitadoParaEmail()) {
            emailService.sendMessage(email, "Débito em seu cartão", "Seu cartão foi debitado em " + valor + ".");
        }
        this.valorPendentePagamento += valor;
    }

    public void pagar(double valor) {
        this.valorPendentePagamento -= valor;
    }

    public double getValorPendentePagamento() {
        return valorPendentePagamento;
    }

    public void habilitarSMS(String númeroParaSMS) {
        this.númeroParaSMS = númeroParaSMS;
    }
    public void desabilitarSMS() {
        this.númeroParaSMS = "";
    }

    private boolean isHabilitadoParaSMS() {
        return this.númeroParaSMS != null && this.númeroParaSMS.trim().length()>0;
    }
    private boolean isHabilitadoParaEmail() {
        return this.email != null && this.email.trim().length()>0;
    }

    public void habilitarEmail(String email) {
        this.email = email;
    }
    public void desabilitarEmail() {
        this.email = "";
    }


}
