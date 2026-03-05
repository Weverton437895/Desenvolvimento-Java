package modelo;

public class PagamentoCartao implements IPagamento {
	
	private double valor;
	private double taxa = 0.05;

	public PagamentoCartao(double valor) {
		this.valor = valor;
	}
	
	public double getValor() {
		return valor;
	}


	public void setValor(double valor) {
		this.valor = valor;
	}


	public double calcularPagamento() {	
		return this.valor + (this.valor * this.taxa);
	}
	
	public String emitirRecibo() {
		return "Valor do produto: R$" + valor +
		       "\nValor com taxa (5%): R$" + calcularPagamento();
	}
		
}
