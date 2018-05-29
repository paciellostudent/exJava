package entidades;

import interfaces.Movimenta;

public class Animal implements Movimenta {
	private int patas;
	
	public String somEmitido() {
		return "";
	}

	@Override
	public double velocidade() {
		return 0;
	}
	
}
