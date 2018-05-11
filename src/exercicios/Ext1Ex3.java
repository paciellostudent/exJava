package exercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Ext1Ex3 {
	public static void main(String[] args) {
		List<Integer> vet = new ArrayList<Integer>();
		Scanner ler = new Scanner(System.in);
		int z=0,k=0, soma = 0;
		
		do {
			System.out.print("Escreva um número: ");
			k = ler.nextInt();
			vet.add(k);
			soma += k;
			z = z++;
		}
		while(k != 0);
		ler.close();
		
		System.out.println("Soma dos valores: "+soma);
		
		System.out.println("Valores na ordem que foram digitados: "+vet);
		System.out.println();
		
		System.out.println("Valores em ordem crescente: ");
		Collections.sort(vet);
		System.out.println(vet);
		System.out.println();
		
		double media = soma/(vet.size()-1);
		System.out.println("Média aritimética dos valores: "+media);
	}
}
