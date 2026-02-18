package revisao.view;

import revisao.modelo.Aluno;

public class MainAluno {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno("Tevez",24542,10);
		
		aluno.setNome("Tevez");
		aluno.setMatricula(24542);
		aluno.setNotafinal(10);
	}
}
