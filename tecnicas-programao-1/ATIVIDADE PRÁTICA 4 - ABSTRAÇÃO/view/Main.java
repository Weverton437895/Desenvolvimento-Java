package treino.view;

import treino.modelo.Carro;

public class Main {

	public static void main(String[] args) {
		
		Carro carro = new Carro();
		
		carro.cor = "Azul";
		carro.ano = 2017;
		carro.modelo = "Dust";
		carro.capacidadeTanque = 100;
		
		carro.ligar();
		carro.desligar();
		carro.acelerar();
		carro.frear();
		carro.buzina();
	}
}
