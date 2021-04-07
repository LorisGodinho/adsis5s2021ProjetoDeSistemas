package br.unicesumar.aula20210324.adapter;

import br.unicesumar.aula20210224.factoryLogger.MyLogger;

public class SuperLoggerToMyLoggerAdapter implements MyLogger {
    private SuperLogger superLogger;


    //+ SuperLoggerToMyLoggerAdapter(sl : SuperLogger)
    public SuperLoggerToMyLoggerAdapter(SuperLogger sl) {
        this.superLogger = sl;
    }

    @Override
    public void error(String message) {
        this.superLogger.mostrarErro(message);
    }

    @Override
    public void info(String message) {
        this.superLogger.mostrarInformação(message);     
    }

    @Override
    public void warning(String message) {
        this.superLogger.mostrarAviso(message);        
    }
    
}
