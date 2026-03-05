package modelo;

public class PagamentoDinheiro implements IPagamento {
	
	private double desconto = 0.10;
	private double valor;
		
	public PagamentoDinheiro(double valor) {
		this.valor = valor;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public double calcularPagamento() {	
		return this.valor - (this.valor * this.desconto);
	}
	
	public String emitirRecibo() {
		return "Valor do produto: R$" + valor +
		       "\nValor com deconto (10%): R$" + calcularPagamento();
	}
	

}
