package br.unicesumar.aula20210318.compositeLogger;


import br.unicesumar.aula20210224.factoryLogger.MyLogger;

public class AutorController {
    private MyLogger logger = new NullLogger(); //inicializar com NullLogger


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
