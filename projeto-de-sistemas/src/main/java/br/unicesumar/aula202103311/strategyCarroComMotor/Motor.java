package br.unicesumar.aula202103311.strategyCarroComMotor;

public class Motor {
    private double potênciaEmCavalos;
    private double fatorDeEficiência;

    public double acelerar(double percentualDeAceleração, double tempoDeAceleração) {
        return (potênciaEmCavalos * (percentualDeAceleração/100.00)) 
        * fatorDeEficiência 
        * tempoDeAceleração ;
    }

    public Motor(double potênciaEmCavalos, double fatorDeEficiência) {
        this.potênciaEmCavalos = potênciaEmCavalos;
        this.fatorDeEficiência = fatorDeEficiência;
    }


}
