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
		a = Float.parseFloat(JOptionPane.showInputDialog("Insira o primeiro n�mero: "));
		b = Float.parseFloat(JOptionPane.showInputDialog("Insira o segundo n�mero: "));
		
		String resp = JOptionPane.showInputDialog("Soma, Subtra��o, Multiplica��o, Divis�o, Resto divis�o ou M�dia?");
		
		float result;
		if (resp != null) {
			switch (resp) {
				case  "Soma" :
					result = Soma.somar(a,b);
					System.out.println(result);
					break;
				
				case "Subtra��o":
					result = Subtracao.subtrair(a, b);
					System.out.println(result);
					break;
				
				case "Multiplica��o":
					result = Multiplicacao.multiplicar(a, b);
					System.out.println(result);
					break;
				
				case "Divis�o":
					result = Divisao.dividir(a, b);
					System.out.println(result);
					break;
				
				case "Resto divis�o":
					result = RestoDivisao.restoDiv(a, b);
					System.out.println(result);
					break;
			
				case "M�dia":
					result = Media.media(a, b);
					System.out.println(result);
					break;
				default:
					System.out.println("A opera��o digitada n�o existe");
				
			}
		}else {
			System.out.println("Digite uma opera��o!");
		}
	}
}
