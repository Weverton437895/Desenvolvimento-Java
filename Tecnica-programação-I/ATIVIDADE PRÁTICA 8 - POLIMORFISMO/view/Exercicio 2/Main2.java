package view;

import modelo.SomarDois;
import modelo.SomarTres;
import modelo.SomarDouble;

public class Main2 {

	public static void main(String[] args) {
		
		  SomarDois somar = new SomarDois(10, 5);
	      System.out.println(somar);

	      SomarTres somar3 = new SomarTres(4, 6, 10);
	      System.out.println(somar3);

	      SomarDouble somarD = new SomarDouble(5.5, 2.3);
	      System.out.println(somarD);
	}
}
