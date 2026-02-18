package treino.modelo;

public class Carro {

	public String cor;
	public String modelo;
	public int ano;
	public int capacidadeTanque;
	public boolean ligado = false;
	
	public void ligar() {
		if(!ligado) {
			ligado = true;
			System.out.println("Carro ligado: ");
		} else {
			System.out.println("Carro já está ligado");
		}
	}
	
	public void desligar() {
		if(ligado) {
			ligado = false;
			System.out.println("Carro desligado");
		} else {
			System.out.println("Carro já está desligado");
		}
	}
	
	public void acelerar() {
		if(ligado) {
			System.out.println("Carro acelerando...");
		} else {
			System.out.println("Carro está desligado não a como acelerar");
		}
	}
	
	public void frear() {
		if(ligado) {
			System.out.println("Carro freiando");
		} else {
			System.out.println("Carro está desligado não tem como frear");
		}
	}
	
	public void buzina() {
		if(ligado) {
			System.out.println("Carro buzinando.....");
		} else {
			System.out.println("Carro está desligado não tem como buzinar");
		}
	}
}
