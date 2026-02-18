package revisao.view;

import revisao.modelo.Funcionario;

public class MainFuncionario {
	
	public static void main(String[] args) {
		
		Funcionario func = new Funcionario("Tevez",5000,"Programador");
		
		func.setNome("Tevez");
		func.setSalario(5000);
		func.setCargo("Programador");
		
		func.mostra();
	}
}
