package encapsulamento.view;

import encapsulamento.modelo.Produto;

import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o nome do produto: ");
		String nome = entrada.next();
		
		System.out.println("Digite o preço do produto: ");
		double preco = entrada.nextDouble();
		
		System.out.println("Digite a quantidade de produto: ");
		int quantidade = entrada.nextInt();
		
		Produto produto = new Produto(nome,preco,quantidade);
		
		produto.setNome(nome);
		produto.setPreco(preco);
		produto.setQuantidade(quantidade);
		
		entrada.close();
	}
}
