package exercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import Ext1Ex10.CD;
import Ext1Ex10.DVD;
import Ext1Ex10.Livro;
import Ext1Ex10.Produto;

public class Ext1Ex10Loja {
	public static void main(String[] args) {
		List<Produto> produtos = new ArrayList<Produto>();	
		
		produtos.add(new Livro("O andar do bêbado",65.99,"Leonard Mlodinow"));
		produtos.add(new CD("Led Zeppelin-Led Zepplin IV",89.99,7));
		produtos.add(new DVD("Pi",15.0,2.3));
		produtos.add(new Livro("Homo Deus",75.99,"Yuval Noah Harari"));
		produtos.add(new CD("Black Sabbath-Master of Reality",79.99,8));
		
		for (Produto produto : produtos) {
			System.out.println(produto);
		}
		
		//EXERCÍCIO 11
		Collections.sort(produtos);
		System.out.println("--------------------------------------------------\n Ordenado por nome ou preço: ");
		for (Produto produto : produtos) {
			System.out.println(produto);
		}
	}
}
