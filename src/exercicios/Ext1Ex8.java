package exercicios;

import Ext1Ex8.Triangulo;

public class Ext1Ex8 {
	public static void main(String[] args) {
		Triangulo tri = new Triangulo();
		
		tri.setV1(3, 5);
		tri.setV3(5, 6);
		tri.setV3(1, 0);
		
		System.out.println(tri.getPerimetro());
	}
}
