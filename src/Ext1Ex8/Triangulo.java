package Ext1Ex8;

import java.util.List;

public class Triangulo {
	Cartesiano v1 = new Cartesiano();
	Cartesiano v2 = new Cartesiano();
	Cartesiano v3 = new Cartesiano();
	
	public void setV1(int x,int y) {
		v1.setPonto(x, y);
	}
	
	public void setV2(int x,int y) {
		v2.setPonto(x, y);
	}
	
	public void setV3(int x,int y) {
		v3.setPonto(x, y);
	}
	
	private List<Integer> getV1() {
		return v1.getPonto();
	}
	
	private List<Integer> getV2() {
		return v2.getPonto();
	}
	
	private List<Integer> getV3() {
		return v3.getPonto();
	}

	private double getLado1() {
		int x1 = this.getV1().get(0);
		int x2 = this.getV2().get(0);
		int y1 = this.getV1().get(1);
		int y2 = this.getV2().get(1);
		
		double lado = Math.sqrt(Math.pow((x2-x1), 2)+Math.pow((y2-y1), 2));
		return lado;
	}
	
	private double getLado2() {
		int x1 = this.getV2().get(0);
		int x2 = this.getV3().get(0);
		int y1 = this.getV2().get(1);
		int y2 = this.getV3().get(1);
		
		double lado = Math.sqrt(Math.pow((x2-x1), 2)+Math.pow((y2-y1), 2));
		return lado;
	}
	
	private double getLado3() {
		int x1 = this.getV1().get(0);
		int x2 = this.getV3().get(0);
		int y1 = this.getV1().get(1);
		int y2 = this.getV3().get(1);
		
		Double lado = Math.sqrt(Math.pow((x2-x1), 2)+Math.pow((y2-y1), 2));
		return lado;
	}
	
	public double getPerimetro() {
		double per = this.getLado1() + this.getLado2() + this.getLado3();
		return per;
	}
}
