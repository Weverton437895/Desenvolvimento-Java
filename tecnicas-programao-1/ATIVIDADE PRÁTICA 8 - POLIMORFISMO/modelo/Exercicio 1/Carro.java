package modelo;

public class Carro extends Veiculos {
	
	private String marca;
	private String modelo;
	private int ano;
	
	public Carro(String mover, String marca, String modelo, int ano) {
		super("");
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	@Override
	public String getMover() {
		return "O Carro está dirigindo";
	}

	public String toString() {
		return "Carro [mover= "+ getMover() + " marca=" + marca + ", modelo=" + modelo + ", ano=" + ano + "]";
	}

}
