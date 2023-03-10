package Controle.exercicios;

import java.util.Scanner;

public class NumeroPrimo {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("-----------------------------");
		System.out.println("Verificador de números primos");
		System.out.println("-----------------------------");
		System.out.println();
		System.out.println("Digite um número: ");
		int n = entrada.nextInt();
		int contDiv = 0;
		
		for (int cont = 1; cont <= 1000; cont++) {
			if (n % cont == 0) {
				contDiv++;
			}
		}
			
		if (contDiv > 2) {
			System.out.println("Este número não é um número primo.");
		} else {
			System.out.println("Este número é um número primo.");
		}
		
		entrada.close();
	}

}
