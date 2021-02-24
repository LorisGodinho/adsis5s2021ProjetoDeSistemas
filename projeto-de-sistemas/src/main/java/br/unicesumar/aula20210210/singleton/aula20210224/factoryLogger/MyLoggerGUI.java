package br.unicesumar.aula20210210.singleton.aula20210224.factoryLogger;

import javax.swing.JOptionPane;

public class MyLoggerGUI implements MyLogger {

    private int errorCounting;

    @Override
    public void error(String message) {
        JOptionPane.showMessageDialog(null, " [ERROR] ==> " + message);
        this.errorCounting++;
    }

    @Override
    public void info(String message) {
        JOptionPane.showMessageDialog(null, " [INFO] ==> " + message);
    }

    @Override
    public void warning(String message) {
        JOptionPane.showMessageDialog(null, " [WARNING] ==> " + message);
    }    

    public int errorCounting() {
        return this.errorCounting;
    }
    
}
