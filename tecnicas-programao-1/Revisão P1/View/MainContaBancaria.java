package revisao.view;

import revisao.modelo.ContaBancaria;

public class MainContaBancaria {

	public static void main(String[] args) {
		
		ContaBancaria conta = new ContaBancaria("Tevez",43252,20000);
		
		conta.setTitular("Tevez");
		conta.setnumeroConta(43252);
		conta.setSaldo(20000);
		
		System.out.println(conta.getTitular());
		
		
		}
}
