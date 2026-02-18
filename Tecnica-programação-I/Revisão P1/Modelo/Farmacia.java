package revisao.modelo;

public class Farmacia {

	private String[] nomesMedicamentos;
	private int[] diasParaVencimento;
	private double[] precos;
	public int qtd;
	
	public Farmacia(int qtd) {
		this.qtd = qtd;
		this.nomesMedicamentos = new String[qtd];
		this.diasParaVencimento = new int[qtd];
		this.precos = new double[qtd];
	}
	
	public String[] getNomesMedicamentos() {
		return this.nomesMedicamentos;
	}
	
	public void setNomesMedicamentos(String[] nomesMedicamentos) {
		this.nomesMedicamentos = nomesMedicamentos;
		for (int i = 0; i < qtd; i++) {
			System.out.println("Os medicamentos disponíveis são: " + this.nomesMedicamentos[i]);
		}
	}
	
	public int[] getDiasParaVencimentos() {
		return this.diasParaVencimento;
	}
	
	public void setDiasParaVencimentos(int[] diasParaVencimento) {
		this.diasParaVencimento = diasParaVencimento;
		System.out.println();
		for (int i = 0; i < qtd; i++) {
			System.out.println("Dias para o vencimento do remédio " + this.nomesMedicamentos[i] + ": " + this.diasParaVencimento[i]);
		}
	}
	
	public double[] getPrecos() {
		return this.precos;
	}
	
	public void setPrecos(double[] precos) {
		this.precos = precos;
		System.out.println();
		for (int i = 0; i < qtd; i++) {
			System.out.println("Preço do remédio " + this.nomesMedicamentos[i] + ": R$" + this.precos[i]);
		}
	}
	

	public void media() {
		double soma = 0;
		for (int i = 0; i < qtd; i++) {
			soma += this.diasParaVencimento[i];
		}
		double media = soma / qtd;
		System.out.println("\nA média de dias para vencimento é: " + media);
	}
	

	public void proximosVencimento() {
		System.out.println("\nMedicamentos próximos do vencimento:");
		for (int i = 0; i < qtd; i++) {
			if (this.diasParaVencimento[i] < 5) {
				System.out.println(this.nomesMedicamentos[i] + " (vence em " + this.diasParaVencimento[i] + " dias)");
			}
		}
	}
	

	public void aplicarDesconto() {
		System.out.println("\nAplicando desconto de 50% nos medicamentos próximos do vencimento...");
		for (int i = 0; i < qtd; i++) {
			if (this.diasParaVencimento[i] < 5) {
				this.precos[i] = this.precos[i] / 2;
				System.out.println(this.nomesMedicamentos[i] + " agora custa: R$" + this.precos[i]);
			}
		}
	}
	

	public void vender(String nome) {
		System.out.println("\nVendendo o medicamento: " + nome);
		for (int i = 0; i < qtd; i++) {
			if (this.nomesMedicamentos[i].equalsIgnoreCase(nome)) {
				for (int j = i; j < qtd - 1; j++) {
					this.nomesMedicamentos[j] = this.nomesMedicamentos[j + 1];
					this.diasParaVencimento[j] = this.diasParaVencimento[j + 1];
					this.precos[j] = this.precos[j + 1];
				}
				qtd--;
				System.out.println(nome + " foi vendido e removido do estoque.");
				return;
			}
		}
		System.out.println("Medicamento não encontrado.");
	}
}
