package Controle.exercicios;

import java.util.Scanner;

public class NumeroEhPar {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um número de 0 á 10: ");
		int valor = entrada.nextInt();
		
		if (valor <= 10 && valor >=0) {
			if (valor % 2 == 0) {
				System.out.printf("O número %d é par.", valor);
			} else {
				System.out.printf("O número %d é impar.", valor);
			}
		}

		entrada.close();
	}

}
