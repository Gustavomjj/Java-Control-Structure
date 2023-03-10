package Controle.exercicios;

import java.util.Scanner;

public class CalculoDeNotas {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.println("--------------------");
		System.out.println("CALCULADORA DE NOTAS");
		System.out.println("--------------------");
		System.out.println();
		System.out.println("Digite a primeira nota");
		double n1 = entrada.nextDouble();
		System.out.println("Digite a segunda nota: ");
		double n2 = entrada.nextDouble();
		
		double media = (n1+n2)/2;
		
		if (media >=0 && media <= 10)
			if (media >=7) {
				System.out.printf("Sua média é: %.1f e você foi aprovado. Parabéns!!", media);
			} else	if (media <7 && media >5) {
				System.out.printf("Sua média é: %.1f e você está em recuperação.", media);
			} else	if (media <5 && media >=0) {
				System.out.printf("Sua média é: %.1f e você foi reprovado.", media);				
			}
		entrada.close();
	}
	
}
