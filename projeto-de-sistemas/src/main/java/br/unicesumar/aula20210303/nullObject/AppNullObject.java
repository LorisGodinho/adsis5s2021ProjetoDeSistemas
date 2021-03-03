package br.unicesumar.aula20210303.nullObject;

public class AppNullObject {

    public static void main(String[] args) {
        MeuLogger logger = MeuLogger.createInstance();
        System.out.println(">>>>>>>>>>>>>>>>>>>");
        System.out.println("Classe do logger: " + logger.getClass());

        logger.log("Iniciando main do AppNullObject");

        int valor = 0;
        for (int i = 0; i < 10; i++) {
            valor += i;
        }
        System.out.println(valor);

        logger.log("Fim.");
    }

}
