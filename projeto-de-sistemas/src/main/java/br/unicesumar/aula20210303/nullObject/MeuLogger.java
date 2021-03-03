package br.unicesumar.aula20210303.nullObject;

public interface MeuLogger {

    void log(String message);

	static MeuLogger createInstance() {
        if (System.currentTimeMillis() % 2 == 0) {
            return new MeuLoggerConsole();
        }
		//return null;
        return new MeuLoggerNullObject();
	}

}
