package Ext1Ex12;

public class Retangulo extends Quadrilatero {
	
	public Retangulo(double base, double altura) {
		this.lado1 = base;
		this.lado2 = altura;
	}
	
	@Override
	public double area() {
		return lado1*lado2;
	}
	
	@Override
	public double perimetro() {
		return 2*(lado1+lado2);
	}

	@Override
	public String toString() {
		return "Retangulo: base = "+lado1+", altura = "+lado2;
	}
	
	
}
