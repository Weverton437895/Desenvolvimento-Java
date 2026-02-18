package revisao.view;

import revisao.modelo.Celular;

public class MainCelular {

	public static void main(String[] args) {
		
		Celular cel = new Celular();
		
		cel.exibirMarca("Samsung");
		cel.exibirModelo("Galaxy S23");
		cel.exibirPreco(3000);
	}
}
