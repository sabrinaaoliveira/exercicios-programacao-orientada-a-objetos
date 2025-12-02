package empresa;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int palpite;
		int valorCorreto=10000;
		System.out.println("Digite seu palpite: ");
		palpite = teclado.nextInt();
		String msg;
		
		while(palpite != valorCorreto) {
			msg = palpite>valorCorreto?"Um pouco menos...":"Um pouco mais...";
			System.out.println(msg); //uso de operador ternário para substituir a estrutura de repetição if e else
			
			/*if(palpite>valorCorreto) {
				System.out.println("Um pouco menos...");
			}
			else {
				System.out.println("Um pouco mais...");
			}*/
			System.out.println("Digite outro palpite: ");
			palpite = teclado.nextInt();
		}

		System.out.println("Parabéns você acertou!!! ");
	
	}

}
