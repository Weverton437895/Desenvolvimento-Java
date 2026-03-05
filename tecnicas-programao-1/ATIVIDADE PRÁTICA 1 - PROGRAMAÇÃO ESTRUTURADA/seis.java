import java.util.Scanner;

public class seis {

	public static void main(String[] args) {
		int num,result = 1;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro para saber o fatorial: ");
		num = entrada.nextInt();
		
		if(num < 0) {
			System.out.println("Erro número negativo: ");
		} else {
			for(int i = num; i >= 1; i--) {
				 result = result * i;
			}
			 System.out.println("O fatorial de "+num+" é "+result);
		}
		entrada.close();
	}
}
