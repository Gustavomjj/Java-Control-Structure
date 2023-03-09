package Controle;

import java.util.Scanner;

public class IfElseIf {
	public static void main(String[] args) {
		 Scanner entrada = new Scanner(System.in);
		 
		 System.out.println("Digite a nota: ");
		 double nota = entrada.nextDouble();
		 
		 if (nota > 10 || nota < 0 ) {
			 System.out.println("Nota invalida!");		 
		 } else if (nota > 9){
			 System.out.println("Conceito A+");			 
		 } else if (nota > 8){
			 System.out.println("Conceito A-");			 
		 } else if (nota > 7){
			 System.out.println("Conceito B+");			 
		 } else if (nota > 6){
			 System.out.println("Conceito B-");			 
		 } else if (nota > 5){
			 System.out.println("Conceito C+");			 
		 } else if (nota > 4){
			 System.out.println("Conceito C-");			 
		 } else if (nota > 3){
			 System.out.println("Conceito D+");			 
		 } else if (nota > 2){
			 System.out.println("Conceito D-");			 
		 } else if (nota > 1){
			 System.out.println("Conceito E+");			 
		 } else if (nota > 0){
			 System.out.println("Conceito E-");			 
		 } else if (nota == 0){
			 System.out.println("Conceito F");			 
		 }
		 
		 entrada.close();
		 
	}
}
