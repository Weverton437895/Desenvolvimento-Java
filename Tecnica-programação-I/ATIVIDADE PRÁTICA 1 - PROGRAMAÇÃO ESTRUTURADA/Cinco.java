import java.util.Scanner;

public class Cinco {
	
	public static void main(String[] args) {
		int num;
		char cont;
		
		Scanner entrada = new Scanner(System.in);
		
		while(true) {
			System.out.println("Digite um número inteiro: ");
			num = entrada.nextInt();
			entrada.nextLine();
			
		if (num%2==0) {
			System.out.println(num+" É um número par");
		} else {
			System.out.println(num+" É um número impar");
			}
		
		System.out.println();
		
		System.out.println("Deseja sair do loop ? [S/N]");
		cont = entrada.nextLine().toLowerCase().charAt(0);
		
		if(cont == 's') {
			System.out.println("Loop finalizado");
			break;
			}
		} 
		entrada.close();
	}
}
