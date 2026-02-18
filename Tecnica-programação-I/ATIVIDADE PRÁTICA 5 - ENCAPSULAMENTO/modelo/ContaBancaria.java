package encapsulamento.modelo;

public class ContaBancaria {

	private String titular;
	private double saldo;
	
	
	public ContaBancaria(String titular, double saldo) {
		this.titular = titular;
		this.saldo = saldo;
			
		if(saldo <= 0) {
			System.out.println("Saldo insuficiente para saques.");
		} else {
			this.saldo = saldo;
			this.titular = titular;
		}
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public String getTitular() {
		return this.titular;
	}
	
	public void setTitular(String titular) {
		this.titular = titular;
	}
		
	public void deposito(double deposito) {
		if(deposito > 0) {
			System.out.println("Deposito de "+deposito+" Na conta "+titular+" Realizado com sucesso");
			this.saldo += deposito;
		} else {
			System.out.println("Valor depósito invalido. ");
		}
	}
	
	public void saque(double saque) {
		if(saque <= saldo && saque > 0) {
			this.saldo -= saque;
			System.out.println("Saque realizado com sucesso, valor do saque: "+saque+" Seu saldo atual é "+saldo);
		} else {
			System.out.println("Saldo insuficiente para o valor do saque, seu saldo atual é "+saldo);
		}
	}
	
	
}
