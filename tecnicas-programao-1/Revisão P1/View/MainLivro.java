package revisao.view;

import revisao.modelo.Livro;
public class MainLivro {

	public static void main(String[] args) {
		
		Livro livro = new Livro();
		
		livro.titulo("Star Wars: Marcas da Guerra");
		livro.autor("Chuck Wendig");
		livro.anoPublicacao(2015);
		
		livro.mostrar();
	}
}
