package revisao.modelo;

public class Celular {

	public String marca;
	public String modelo;
	public double preco;
	
	public void exibirMarca(String marca) {
		System.out.println("A marca do celular é: "+marca);
	}
	
	public void exibirModelo(String modelo) {
		System.out.println("O modelo do celular é: "+modelo);
	}
	
	public void exibirPreco(double preco) {
		System.out.println("O preço do celular é: "+preco);
	}
}
