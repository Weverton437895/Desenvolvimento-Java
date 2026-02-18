package view;

import modelo.Bicicleta;
import modelo.Carro;

public class Main1 {

    public static void main(String[] args) {

        Carro carro = new Carro(" ","Toyota", "Corolla", 2023);

        Bicicleta bicicleta = new Bicicleta(" ","Kaloi", "Aro 29", "Vermelha");

        System.out.println(carro.toString());
        System.out.println(carro.getMover());

        System.out.println(bicicleta.toString());
        System.out.println(bicicleta.getMover());
    }
}
