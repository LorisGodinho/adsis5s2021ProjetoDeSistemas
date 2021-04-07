package br.unicesumar.aula20210318.compositeLogger;

import br.unicesumar.aula20210224.factoryLogger.MyLoggerConsole;
import br.unicesumar.aula20210224.factoryLogger.MyLoggerGUI;

public class AppCompositeLogger {

    public static void main(String[] args) {
        AutorController controller = new AutorController();

        //implementar um composite para MyLogger e usar no controller
        //controller.setLogger(<<composite>>);
        MyLoggerComposite composite = new MyLoggerComposite();
        composite.addLogger(new MyLoggerConsole());
        composite.addLogger(new MyLoggerGUI());

        controller.setLogger(composite);


        System.out.println("Versão do controller: " + controller.getVersion());
    }
    
}
