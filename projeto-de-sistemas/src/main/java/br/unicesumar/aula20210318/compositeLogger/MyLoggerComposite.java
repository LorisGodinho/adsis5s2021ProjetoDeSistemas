package br.unicesumar.aula20210318.compositeLogger;

import java.util.ArrayList;
import java.util.List;

import br.unicesumar.aula20210224.factoryLogger.MyLogger;

public class MyLoggerComposite implements MyLogger {
    private List<MyLogger> loggers = new ArrayList<>();

    
    public void addLogger(MyLogger logger) {
        if (logger == this) {
            throw new RuntimeException("Não é possível vincular um MyLoggerComposite a si mesmo!");
        }
        this.loggers.add(logger);
    }


    @Override
    public void error(String message) {        
        for (MyLogger myLogger : loggers) {
            myLogger.error(message);
        }
    }


    @Override
    public void info(String message) {        
        for (MyLogger myLogger : loggers) {
            myLogger.info(message);
        }
    }


    @Override
    public void warning(String message) {       
        for (MyLogger myLogger : loggers) {
            myLogger.warning(message);
        }
    }

}
