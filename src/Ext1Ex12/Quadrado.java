package Ext1Ex12;

public class Quadrado extends Quadrilatero {
	
	public Quadrado(double lado) {
		this.lado1 = lado;
	}
	
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return Math.pow(this.lado1, 2);
	}
	
	@Override
	public double perimetro() {
		// TODO Auto-generated method stub
		return 4*this.lado1;
	}

	@Override
	public String toString() {
		return "Quadrado: "+super.toString();
	}
	
	
}
