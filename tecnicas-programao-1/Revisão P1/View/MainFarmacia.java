package revisao.view;

import revisao.modelo.Farmacia;

public class MainFarmacia {

	public static void main(String[] args) {
		
		int qtd = 3;
		
		Farmacia farma = new Farmacia(qtd);
		
		String[] nomes = {"Dipirona","Parasetamol","Neosaldina"};
		double[] preco = {15,12,13};
		int[] vencimento = {30,45,25};
		
		farma.setNomesMedicamentos(nomes);
		farma.setPrecos(preco);
		farma.setDiasParaVencimentos(vencimento);
		
		farma.media();
		farma.proximosVencimento();
		farma.aplicarDesconto();
		farma.vender("Paracetamol");
		
	}
}
