package br.unicesumar.aula20210225.abstractFactory;

public class MontadoraFactory {

	public static Montadora createInstance() {
		return new Nissan();
	}

}
