package Controle.exercicios;

import java.util.Scanner;

public class JogoDaAdivinhacao {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("-------------------");
		System.out.println("Jogo da adivinhação");
		System.out.println("-------------------");
		System.out.println("Digite um número para guardar: ");
		int n = entrada.nextInt();
		System.out.println("\033[H\033[2J");
		
		int cont = 1;
		
		repeticao: while (cont <= 10) {
			System.out.printf("Adivinhe o número [%d/10]: ", cont);
			int ad = entrada.nextInt();
			cont++;
				if (ad == n) {
					break repeticao;
				}
		}
		
		
		if (cont > 9) {
			System.out.println("Você perdeu!! :(");
		} else {
			System.out.println("Você acertou! Parabéns!! :D");
		}
			
		entrada.close();
		
	}
}
