package br.unicesumar.aula20210324.adapter;

import br.unicesumar.aula20210318.compositeLogger.AutorController;

public class AppAdapter {

    public static void main(String[] args) {
        AutorController controller = new AutorController();

        SuperLogger superLogger = new SuperLogger();

        //Estudem o pattern Adapter e apliquem nesta vinculação 
        //entre o AutorController e o SuperLogger.
        controller.setLogger(new SuperLoggerToMyLoggerAdapter(superLogger));

        controller.getVersion();
    }
    
}
