package br.unicesumar.aula20210210.singleton.aula20210224.factoryLogger;

public class AppFactoryLogger {
    private static MyLogger logger;

    public static void main(String[] args) {
        logger = MyLoggerFactory.createInstance();
        logger.info("Método main executado!");
        logger.info("Tudo certo até agora...");
        logger.warning("Conexão com o servidor lenta, verifique!");
        logger.error("API REST não disponível!");
        if (logger instanceof MyLoggerGUI) {
            System.out.println( ((MyLoggerGUI)logger).errorCounting() );
        }
    }
    
}
