package encapsulamento.modelo;

public class Locadora {

	private String[] filmes;
	private int[] vezesAlugados;
	private double[] precoslocacao;
	private int qtd;
	
	public Locadora(int qtd) {
		this.qtd = qtd;
		this.filmes = new String[qtd];
		this.vezesAlugados = new int[qtd];
		this.precoslocacao = new double[qtd];
	}
	
	public void setProdutos(int i, String filmes, int vezesAlugados, double precoslocacao) {
		this.filmes[i - 1] = filmes;
		this.vezesAlugados[i - 1] = vezesAlugados;
		this.precoslocacao[i - 1] = precoslocacao;
	}
	
	public void getProdutos() {
		for(int i = 0; i < this.qtd; i++) {
			System.out.println(
					"Filmes disponiveis na locadora: \n"+
					"\nFilme: "+filmes[i]+
					"\nVezes alugado: "+vezesAlugados[i]+
					"\nValor locação: "+precoslocacao[i]);
		}
	}
	
	public double valorTotal() {
		double valorTotal = 0;
		
		for(int i = 0; i < this.qtd; i++) {
			valorTotal += this.precoslocacao[i];
		}
		return valorTotal;
	}
	
	public String maisAlugado() {
		int maisAlugado = 0;
		for(int i = 0; i < this.qtd; i++) {
			if(this.vezesAlugados[i] > this.vezesAlugados[maisAlugado]) {
				maisAlugado = i;
			}
		}
		
		return 	"O filme mais alugado é: "+this.filmes[maisAlugado]+
				"\nVezes Alugado: "+this.vezesAlugados[maisAlugado];
	}
	
	public String alugarFilme(int i, boolean alugado) {
		int index = i - 1;
		
		if(alugado && index >= 0 && index < this.qtd) {
			this.vezesAlugados[index] += 1;
			return "Filme alugado foi: "+this.filmes[index]+
					"\nQuantidade de vezes alugado: "+this.vezesAlugados[index];
		} else {
			return "Opção indisponivel";
		}
	}
	
	public String devolverFilme(int i, boolean alugado) {
		int index = i - 1;
		
		if(alugado) {
			alugado = true;
			return "Filme "+filmes[index]+" devolvido";
		} else {
			alugado = false;
			return "Nenhum filme alugado";
		}
	}
	
}
