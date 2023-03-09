package Controle;

public class Continue {
	
	public static void main(String[] args) {
		
		// O "continue" serve para a repetição voltar para repetir sem dar continuação
		
		
		for (int i = 0; i < 10; i++) {
			if (i % 2 == 1) 
				continue;					// Aqui ele não vai imprimir o i quando o número for impar.
			System.out.println(i);			
		}
		
		for (int i = 0; i < 10; i++) {
			if (i == 5)						// Quando ele encontrar o número 5, ele vai ignorar o resto da repetição e continuar a repetição. 
				continue;
		System.out.println(i);
		}
		
	}
}
