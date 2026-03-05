package encapsulamento.view;

import encapsulamento.modelo.Carro;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite a marca do carro: ");
	    String marca = entrada.nextLine();

	    System.out.print("Digite o modelo do carro: ");
	    String modelo = entrada.nextLine();

	    System.out.print("Digite o ano do carro: ");
	    int ano = entrada.nextInt();
		
		Carro meuCarro = new Carro(marca, modelo, ano);
		meuCarro.setcapacidade(50);
	    meuCarro.setTanque(10);     

	   
	    System.out.print("Digite quantos litros quer abastecer: ");
	    double litros = entrada.nextDouble();

	    System.out.print("Digite o preço da gasolina: ");
	    double preco = entrada.nextDouble();
	       
	    meuCarro.abastecer(litros, preco);
	   
	    System.out.println("Para encher o tanque custaria: R$ " + meuCarro.valorAbastecimento(preco));
						
		entrada.close();
		
	}

}
