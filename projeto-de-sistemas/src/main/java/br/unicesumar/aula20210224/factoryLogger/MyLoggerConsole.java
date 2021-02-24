package br.unicesumar.aula20210224.factoryLogger;

public class MyLoggerConsole implements MyLogger {

    @Override
    public void error(String message) {
        System.out.println(" [ERROR] ==> " + message);
    }

    @Override
    public void info(String message) {
        System.out.println(" [INFO] ==> " + message);
    }

    @Override
    public void warning(String message) {
        System.out.println(" [WARNING] ==> " + message);
    }

}
