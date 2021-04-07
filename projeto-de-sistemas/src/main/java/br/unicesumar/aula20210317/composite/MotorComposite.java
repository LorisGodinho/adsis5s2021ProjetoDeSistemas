package br.unicesumar.aula20210317.composite;

import java.util.ArrayList;
import java.util.List;

import br.unicesumar.aula20210311.strategyCarroComMotor.Motor;

public class MotorComposite extends Motor {
    private List<Motor> motores = new ArrayList<>();

    public MotorComposite() {
        this(0, 0);
    }

    private MotorComposite(double potênciaEmCavalos, double fatorDeEficiência) {
        super(potênciaEmCavalos, fatorDeEficiência);
    }

    public void addMotor(Motor motorParaCompor) {
    	if (motorParaCompor == this) {
    		throw new RuntimeException("Não é permitido vincular um MotorComposite a si mesmo!");
    	}
        this.motores.add(motorParaCompor);
    }

    @Override
    public double acelerar(double percentualDeAceleração, double tempoDeAceleração) {
        double aceleração = 0.00;
        for (Motor motor : motores) {
            double aceleraçãoDoMotorComposto = motor.acelerar(percentualDeAceleração, tempoDeAceleração);
            System.out.println("Motor composto: " 
                + motor.getClass().getSimpleName() 
                + "= " 
                + aceleraçãoDoMotorComposto);
            aceleração += aceleraçãoDoMotorComposto;
        }
        return aceleração;
    }

}
