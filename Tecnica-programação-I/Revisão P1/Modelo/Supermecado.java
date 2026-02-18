package revisao.modelo;

public class Supermecado {

    private String[] nomesProdutos;
    private double[] precos;
    private double[] descontos;
    private int qtd;

    public Supermecado(int qtd) {
        this.qtd = qtd;
        this.nomesProdutos = new String[qtd];
        this.precos = new double[qtd];
        this.descontos = new double[qtd];
    }

    public String[] getNomesProdutos() {
        return this.nomesProdutos;
    }

    public void setNomesProdutos(String[] nomesProdutos) { 
        this.nomesProdutos = nomesProdutos;
    }

    public double[] getPrecos() {
        return this.precos;
    }

    public void setPrecos(double[] precos) { 
        this.precos = precos;
    }

    public double[] getDescontos() {
        return this.descontos;
    }

    public void setDescontos(double[] descontos) {
        this.descontos = descontos;
    }

    public void mostrarProdutos() { 
        System.out.println("Produtos com preços originais:");
        for (int i = 0; i < qtd; i++) {
            System.out.println("Produto: " + this.nomesProdutos[i] + " Preço original: R$ " + this.precos[i]);
        }

        System.out.println("\nProdutos com preços com descontos aplicados:");
        for (int i = 0; i < qtd; i++) {
            double precoComDesconto = this.precos[i] - (this.precos[i] * this.descontos[i] / 100); 
            System.out.println("Produto: " + this.nomesProdutos[i] + " Preço com desconto: R$ " + precoComDesconto);
        }
    }
    
    public void totalCompra() {
    	double totalComDesconto = 0;
    	for(int i = 0; i < qtd; i++) {
    		 double precoComDesconto = this.precos[i] - (this.precos[i] * this.descontos[i] / 100);
             totalComDesconto += precoComDesconto;
    	}
    	System.out.println("Preço total dos produtos"+totalComDesconto);
    }
    
    public void produtoMaiorEconomia() {
        double maiorEconomia = 0;
        String produto = "";

        for (int i = 0; i < qtd; i++) {
            double economia = this.precos[i] * (this.descontos[i] / 100);
            if (economia > maiorEconomia) {
                maiorEconomia = economia;
                produto = this.nomesProdutos[i];
            }
        }

        System.out.println("Produto com maior economia: " + produto + " Economia: R$ " +  maiorEconomia);
    }
    
    public void comprarProduto(String nome) {
        int index = -1;


        for (int i = 0; i < qtd; i++) {
            if (this.nomesProdutos[i].equalsIgnoreCase(nome)) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("\nProduto não encontrado: " + nome);
            return;
        }


        for (int i = index; i < qtd - 1; i++) {
            this.nomesProdutos[i] = this.nomesProdutos[i + 1];
            this.precos[i] = this.precos[i + 1];
            this.descontos[i] = this.descontos[i + 1];
        }

        qtd--; 

        System.out.println("\nProduto comprado e removido: " + nome);
    }

    public void reporProduto(String nome, double preco, double desconto) {
        if (qtd >= this.nomesProdutos.length) {
            System.out.println("\nLimite máximo de produtos atingido!");
            return;
        }

        this.nomesProdutos[qtd] = nome;
        this.precos[qtd] = preco;
        this.descontos[qtd] = desconto;
        qtd++;

        System.out.println("\nProduto reposto: " + nome + 
                           " | Preço: R$ " + preco + 
                           " | Desconto: " + desconto + "%");
    }
}
