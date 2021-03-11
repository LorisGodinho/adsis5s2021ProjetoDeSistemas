package br.unicesumar.aula20210310.strategyCarroComMotor;

public class AppStrategyCarroComMotor {

    public static void main(String[] args) {
        Carro fiat147 = new Fiat147();
        fiat147.acelerar(50.00, 30);

        Carro fiorino = new Fiorino();
        fiorino.acelerar(50.00, 30);


        System.out.println(fiat147.getVelocidadeAtual());
        System.out.println(fiorino.getVelocidadeAtual());
    }
    
}
