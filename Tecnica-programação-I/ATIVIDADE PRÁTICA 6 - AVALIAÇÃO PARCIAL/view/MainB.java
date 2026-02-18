package encapsulamento.view;

import java.util.Scanner;
import encapsulamento.modelo.Biblioteca;

public class MainB {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        Biblioteca biblioteca = new Biblioteca(3);
        biblioteca.setLivros(1, "Livro1", 0, 0);
        biblioteca.setLivros(2, "Livro2", 0, 0);
        biblioteca.setLivros(3, "Livro3", 0, 0);
        
        biblioteca.getLivros();
        
        System.out.println();

        System.out.println("Escolha os livros de 1 a 3 para empréstimo: ");
        int num = entrada.nextInt();
        
        if(num >= 1 && num <= 3) {
            System.out.println(biblioteca.emprestarLivro(num));
        } else {
            System.out.println("Opção Indisponível.");
            System.exit(0);
        }
        
        System.out.println("\nDigite o índice do livro que deseja devolver (1 a 3): ");
        int num2 = entrada.nextInt();
        
        if(num2 != num) {
        	System.out.println("Você não alugou este livro: ");
        	System.exit(0);
        } else {
        	System.out.println("Livro devolvido:");
        }
        
        System.out.println("Digite quantos dias de atraso: ");
        int dias = entrada.nextInt();
        
        System.out.println("Digite a multa por dia: ");
        double multa = entrada.nextDouble();
        
        System.out.println(biblioteca.devolverLivro(num2, dias, multa));
        
        System.out.println("\nMulta total acumulada: " + biblioteca.multaTotal());
        System.out.println("Média dos atrasos: " + biblioteca.mediaAtraso());
        
        entrada.close();
    }
}
