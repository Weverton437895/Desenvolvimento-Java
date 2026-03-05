package encapsulamento.modelo;

public class Biblioteca {
	
	private String[] livros;
	private int[] diasAtraso;
	private double[] multaDia;
	private int qtd;
	
	public Biblioteca(int qtd) {
		this.qtd = qtd;
		this.livros = new String[qtd];
		this.diasAtraso = new int[qtd];
		this.multaDia = new double[qtd];
	}
	
	public void setLivros(int i, String nomeLivros, int diasAtraso, double multaDia) {	
		this.livros[i -1] = nomeLivros;
		this.diasAtraso[i -1] = diasAtraso;
		this.multaDia[i -1] = multaDia;
	}
	
	public void getLivros() {	
		for(int i = 0; i < this.qtd; i ++) {
			System.out.println(
					"\nLivros cadastrados: "+this.livros[i]+
					"\nDias de atraso: "+this.diasAtraso[i]+
					"\nMulta por dia: "+this.multaDia[i]);
		}
	}
	
	public String multaTotal() {
		double multaTotal = 0;
		
		for(int i = 0; i < this.qtd; i++) {
			multaTotal += this.diasAtraso[i] * this.multaDia[i];
		}
		
		return "A multa total de todos os livros atrasados é: "+multaTotal;
	}
	
	public String mediaAtraso() {
		double soma = 0;
		
		for(int i = 0; i < this.qtd; i++) {
			soma+=diasAtraso[i];
		}
		
		double mediaAtraso = soma / this.qtd;
		
		return "A media dos atrasos é: "+mediaAtraso;
	}
	
	public String emprestarLivro(int i) {
		int index = i - 1;
		
		if (index >= 0 && index < this.qtd && this.livros[index] != null) {
			String livroEmprestado = this.livros[index];
			this.livros[index] = null; // remove do array de disponíveis
			return "Você emprestou o livro: " + livroEmprestado;
		} else {
			return "Livro indisponível para empréstimo.";
		}
	}
	
	public String devolverLivro(int i, int diasAtraso, double multaDia) {
		int index = i - 1;
		
		if (index >= 0 && index < this.qtd && this.livros[index] == null) {
			String nomeLivro = "Livro" + i;
			this.livros[index] = nomeLivro;
			this.diasAtraso[index] = diasAtraso;
			this.multaDia[index] = multaDia;
			return "Livro " + nomeLivro + " devolvido com " + diasAtraso + " dias de atraso.";
		} else {
			return "Você não alugou este livro";
		}
	}
}
