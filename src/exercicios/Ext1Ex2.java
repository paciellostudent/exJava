package exercicios;

public class Ext1Ex2 {
	public static void main(String[] args) {
		double altPedro = 1.50;
		double altMauro = 1.10;
		int ano = 0;
		
		while (altPedro != altMauro) {
			altPedro = altPedro + 0.02;
			altMauro = altMauro + 0.03;
			ano = ano + 1;
		};
		
		System.out.println("Levaram "+ano+" anos para eles ficarem do mesmo tamanho!");
	}
	
}
