import java.util.Scanner;

public class atividade1 {

	public static void main(String[] args) {
		
		 Scanner entrada = new Scanner(System.in);
	        int[][] matriz1 = new int[3][3];
	        int[][] matriz2 = new int[3][3];
	        int[][] Soma = new int[3][3];

	        System.out.println("Digite os elementos da matriz 1:");
	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                System.out.print("Elemento [" + i + "][" + j + "]: ");
	                matriz1[i][j] = entrada.nextInt();
	            }
	        }

	        System.out.println("Digite os elementos da matriz 2:");
	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                System.out.print("Elemento [" + i + "][" + j + "]: ");
	                matriz2[i][j] = entrada.nextInt();
	            }
	        }

	       
	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                Soma[i][j] = matriz1[i][j] + matriz2[i][j];
	            }
	        }

	     
	        System.out.println("Resultado da soma das matrizes 1 e 2:");
	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                System.out.print(Soma[i][j] + " ");
	            }
	            System.out.println();
	        }

	        entrada.close();
	}
}
