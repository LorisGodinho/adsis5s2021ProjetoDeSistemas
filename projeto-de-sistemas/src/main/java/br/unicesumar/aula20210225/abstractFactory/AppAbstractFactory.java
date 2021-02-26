package br.unicesumar.aula20210225.abstractFactory;

public class AppAbstractFactory {

    public static void main(String[] args) {
        Montadora montadora = MontadoraFactory.createInstance();

        CarroCompacto compacto = montadora.fabricarCarroCompacto();
        SedanMédio sedan = montadora.fabricarSedanMédio();
        SUV suv = montadora.fabricarSUV();

        System.out.println(montadora);
        System.out.println(compacto);
        System.out.println(sedan);
        System.out.println(suv);
    }
    
}
