package br.unicesumar.aula20210210.singleton.aula20210224.factoryLogger;

import java.io.InputStream;
import java.util.Properties;

public class MyLoggerFactory {

	public static MyLogger createInstance() {
        final String tipoDeLogger = carregarTipoDeLoggerDaConfiguração();
        switch (tipoDeLogger) {
            case "GUI":
                return new MyLoggerGUI();
            case "CONSOLE":
                return new MyLoggerConsole();
            default:
                return null;
        }
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
