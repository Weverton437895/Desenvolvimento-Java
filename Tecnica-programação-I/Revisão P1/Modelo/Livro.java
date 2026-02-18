package revisao.modelo;

public class Livro {

	public String titulo;
	public String autor;
	public int anoPublicacao;
	
	public void titulo(String titulo) {
		this.titulo = titulo;
	}
	
	public void autor(String autor) {
		this.autor = autor;
	}
	
	public void anoPublicacao(int ano) {
		this.anoPublicacao = ano;
	}
	
	public void mostrar() {
		System.out.println("O titúlo do livro é: "+titulo+"\n"
				+"O autor do livro é: "+autor+"\n"
				+"Ano de publicação do livro: "+anoPublicacao);
	}
}
