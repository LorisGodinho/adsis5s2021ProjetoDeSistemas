package br.unicesumar.aula20210317.composite;

import br.unicesumar.aula20210311.strategyCarroComMotor.Carro;
import br.unicesumar.aula20210311.strategyCarroComMotor.Fiasa1000cc;

public class AppComposite {

    public static void main(String[] args) {
        Carro meuCarro = new Carro();

        MotorComposite motorComposite = new MotorComposite();
        motorComposite.addMotor(new Fiasa1000cc());
        motorComposite.addMotor(new Fiasa1000cc());
        motorComposite.addMotor(new Fiasa1000cc());
        motorComposite.addMotor(motorComposite);

        //meuCarro.setMotor(new Fiasa1000cc());
        meuCarro.setMotor(motorComposite);

        meuCarro.acelerar(100, 20);
        System.out.println(meuCarro.getVelocidadeAtual());
    }
    
}
