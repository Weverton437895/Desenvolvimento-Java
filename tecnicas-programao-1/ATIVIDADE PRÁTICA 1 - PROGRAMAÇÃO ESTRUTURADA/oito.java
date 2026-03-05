import java.util.Scanner;

public class oito {
	
	public static void main(String[] args) {
		
		int num, soma = 0, numero = 1;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um número inteiro: ");
		num = entrada.nextInt();
		
		System.out.print("A soma dos "+num+" primeiros números ímpares é: ");
		for(int i = 1; i <= num;i++) {
			System.out.print(numero+"  ");
			soma += numero;
	        numero += 2;
		}
		System.out.print(" = "+soma);
		
		entrada.close();
	}
}
