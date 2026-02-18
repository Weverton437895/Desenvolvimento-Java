import java.util.Scanner;

public class nove {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String[] nomes = new String[5];
		
		String nome2;
		
		for (int i = 0; i <= 4; i++) {
			System.out.println("Digite um nome: ");
			nomes[i] = entrada.nextLine().toLowerCase();
		}
		
		System.out.println("Digite o último nome: ");
		nome2 = entrada.nextLine().toLowerCase();
		
		Boolean cheque;
		
		do {
			cheque = false;
			for(int i = 0; i < nomes.length; i++) {
				if(nome2.equals(nomes[i])) {
					cheque = true;
					System.out.println(nome2+" É um nome repetido! Digite outro nome: ");
					nome2 = entrada.nextLine().toLowerCase();
					break;
				} 
			}
			
		} while(cheque);
		System.out.println("Nomes salvos com sucesso! ");
		entrada.close();
	}
} 
		


