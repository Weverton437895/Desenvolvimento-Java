import java.util.Scanner;

public class tres {
	
	public static void main(String[] args) {
		
		int num;
		char cont;
		
		Scanner entrada = new Scanner(System.in);
		
		do {
			
			System.out.println("Digite 1 para calcular área do quadrado");
			System.out.println("Digite 2 para Calcular área do círculo");
			num = entrada.nextInt();
			
			
			switch(num) {
			case 1:
				int num1;
				System.out.println("Digite um valor para o lado do quadrado: ");
				num1 = entrada.nextInt();
				entrada.nextLine();
				int resultado = num1*num1;
				System.out.println("A área do quadrado é "+resultado);
				break;
			case 2:
				System.out.println("Digite o raio do círculo: ");
				double raio = entrada.nextDouble();
				entrada.nextLine();
				double pi = 3.1416; 
				double area = pi * raio * raio;
				System.out.println("A área do circulo é "+area);
				break;
			default:
				System.out.println("Opção invalida! Digite novamente");
				break;
			}
			
			System.out.println("Deseja continuar no programa ? [S/N] ");
			cont = entrada.nextLine().toLowerCase().charAt(0);
		
		} while(cont != 'n');
		System.out.println("Programa encerrado");
		entrada.close();
		
	}

}
