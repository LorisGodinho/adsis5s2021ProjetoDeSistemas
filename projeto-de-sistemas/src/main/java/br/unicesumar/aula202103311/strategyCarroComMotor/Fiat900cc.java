package br.unicesumar.aula202103311.strategyCarroComMotor;

public class Fiat900cc extends Motor {

    public Fiat900cc() {
        this(47, 1);
    }

    private Fiat900cc(double potênciaEmCavalos, double fatorDeEficiência) {
        super(potênciaEmCavalos, fatorDeEficiência);
    }

}
