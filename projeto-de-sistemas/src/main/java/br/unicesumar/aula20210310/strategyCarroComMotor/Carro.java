package br.unicesumar.aula20210310.strategyCarroComMotor;

public abstract class Carro {
    private double velocidadeAtual;

    public abstract void acelerar(double percentualDeAceleração, int tempoDeAceleração);

    public double getVelocidadeAtual() {
        return velocidadeAtual;
    }

    protected void setVelocidadeAtual(double velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

}
