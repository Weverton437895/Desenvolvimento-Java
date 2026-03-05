package encapsulamento.modelo;

	 
	public class Carro {
		private String marca;
		private String modelo;
		private int ano;
		private double tanque;
		private double capacidade;
		
		
		public Carro(String marca, String modelo, int ano) {
			this.marca = marca;
			this.modelo = modelo;
			if(ano < 2015) {
				System.out.println("Não pode Criar!");
			} else {
				this.ano = ano;
				this.modelo = modelo;
			}
			
		}
		
		public String getMarca() {
			return this.marca;
		}
		
		public void setMarca(String novaMarca) {
			this.marca = novaMarca;
		}
		
		public String getModelo() {
			return this.modelo;
		}
		
		public void setModelo(String modelo) {
			this.modelo = modelo;
		}
		
		public int getAno() {
			return this.ano;
		}
		
		public void setAno(int ano) {
			if(ano < 2015) {
				System.out.println("O ano não pode ser alterado! ");
			} else {
				this.ano = ano;
			}
		}
		
		public double getTanque() {
			return this.tanque;
		}
		
		public void setTanque(double tanque) {	
			this.tanque = tanque;
		}
		
		public double getcapacidade() {
			return this.capacidade;
		}
		
		public void setcapacidade(double capacidade) {
			this.capacidade = capacidade;
		}
		
		public void abastecer(double litros, double precoGasolina) {
		        if (tanque + litros > capacidade) {
		            litros = capacidade - tanque;
		        }
		        tanque += litros;
		        double custo = litros * precoGasolina;
		        System.out.println("Abasteceu " + litros + " litros. Custou R$ " + custo);
		    }
		
		 public double valorAbastecimento (double precoGasolina) {
		        double falta = capacidade - tanque;
		        return falta * precoGasolina;
		    }
		
		public void ligar() {
			System.out.println("Carro Ligado!");
		}
		public void acelerar() {
			System.out.println("Acelerando....");
		}
}
