package br.unicesumar.aula20210225.abstractFactory;

public interface Montadora {

	CarroCompacto fabricarCarroCompacto();

	SedanMédio fabricarSedanMédio();

	SUV fabricarSUV();

}
