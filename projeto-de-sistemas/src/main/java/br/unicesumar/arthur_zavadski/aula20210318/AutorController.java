package br.unicesumar.arthur_zavadski.aula20210318;


import br.unicesumar.aula20210224.factoryLogger.MyLogger;
import br.unicesumar.aula20210224.factoryLogger.MyLoggerConsole;

public class AutorController {
    private MyLogger logger = new MyLoggerConsole(); //inicializar com NullLogger


    public void setLogger(MyLogger logger) {
        this.logger = logger;
    }

    public String getVersion() {
        logger.info("Chamando o getVersion...");
        String version = "v1.01";

        logger.info("Concluindo o getVersion.");
        return version;
    }

}
