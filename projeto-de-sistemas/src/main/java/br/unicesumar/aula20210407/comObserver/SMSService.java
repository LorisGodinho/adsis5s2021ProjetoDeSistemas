package br.unicesumar.aula20210407.comObserver;

public class SMSService {

    public void sendMessage(String number, String message) {
        System.out.println("[SMS to "+number+"] ==> " + message);
    }
    
}
