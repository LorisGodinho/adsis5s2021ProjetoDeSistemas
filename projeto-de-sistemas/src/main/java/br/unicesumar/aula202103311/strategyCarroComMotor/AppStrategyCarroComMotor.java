package br.unicesumar.aula202103311.strategyCarroComMotor;

public class AppStrategyCarroComMotor {

    
    public static void main(String[] args) {
        Carro fiat147 = new Carro();
        fiat147.setMotor(new Fiat900cc());
        fiat147.acelerar(50.00, 30);

        Carro fiorino = new Carro();
        fiorino.setMotor(new Fiasa1000cc());
        fiorino.acelerar(50.00, 30);


        System.out.println(fiat147.getVelocidadeAtual());
        System.out.println(fiorino.getVelocidadeAtual());
    }


}
