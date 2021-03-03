package br.unicesumar.aula20210303.nullObject;

public class MeuLoggerConsole implements MeuLogger {

    @Override
    public void log(String message) {
        System.out.println("[logging] " + message);

    }

}
