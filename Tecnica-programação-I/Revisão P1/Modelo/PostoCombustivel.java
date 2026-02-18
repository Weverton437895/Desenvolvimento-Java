package revisao.modelo;

public class PostoCombustivel {

	
	private String[] tiposCombustivel;
	private double[] precosLitros;
	private int[] litrosDisponiveis;
	public int qtd;
	
	public PostoCombustivel(int qtd) {
		this.qtd = qtd;
		this.tiposCombustivel = new String[qtd];
		this.precosLitros = new double[qtd];
		this.litrosDisponiveis = new int[qtd];
	}
	
	public String[] getTiposCombustivel() {
		return this.tiposCombustivel;
	}
	
	public void setTiposCombustivel(String[] tipos) {
		this.tiposCombustivel = tipos;
	}
	
	public double[] getprecosLitros() {
		return this.precosLitros;
	}
	
	public void setprecosLitros(double[] precosLitros) {
		this.precosLitros = precosLitros;
	}
	
	public int[] getlitrosDisponiveis() {
		return this.litrosDisponiveis;
	}
	
	public void setlitrosDisponiveis(int[] litrosDisponiveis) {
		this.litrosDisponiveis = litrosDisponiveis;
	}
	
	public void exibirCombustiveis() {
		for(int i = 0; i < qtd; i++) {
			System.out.println("\nCombustivel disponivel: "+this.tiposCombustivel[i]+""
					+"\nPreço do Combustivel: R$ "+this.precosLitros[i]+""
					+"\nLitros disponivel: "+this.litrosDisponiveis[i]);
		}
	}
	
    public void ValorTotalEstoque() {
        double total = 0;
        for (int i = 0; i < qtd; i++) {
            total += this.precosLitros[i] * this.litrosDisponiveis[i];
        }
        System.out.println("\nValor total em estoque: R$ " + total);
    }
    
    public void verificarMaiorMenorEstoque() {
        if (qtd == 0) {
            System.out.println("Nenhum combustível cadastrado.");
            return;
        }

        int indiceMaior = 0;
        int indiceMenor = 0;

        for (int i = 1; i < qtd; i++) {
            if (this.litrosDisponiveis[i] > this.litrosDisponiveis[indiceMaior]) {
                indiceMaior = i;
            }
            if (this.litrosDisponiveis[i] < this.litrosDisponiveis[indiceMenor]) {
                indiceMenor = i;
            }
        }

        System.out.println("\nMaior estoque: " + this.tiposCombustivel[indiceMaior] +
                           " (" + this.litrosDisponiveis[indiceMaior] + " litros)");
        System.out.println("Menor estoque: " + this.tiposCombustivel[indiceMenor] +
                           " (" + this.litrosDisponiveis[indiceMenor] + " litros)");
    }
    
    public void venderCombustivel(String tipo, int litrosVendidos) {
        for (int i = 0; i < qtd; i++) {
            if (this.tiposCombustivel[i].equalsIgnoreCase(tipo)) {
                if (litrosVendidos > this.litrosDisponiveis[i]) {
                    System.out.println("\nEstoque insuficiente para vender " + litrosVendidos + " litros de " + tipo);
                    return;
                }
                this.litrosDisponiveis[i] -= litrosVendidos;
                double valor = litrosVendidos * this.precosLitros[i];
                System.out.println("\nVenda realizada: " + litrosVendidos + " litros de " + tipo +
                                   " Valor total: R$ " + valor);
                return;
            }
        }
        System.out.println("\nCombustível não encontrado: " + tipo);
    }
    
    public void reabastecerCombustivel(String tipo, int litrosAdicionados) {
        for (int i = 0; i < qtd; i++) {
            if (this.tiposCombustivel[i].equalsIgnoreCase(tipo)) {
                this.litrosDisponiveis[i] += litrosAdicionados;
                System.out.println("\nReabastecido " + litrosAdicionados + " litros de " + tipo +
                                   "  Novo total: " + this.litrosDisponiveis[i] + " litros");
                return;
            }
        }
        System.out.println("\nCombustível não encontrado: " + tipo);
    }
}
