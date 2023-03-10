package Controle.exercicios;

import java.util.Scanner;

public class Soletrando {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("----------");
		System.out.println("SOLETRANDO");
		System.out.println("----------");
		System.out.println();
		System.out.println("Digite uma palavra: ");
		String palavra = entrada.next();
		
		int tot = (palavra.length());
		int cont = 0;
		
		while (cont < tot) {
			System.out.println(palavra.charAt(cont));
			cont++;
		}
		
		
		entrada.close();
	}
}
