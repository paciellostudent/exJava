package exercicios;

import java.util.Scanner;

public class Ext1Ex1 {
	public static void main(String[] args) {
		int num = 1;
		int qtd = 0;
		Scanner e = new Scanner(System.in);
		while(num != 0) {
			System.out.println("Digite um n�mero: ");
			num = e.nextInt();
			if (num < 200 && num > 100){
				qtd = qtd + 1;
			}
		}	
		e.close();
		System.out.println("H� "+qtd+" n�meros entre 100 e 200!");
	}
}
