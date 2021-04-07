package br.unicesumar.arthur_zavadski.aula20210318;


public class AppCompositeLogger {

    public static void main(String[] args) {
        AutorController controller = new AutorController();

        //implementar um composite para MyLogger e usar no controller
        //controller.setLogger(<<composite>>);

        System.out.println("Versão do controller: " + controller.getVersion());
    }
    
}
