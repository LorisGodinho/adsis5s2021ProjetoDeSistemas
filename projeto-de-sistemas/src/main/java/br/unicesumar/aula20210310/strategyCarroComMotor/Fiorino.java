package br.unicesumar.aula20210310.strategyCarroComMotor;

public class Fiorino extends Carro {
    private double fatorDeEficiênciaDoMotor = 1.00;
    private double potênciaDoMotorEmCavalos = 50.00;
    private final double GANHO_DE_VELOCIDADE_POR_SEGUNDO_PARA_CADA_CAVALO_DE_POTÊNCIA = 0.0975;

    @Override
    public void acelerar(double percentualDeAceleração, int tempoDeAceleração) {
        setVelocidadeAtual((potênciaDoMotorEmCavalos * (percentualDeAceleração/100.00)) 
            * fatorDeEficiênciaDoMotor 
            * tempoDeAceleração 
            * GANHO_DE_VELOCIDADE_POR_SEGUNDO_PARA_CADA_CAVALO_DE_POTÊNCIA); 
    }

}
