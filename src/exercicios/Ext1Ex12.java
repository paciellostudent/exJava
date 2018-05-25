package exercicios;

import javax.swing.JOptionPane;
import Ext1Ex12.Circulo;
import Ext1Ex12.Quadrado;
import Ext1Ex12.Retangulo;

public class Ext1Ex12 {
	public static void main(String[] args) {
		int num = Integer.parseInt(JOptionPane.showInputDialog("Quantas formas deseja criar?: "));
		Object formas[] = new Object[num];
		
		for (int i = 0; i < formas.length; i++) {
			int forma = Integer.parseInt(JOptionPane.showInputDialog("Escolha por n�mero: 1-Quadrado 2-Ret�ngulo 3-C�rculo"));
			switch(forma) {
			case 1:
				formas[i] = new Quadrado(Double.parseDouble(JOptionPane.showInputDialog("Valor do ladodo quadrado:  ")));
				break;
			case 2:
				formas[i] = new Retangulo(Double.parseDouble(JOptionPane.showInputDialog("Valor da base do ret�ngulo:  ")),Integer.parseInt(JOptionPane.showInputDialog("Valor da alturado ret�ngulo:  ")));
				break;
			case 3:
				formas[i] =new Circulo(Double.parseDouble(JOptionPane.showInputDialog("Valor do raio do c�rculo:  ")));
				break;
			default:
				JOptionPane.showMessageDialog(null, "Valor n�o reconhecido!");
			}
		} 
		
		String escolha = JOptionPane.showInputDialog("Escolha por letra:\n (a)Os dados(lados ou raio)\n(b)Os per�metros\n(c)As �reas");
		
		switch(escolha) {
		case "a":
			for (int j = 0; j < formas.length; j++) {
				JOptionPane.showMessageDialog(null, formas[j]);
			}
			break;
		case "b":
			for (int j = 0; j < formas.length; j++) {
				if(formas[j] instanceof Quadrado)
					JOptionPane.showMessageDialog(null, "Perimetro do quadrado: "+((Quadrado)formas[j]).perimetro());
				else if(formas[j] instanceof Retangulo)
					JOptionPane.showMessageDialog(null, "Perimetro do ret�ngulo: "+((Retangulo)formas[j]).perimetro());
				else
					JOptionPane.showMessageDialog(null, "Per�metro do c�rculo: "+((Circulo)formas[j]).perimetro());
			}
			break;
		case "c":
			for (int j = 0; j < formas.length; j++) {
				if(formas[j] instanceof Quadrado)
					JOptionPane.showMessageDialog(null, "�rea do quadrado: "+((Quadrado)formas[j]).area());
				else if(formas[j] instanceof Retangulo)
					JOptionPane.showMessageDialog(null, "�rea do ret�ngulo: "+((Retangulo)formas[j]).area());
				else
					JOptionPane.showMessageDialog(null, "�rea do c�rculo: "+((Circulo)formas[j]).area());
			}
			break;
		default:
			JOptionPane.showMessageDialog(null, "Valor n�o reconhecido!");
		}
	}
}
