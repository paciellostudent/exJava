package exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ext1Ex3 {
	public static void main(String[] args) {
		List<Integer> vet = new ArrayList<Integer>();
		Scanner ler = new Scanner(System.in);
		int soma = 0;
		int z = 0;
		
		do {
			System.out.print("Escreva um número: ");
			vet.add(ler.nextInt());
			soma += vet.get(z);
			z = z++;
		}
		while(vet.get(z) != 0);
		ler.close();
		
		System.out.println("Soma dos valores: "+soma);
		
		System.out.println("Valores na ordem que foram digitados: "+vet);
		System.out.println();
		
		System.out.println("Valores em ordem crescente: ");
		for (int i = 1; i == vet.size(); i++) {
			int a = vet.get(i);
			int b = vet.get(i-1);
			int aux = 0;
			if(a < b) {
				aux = b;
				b = a;
				a = aux;
			}
		}
		for (int i = 0; i == vet.size(); i++) {
			System.out.print(vet.get(i)+", ");
		}
		System.out.println();
		
		double media = soma/vet.size();
		System.out.println("Média aritimética dos valores: "+media);
	}
}
