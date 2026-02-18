import java.util.Scanner;

public class um {
	
	public static void main(String[] args) {
		
		int num;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um valor: ");
		num = entrada.nextInt();
		
		if(num > 0) {
			System.out.println("O número "+num+" é positivo");
		}else {
			System.out.println("O número "+num+" é negativo");
		}
		entrada.close();
	}
}
