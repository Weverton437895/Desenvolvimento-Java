package view;

import modelo.PagamentoCartao;
import modelo.PagamentoBoleto;

public class Main4 {

	public static void main(String[] args) {
		
		PagamentoCartao cartao = new PagamentoCartao();
						
		System.out.println(cartao.processarPagamento());
		
		PagamentoBoleto boleto = new PagamentoBoleto();
						
		System.out.println(boleto.processarPagamento());
	}

}
