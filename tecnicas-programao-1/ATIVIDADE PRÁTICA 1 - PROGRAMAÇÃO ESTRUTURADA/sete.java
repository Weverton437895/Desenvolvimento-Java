import java.util.Scanner;

public class sete {

	public static void main(String[] args) {
		
		int idade;
		char cont;
		
		Scanner entrada = new Scanner(System.in);
		
		
		while(true) {
			System.out.println("Digite a sua idade: ");
			idade = entrada.nextInt();
			entrada.nextLine();
			
			if(idade > 60) {
			System.out.println("Você é idoso");
				} else if (idade >= 18) {
			System.out.println("Você é adulto");
				} else {
			System.out.println("Você é menor de idade");
			}
			
			System.out.println("Deseja sair do loop ? [S/N]");
			cont = entrada.nextLine().toLowerCase().charAt(0);
			
			if (cont == 's') {
				System.out.println("Saindo do loop...");
				break;
			}
			
		}
		entrada.close();
	}
}
