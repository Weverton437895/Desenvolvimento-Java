package revisao.modelo;

public class ContaBancaria {

	private String titular;
	private int numeroConta;
	private double saldo;
	
	public ContaBancaria(String titular, int numeroConta, double saldo) {
		this.titular = titular;
		this.numeroConta = numeroConta;
		this.saldo = saldo;
	}
	
	public String getTitular() {
		return "O titular da conta é: "+this.titular+""+
				"\nO numero da conta é: "+this.numeroConta+
				"\nO saldo da conta é: "+this.saldo;
	}
	
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	public int getnumeroConta() {
		return this.numeroConta;
	}
	
	public void setnumeroConta( int numeroConta) {
		this.numeroConta = numeroConta;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}
