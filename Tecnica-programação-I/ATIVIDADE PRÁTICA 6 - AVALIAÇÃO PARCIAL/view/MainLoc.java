package encapsulamento.view;

import java.util.Scanner;

import encapsulamento.modelo.Locadora;

public class MainLoc {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		Locadora locadora = new Locadora(5);
		locadora.setProdutos(1, "Homem aranha", 70, 45);
		locadora.setProdutos(2, "Homem de ferro", 40, 30);
		locadora.setProdutos(3, "Vingadores", 60, 42);
		locadora.setProdutos(4, "Batman", 30, 38);
		locadora.setProdutos(5, "Flash", 15, 20);
		
		locadora.getProdutos();
		System.out.println();
		System.out.println("Valor total dos filmes alugados é: "+locadora.valorTotal());
		System.out.println();
		
		System.out.println("Qual dos 5 filmes você deseja alugar? ");
		int escolha = entrada.nextInt();
		
		
		System.out.println(locadora.alugarFilme(escolha, true));
		System.out.println();
		System.out.println(locadora.devolverFilme(escolha,true));
		
		entrada.close();	
	}

}
