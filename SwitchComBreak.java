package Controle;

import java.util.Scanner;

public class SwitchComBreak {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a nota: ");
		int nota = entrada.nextInt(); 
			
		entrada.close();		
		
		switch (nota) {
		case 10:
			System.out.println("Conceito A+");
			break;
		case 9:
			System.out.println("Conceito A-");
			break;
		case 8: 
			System.out.println("Conceito B+");
			break;
		case 7:
			System.out.println("Conceito B-");
			break;
		case 6:
			System.out.println("Conceito C+");
			break;
		case 5:
			System.out.println("Conceito C-");
			break;
		case 4:
			System.out.println("Conceito D+");
			break;
		case 3:
			System.out.println("Conceito D-");
			break;
		case 2:
			System.out.println("Conceito E+");
			break;
		case 1:
			System.out.println("Conceito E-");
			break;
		case 0:
			System.out.println("Conceito F");
			break;
		default: 
			System.out.println("Nota Invalida!");
	
			
			// Pode colocar o case em cima de case. Por ex: 
			// Case 5: Case 4: Case 3:
		}
	}

}
