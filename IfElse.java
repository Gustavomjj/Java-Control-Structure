 package Controle;

import java.util.Scanner;

public class IfElse {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o número: ");
		String valor = entrada.next();
		
		int num = Integer.parseInt(valor);
		
		if (num % 2 == 0) {
			System.out.println("O número é par!");
		} else {
			System.out.println("O número é impar!");
		}
		
		entrada.close();
	}
}
