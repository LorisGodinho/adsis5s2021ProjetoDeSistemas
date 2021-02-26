package br.unicesumar.aula20210225.abstractFactory;

public class Nissan implements Montadora {

    @Override
    public CarroCompacto fabricarCarroCompacto() {
        return new March();
    }

    @Override
    public SedanMédio fabricarSedanMédio() {
        return new Sentra();
    }

    @Override
    public SUV fabricarSUV() {
        return new Kicks();
    }

}
