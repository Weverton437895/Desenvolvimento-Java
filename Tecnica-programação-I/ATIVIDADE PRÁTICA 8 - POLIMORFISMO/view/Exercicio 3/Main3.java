package view;

import modelo.Produto;

public class Main3 {

	    public static void main(String[] args) {
	    	
	        Produto p1 = new Produto("Camiseta");
	        Produto p2 = new Produto("Tênis", 199.90);
	        Produto p3 = new Produto("Relógio", 349.99, 5);

	        System.out.println(p1);
	        System.out.println(p2);
	        System.out.println(p3);
	        
	    }
	}
