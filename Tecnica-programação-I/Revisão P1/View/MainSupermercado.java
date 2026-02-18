package revisao.view;

import revisao.modelo.Supermecado;

public class MainSupermercado {

	public static void main(String[] args) {
		
		int qtd = 4;
		
		Supermecado superme = new Supermecado(qtd);
		
		String[] nomes = {"Arroz","Açucar","Chocolate","Carne"};
		double[] precos = {40,10,20,80};
		double[] descontos= {10,5,5,10};
		
		superme.setNomesProdutos(nomes);
		superme.setPrecos(precos);
		superme.setDescontos(descontos);
		
		superme.mostrarProdutos();
		superme.totalCompra();
		superme.produtoMaiorEconomia();
		superme.comprarProduto("Arroz");
		superme.reporProduto("Arroz", qtd, qtd);
	}
}
