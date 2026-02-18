package revisao.modelo;

public class Carro {
	
	public String marca;
	public String modelo;
	public int ano;
	
	public void marca(String marca) {
		System.out.println("A marca do carro é: "+marca);
	}
	
	public void modelo(String modelo) {
		System.out.println("O modelo do carro é: "+modelo);
	}
	
	public void ano(int ano) {
		System.out.println("O ano do carro é: "+ano);
	}
}
