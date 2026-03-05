import java.util.Scanner;

public class quatro {
	
	public static void main(String[] args) {
		int num,result;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um número: ");
		num = entrada.nextInt();
		
		for(int i = 0; i < 11; i++) {
			result = num * i;
			System.out.println(num+" * "+i+" = "+result);
		}
		entrada.close();
	}

}
