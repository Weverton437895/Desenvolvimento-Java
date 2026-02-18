package encapsulamento.view;

import encapsulamento.modelo.ContaBancaria;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o nome do titular da conta: ");
		String titular = entrada.next();
		
		System.out.println("Digite o saldo da conta bancaria: ");
		double saldo = entrada.nextDouble();
		
		ContaBancaria Conta = new ContaBancaria(titular,saldo);
		
		System.out.println("Digite o valor do depósito: ");
		double deposito = entrada.nextDouble();
		
		System.out.println("Digite o valor do saque: ");
		double saque = entrada.nextDouble();
		
		Conta.deposito(deposito);
		Conta.saque(saque);
		
		entrada.close();
	}
}
