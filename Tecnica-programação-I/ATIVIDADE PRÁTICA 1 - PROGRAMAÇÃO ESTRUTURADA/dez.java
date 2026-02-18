import java.util.Scanner;

public class dez {

	public static void main(String[] args) {
		String num;
		String senha = "java123";
		
		Scanner entrada = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("Digite a senha correta para sair do loop: ");
			num = entrada.nextLine().toLowerCase();
			
			if(num.equals(senha)) {
				System.out.println("Senha correta! Saindo do loop....");
				break;
			} else {
				System.out.println("Senha incorreta! Digite novamente: ");
			}
			System.out.println();
		}
		entrada.close();
	}
}
