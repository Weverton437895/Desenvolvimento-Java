package modelo;

public class Bicicleta extends Veiculos {

	private String marca;
	private String modelo;
	private String cor;
	
	public Bicicleta(String mover, String marca, String modelo, String cor) {
		super("");
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
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

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	@Override
	public String getMover() {
		return "A Bicicleta está pedalando";
	}

	@Override
	public String toString() {
		return "Bicicleta [mover= "+ getMover()+ " marca=" + marca + ", modelo=" + modelo + ", cor=" + cor + "]";
	}
	
	
	
	
}
