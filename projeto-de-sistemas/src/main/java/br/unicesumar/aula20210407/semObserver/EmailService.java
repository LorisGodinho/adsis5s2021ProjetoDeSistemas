package br.unicesumar.aula20210407.semObserver;

public class EmailService {

    public void sendMessage(String address, String messageTitle, String message) {
        System.out.println("[Email to "+address+"] ==> (" + messageTitle + ") " + message);
    }

}
