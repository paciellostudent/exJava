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
			int forma = Integer.parseInt(JOptionPane.showInputDialog("Escolha por número: 1-Quadrado 2-Retângulo 3-Círculo"));
			switch(forma) {
			case 1:
				formas[i] = new Quadrado(Double.parseDouble(JOptionPane.showInputDialog("Valor do ladodo quadrado:  ")));
				break;
			case 2:
				formas[i] = new Retangulo(Double.parseDouble(JOptionPane.showInputDialog("Valor da base do retângulo:  ")),Integer.parseInt(JOptionPane.showInputDialog("Valor da alturado retângulo:  ")));
				break;
			case 3:
				formas[i] =new Circulo(Double.parseDouble(JOptionPane.showInputDialog("Valor do raio do círculo:  ")));
				break;
			default:
				JOptionPane.showMessageDialog(null, "Valor não reconhecido!");
			}
		} 
		
		String escolha = JOptionPane.showInputDialog("Escolha por letra:\n (a)Os dados(lados ou raio)\n(b)Os perímetros\n(c)As áreas");
		
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
					JOptionPane.showMessageDialog(null, "Perimetro do retângulo: "+((Retangulo)formas[j]).perimetro());
				else
					JOptionPane.showMessageDialog(null, "Perímetro do círculo: "+((Circulo)formas[j]).perimetro());
			}
			break;
		case "c":
			for (int j = 0; j < formas.length; j++) {
				if(formas[j] instanceof Quadrado)
					JOptionPane.showMessageDialog(null, "Área do quadrado: "+((Quadrado)formas[j]).area());
				else if(formas[j] instanceof Retangulo)
					JOptionPane.showMessageDialog(null, "Área do retângulo: "+((Retangulo)formas[j]).area());
				else
					JOptionPane.showMessageDialog(null, "Área do círculo: "+((Circulo)formas[j]).area());
			}
			break;
		default:
			JOptionPane.showMessageDialog(null, "Valor não reconhecido!");
		}
	}
}
