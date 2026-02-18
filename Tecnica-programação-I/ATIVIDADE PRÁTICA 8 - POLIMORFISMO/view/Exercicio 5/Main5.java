package view;

import modelo.Conversor;

public class Main5 {
	
	   public static void main(String[] args) {
	        Conversor c = new Conversor();

	        System.out.println("Celsius para Fahrenheit: " + c.converter(25.0));
	        System.out.println("Quilômetros para milhas: " + c.converter(10));
	        System.out.println("Texto em maiúsculas: " + c.converter("conversor"));
	    }
}
