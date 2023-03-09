package Controle;

import java.util.Scanner;

public class WhileIndeterminado {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		//System.out.println("Digite o número para o contador: ");
		//int cont = entrada.nextInt();
		
		//int contador = 1; 
			
		//while (contador <= cont) {
		//	System.out.printf("i -> %d\n", contador);
		//	contador++;
		//}
		
		String saida = "";
				
		while (!saida.equalsIgnoreCase("sair"))  {  // necessário colocar ! antes do comparativo. 
		System.out.println("Digite uma frase: ");   // "enquanto não (!) ficar isso, faça aquilo"
		String frase = entrada.nextLine();
		System.out.println("Você disse:"+ frase);
		
		System.out.println("Se você deseja sair, digite 'Sair'");
		 saida = entrada.nextLine();	
		}
		
		
		entrada.close();
	}
}
