package exercicios;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Ext1Ex6 {
	public static void main(String[] args) {
		List<Integer> vet = new ArrayList<Integer>();
		Integer num = 1;
		while (num != 0) {
			num = Integer.parseInt(JOptionPane.showInputDialog("Informe um número inteiro positivo"));
			if(num > 0) {
				vet.add(num);
			}else {
				if(num < 0)
					JOptionPane.showMessageDialog(null, "Não digite números negativos");
			}
		}
		int aux = 0;
		int p1 = 0;
		int p2 = 0;
		Integer x = Integer.parseInt(JOptionPane.showInputDialog("Informe um número inteiro positivo para pesquisa: "));
		for (int i = 0; i < vet.size(); i++) {
			if(vet.get(i) == x) {
				JOptionPane.showMessageDialog(null, "Valor: "+vet.get(i)+", posição: "+i);
				aux = aux + 1;
				p1 = i;
			}
			if(aux == 2) {
				p2 = i;
				JOptionPane.showMessageDialog(null, "Distância entre as repetições: "+(p2-p1));
			}
		}
	}
}
