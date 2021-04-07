package br.unicesumar.aula20210311.strategyCarroComMotor;

public class Carro {
    private double ganhoDeVelocidadePorSegundoPorCavalo  = 0.0975;
    private double velocidadeAtual;
    private Motor motor;

    public Carro() {
    }

    public Carro(double ganhoDeVelocidadePorSegundoPorCavalo) {
        this.ganhoDeVelocidadePorSegundoPorCavalo = ganhoDeVelocidadePorSegundoPorCavalo;
    }

    public void acelerar(double percentualDeAceleração, double tempoDeAceleração) {
        this.velocidadeAtual = motor
            .acelerar(percentualDeAceleração, tempoDeAceleração) 
            * ganhoDeVelocidadePorSegundoPorCavalo;
    }

    public double getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

}
