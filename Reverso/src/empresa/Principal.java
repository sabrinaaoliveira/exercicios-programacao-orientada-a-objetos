package empresa;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
	
		ArrayList<String> listaNomes = new ArrayList<String>();
		System.out.println("Digite a quantidade de nomes: ");
		int qtd = teclado.nextInt();
		String nome;
		for(int i=0;i<qtd;i++) {
			nome = teclado.next();
			listaNomes.add(nome);
		}
		
		for(int i=listaNomes.size()-1; i>=0; i--){
			System.out.println(listaNomes.get(i));
		}
		
	} 
 
}
	

