package exercicios;

import java.time.LocalDate;
import java.time.LocalTime;

public class Ext1Ex4 {
	public static void main(String[] args) {
		String nome = System.getProperty("user.name");
		LocalTime h = LocalTime.now();
		Integer hora = Integer.parseInt(h);
			System.out.println(hora + "-Bom dia "+nome);
	}
}
