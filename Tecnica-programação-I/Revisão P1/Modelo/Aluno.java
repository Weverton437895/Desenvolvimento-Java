package revisao.modelo;

public class Aluno {

	private String nome;
	private int matricula;
	private double notaFinal;
	
	public Aluno(String nome, int matricula, double notaFinal) {
		this.nome = nome;
		this.matricula = matricula;
		this.notaFinal = notaFinal;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
		System.out.println("Nome do aluno é: "+this.nome);
	}
	
	public int getMatricula() {
		return this.matricula;
	}
	
	public void setMatricula(int matricula) {
		this.matricula = matricula;
		System.out.println("Número da matricula = "+this.matricula);
	}
	
	public double getNotafinal() {
		return this.notaFinal;
	}
	
	public void setNotafinal(double notaFinal) {
		this.notaFinal = notaFinal;
		System.out.println("A nota final é: "+this.notaFinal);
	}
}
