package br.unicesumar.aula20210407.semObserver;

public class SMSService {

    public void sendMessage(String number, String message) {
        System.out.println("[SMS to "+number+"] ==> " + message);
    }
    
}
