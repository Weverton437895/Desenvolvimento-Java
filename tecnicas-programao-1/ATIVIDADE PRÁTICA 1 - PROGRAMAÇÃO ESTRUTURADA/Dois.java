import java.util.Scanner;

public class Dois {
	
	public static void main(String[] args) {
		
		int num1, num2;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o primeiro valor: ");
		num1 = entrada.nextInt();
		System.out.println("Digite o segundo valor: ");
		num2 = entrada.nextInt();
		
		if (num1 == num2) {
			System.out.println("O primeiro valor "+num1+" é igual o segundo valor "+num2);
		} else if (num1 > num2) {
			System.out.println("Os valores são diferentes! O primeiro valor é "+num1+" é maior que o segundo valor "+num2);
		} else {
			System.out.println("Os valores são diferentes! O segundo valor é "+num2+" é maior que o primeiro valor "+num1);
		}
		entrada.close();
	}

}
