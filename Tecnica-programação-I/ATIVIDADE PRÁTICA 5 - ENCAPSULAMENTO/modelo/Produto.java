package encapsulamento.modelo;

public class Produto {
	
	private String nome;
	private double preco;
	private int quantidadeEstoque;
	
	
	public Produto(String nome, double preco, int quantidadeEstoque) {
			this.nome = nome;
			this.preco = preco;
			this.quantidadeEstoque = quantidadeEstoque;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
		System.out.println("O nome do produto é: "+nome);
	}
	
	public double getPreco() {
		return this.preco;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
		if(preco < 0) {
			System.out.println("Preço negativo invalido, tem que ser um preço positivo");
		} else {
			System.out.println("Preço do produto é: "+preco);
		}
	}
	
	public int getQuantidade() {
		return this.quantidadeEstoque;
	}
	
	public void setQuantidade(int quantidade) {
		this.quantidadeEstoque = quantidade;
		
		if(quantidade >= 0) {
			System.out.println("A quantidade de produtos é: "+quantidade);
		} else {
			System.out.println("Nenhum produto selecionado");
		}
	}
	
	

}
