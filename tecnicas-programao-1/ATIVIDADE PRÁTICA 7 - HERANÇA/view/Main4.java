package view;

import java.util.Scanner;

import modelo.SistemaDeSeguranca;

public class Main4 {

	public static void main(String[] args) {
		
			Scanner entrada = new Scanner(System.in);
		
			SistemaDeSeguranca sistema = new SistemaDeSeguranca ();
	        
	        boolean autenticado = false;

	        System.out.println("Sistema de Login");

	        while (!autenticado) {
	            System.out.print("Usuário: ");
	            String usuario = entrada.nextLine();

	            System.out.print("Senha: ");
	            String senha = entrada.nextLine();

	            autenticado = sistema.login(usuario, senha);
	        }

	        System.out.println("\nBem-vindo, " + sistema.getUsuario() + "!");

	        System.out.print("\nDeseja fazer logout? (s/n): ");
	        String opcao = entrada.nextLine();

	        if (opcao.equalsIgnoreCase("s")) {
	            sistema.logout();
	        } else {
	            System.out.println("Sessão mantida.");
	        }

	        entrada.close();
	}
}
