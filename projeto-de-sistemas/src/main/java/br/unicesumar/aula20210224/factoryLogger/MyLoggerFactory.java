package br.unicesumar.aula20210224.factoryLogger;

import java.io.InputStream;
import java.util.Properties;

public final class MyLoggerFactory {

    private MyLoggerFactory() {
        super();
    }

/*
	public static MyLogger createInstance() {
        final String tipoDeLogger = carregarTipoDeLoggerDaConfiguração();
        switch (tipoDeLogger) {
            case "GUI":
                return new MyLoggerGUI();
            case "CONSOLE":
                return new MyLoggerConsole();
            case "PLUS":
                return new MyLoggerConsolePlus();
            default:
                return null;
        }
	}
*/
    public static MyLogger createInstance() {
        final String tipoDeLogger = carregarTipoDeLoggerDaConfiguração();
        try {
            Class classeDoLogger = Class.forName(tipoDeLogger);
            Object novoLogger = classeDoLogger.newInstance();
            return (MyLogger) novoLogger;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    private static String carregarTipoDeLoggerDaConfiguração() {
        try (InputStream input = MyLoggerFactory.class.getResourceAsStream("my-logger-factory.properties")) {
            Properties props = new Properties();
            props.load(input);
            return props.getProperty("tipo.de.logger");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
