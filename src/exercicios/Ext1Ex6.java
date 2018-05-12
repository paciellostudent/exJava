package exercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.JOptionPane;

public class Ext1Ex6 {
	public static void main(String[] args) {
		List<Integer> vet = new ArrayList<Integer>();
		Integer num = 1;
		int dist[] = new int[2];
		while (num != 0) {
			num = Integer.parseInt(JOptionPane.showInputDialog("Informe um número inteiro positivo"));
			if(num > 0) {
				vet.add(num);
			}else {
				if(num < 0)
					JOptionPane.showMessageDialog(null, "Não digite números negativos");
			}
		}
		
		int k = 0;
		Integer x = Integer.parseInt(JOptionPane.showInputDialog("Informe um número inteiro positivo para pesquisa: "));
		for (int i = 0; i < vet.size(); i++) {
			if(vet.get(i) == x) {
				JOptionPane.showMessageDialog(null, "Valor: "+vet.get(i)+", posição: "+i);
				dist[k]= i;
				k = k++;
			}
		}
		
		int dista = dist[0]-dist[1];
		if(dist[1] != 0)
			JOptionPane.showMessageDialog(null, "Distancia entre os números: "+dista);
		
		/*for (int i = 1; i == vet.size(); i++) {
			int a = vet.get(i);
			int b = vet.get(i-1);
			int aux = 0;
			if(a < b) {
				aux = b;
				b = a;
				a = aux;
			}
		}
		JOptionPane.showMessageDialog(null, "Ordem Cres.: "+vet);*/
		Collections.sort(vet);
		JOptionPane.showMessageDialog(null,"Orgem cres.: "+ vet);
		int w = 0;
		int t = vet.get(w);
		while (t < x)
			w=w++;
		int g = 0;
		for (int i = 0; i < vet.size(); i++) {
			t = vet.get(i);
			if(t == x) {
				g=g++;
				break;
			}
		}
		int z = 0;
		t = vet.get(z);
		while (t < x)
			z=z++;
		Collections.reverse(vet);
		JOptionPane.showMessageDialog(null,"Orgem decres.: "+ vet);
		JOptionPane.showMessageDialog(null,"Numeros menores que "+x+": "+w);
		JOptionPane.showMessageDialog(null,"Números iguais a "+x+": "+g);
		JOptionPane.showMessageDialog(null,"Números maiores que "+x+": "+z);


		
	}
}
