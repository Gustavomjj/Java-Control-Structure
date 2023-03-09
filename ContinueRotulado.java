package Controle;

public class ContinueRotulado {

	public static void main(String[] args) {
		
		externo: for (int i = 0; i < 5; i++) {			// Pode rotular o for para utilizar no continue
			for (int j = 0; j < 3; j++) {
				if (i == 2) {
					continue externo;						// Continue rotulado.
				}
			System.out.printf("[%d %d]", i, j);
			}
		System.out.println();
		}
	System.out.println("Fim!!");
	}
}