package view;

import modelo.Calculadora;

public class Main1 {

	public static void main(String[] args) {
		
		Calculadora calcu = new Calculadora(5,10);
		
		System.out.println(calcu.soma());
		System.out.println(calcu.subtracao());
		System.out.println(calcu.multiplicacao());
		System.out.println(calcu.divisao());
	}
}
