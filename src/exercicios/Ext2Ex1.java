package exercicios;

import java.text.DecimalFormat;

import Ext2Ex1.ImovelNovo;
import Ext2Ex1.ImovelVelho;

public class Ext2Ex1 {
	public static void main(String[] args) {
		 ImovelNovo novo = new ImovelNovo("Rua tal",89955.99);
		 
		 DecimalFormat df = new DecimalFormat();
	     df.applyPattern("R$ #,##0.00");
	      
		 System.out.println("Valor adicional: "+df.format(novo.getPrecoAd()));
		 
		 ImovelVelho velho = new ImovelVelho("Bairro sei la",77443.45);
		 System.out.println("Valor descontado: "+df.format(velho.getPrecoDesc()));
	}
}
