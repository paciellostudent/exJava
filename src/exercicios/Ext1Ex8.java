package exercicios;

import Ext1Ex8.Triangulo;

public class Ext1Ex8 {
	public static void main(String[] args) {
		Triangulo tri = new Triangulo();
		
		tri.setV1(5, 5);
		tri.setV2(2, 6);
		tri.setV3(0, 5);
		
		System.out.printf("Perimeto do triangulo: %2f",tri.getPerimetro());
	}
}
