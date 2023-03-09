package Controle;

import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
			String saida = "";
		
			do {
				System.out.print("Digite alguma coisa: ");
				saida = entrada.nextLine();
											
			
			} while (!saida.equalsIgnoreCase("sair"));
			
			System.out.println("Chat finalizado!");
						
		
		
		entrada.close();
	}
}
