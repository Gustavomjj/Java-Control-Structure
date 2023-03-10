package Controle.exercicios;

import java.util.Scanner;

public class SomaPositiva {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.println("--------------------------");
		System.out.println("Soma de números positivos:");
		System.out.println("--------------------------");
		System.out.println();
		
		int n = 0;
		int soma = 0;
		
		while (n >= 0) {
		System.out.println("Insira um número: ");
		n = entrada.nextInt();
			if (n >= 0) {
				soma += n;
			} 
		System.out.println("A soma é: " + soma);
		}
		
		entrada.close();
	}

}
