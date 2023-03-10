package Controle.exercicios;

import java.util.Scanner;

public class NumeroPrimoComSwitch {

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
		
		switch (contDiv) {
		case 2:
			System.out.println("Este é um número primo.");
		break;
		default:
			System.out.println("Este não é um número primo.");
		}

		entrada.close();
	}
}
