package exercicios;

import java.time.LocalTime;

public class Ext1Ex4 {
	public static void main(String[] args) {
		String nome = System.getProperty("user.name");
		LocalTime h = LocalTime.now();
		if(h.getHour() <12)
			System.out.println(h + "-Bom dia "+nome);
		if(h.getHour() >= 12 && h.getHour() <18)
			System.out.println(h + "-Boa tarde "+nome);
		if(h.getHour() >=18)
			System.out.println(h + "-Boa noite "+nome);
	}
}
