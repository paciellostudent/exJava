package Ext1Ex12;

public class Circulo implements IGeometria{
	private double raio;
	
	public Circulo(double raio) {
		this.raio=raio;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}
	
	@Override
	public double area() {
		return Math.PI*Math.pow(this.raio, 2);
	}
	
	@Override
	public double perimetro() {
		return 2*Math.PI*this.raio;
	}

	@Override
	public String toString() {
		return "Círculo: raio = " + raio;
	}

}
