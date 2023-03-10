package Controle.exercicios;

import java.util.Scanner;

public class NumeroMaior {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		
		System.out.println("------------");
		System.out.println("Número maior");
		System.out.println("------------");
		
		
		int maior = 0;
		int n = 0;
		
		for (int i = 1; i < 10; i++) {
			System.out.printf("Digite %do número: ", i);
			n = entrada.nextInt();		
			if	(n > maior) {
				maior = n;
			}			
		}
 		
		System.out.println("O número maior foi: " + maior);
		
		entrada.close();
	}

}
