package revisao.view;

import revisao.modelo.PostoCombustivel;

public class MainPostoComb {

	public static void main(String[] args) {
		
		int qtd = 3;
		
		PostoCombustivel posto = new  PostoCombustivel(qtd);
		
		String[] nomes = {"Etanol","Gazolina","Diesel"};
		double[] precos = {5,5.50,5.20};
		int[] litros = {90,70,50};
		
		posto.setTiposCombustivel(nomes);
		posto.setprecosLitros(precos);
		posto.setlitrosDisponiveis(litros);
		
		posto.exibirCombustiveis();
		posto.ValorTotalEstoque();
		posto.verificarMaiorMenorEstoque();
		posto.venderCombustivel("Etanol", 10);
		posto.reabastecerCombustivel("Etanol", 5);
		
	}
}
