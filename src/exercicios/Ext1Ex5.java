package exercicios;

import javax.swing.JOptionPane;
import funcoes.Divisao;
import funcoes.Media;
import funcoes.Multiplicacao;
import funcoes.RestoDivisao;
import funcoes.Soma;
import funcoes.Subtracao;

public class Ext1Ex5 {
	public static void main(String[] args) {
		float a, b;
		a = Float.parseFloat(JOptionPane.showInputDialog("Insira o primeiro número: "));
		b = Float.parseFloat(JOptionPane.showInputDialog("Insira o segundo número: "));
		
		String resp = JOptionPane.showInputDialog("Soma, Subtração, Multiplicação, Divisão, Resto divisão ou Média?");
		
		float result;
		if (resp != null) {
			switch (resp) {
				case  "Soma" :
					result = Soma.somar(a,b);
					System.out.println(result);
					break;
				
				case "Subtração":
					result = Subtracao.subtrair(a, b);
					System.out.println(result);
					break;
				
				case "Multiplicação":
					result = Multiplicacao.multiplicar(a, b);
					System.out.println(result);
					break;
				
				case "Divisão":
					result = Divisao.dividir(a, b);
					System.out.println(result);
					break;
				
				case "Resto divisão":
					result = RestoDivisao.restoDiv(a, b);
					System.out.println(result);
					break;
			
				case "Média":
					result = Media.media(a, b);
					System.out.println(result);
					break;
				default:
					System.out.println("A operação digitada não existe");
				
			}
		}else {
			System.out.println("Digite uma operação!");
		}
	}
}
