package Controle;

import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double total = 0;
		double cont = 1;
		double saida = 0;
		
		
		
			while (saida != -1)  {
				System.out.printf("Digite a nota do aluno %.0f\n", cont);
				saida = entrada.nextInt();
					if (saida <= 10 && saida >= -1) {
						total += saida;
						cont++;		
					} else {
						System.out.println("Nota invalida!");
				}
			}
			
			cont = cont - 2;
			double media = total / cont;
			
			System.out.println();
			System.out.printf("O total de alunos foi de: %.0f\n"
					+ "A média da classe foi: %.2f\n", cont, media);
		
		
		entrada.close();
	}
}
