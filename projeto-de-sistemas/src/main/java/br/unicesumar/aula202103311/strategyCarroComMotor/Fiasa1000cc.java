package br.unicesumar.aula202103311.strategyCarroComMotor;

public class Fiasa1000cc extends Motor {


    public Fiasa1000cc() {
        this(66, 0.98);
    }

    private Fiasa1000cc(double potênciaEmCavalos, double fatorDeEficiência) {
        super(potênciaEmCavalos, fatorDeEficiência);
    }

}
