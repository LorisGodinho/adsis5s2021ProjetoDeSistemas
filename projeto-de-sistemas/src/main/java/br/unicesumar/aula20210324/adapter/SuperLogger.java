package br.unicesumar.aula20210324.adapter;

public class SuperLogger {

    public void mostrarErro(String mensagem) {
        System.out.println("[ SUPER SUPER LOGGER / ERRO ] " + mensagem);
    }

    public void mostrarInformação(String mensagem) {
        System.out.println("[ SUPER SUPER LOGGER / INFORMAÇÃO ] " + mensagem);
    }

    public void mostrarAviso(String mensagem) {
        System.out.println("[ SUPER SUPER LOGGER / AVISO ] " + mensagem);
    }
    
}
