package Controle;

public class SwitchSemBreak {
	public static void main(String[] args) {
		
	
		// É utilizado pra atrelar uma variável a uma setença sem ser boolean. 
		// Mostra todos os dados de cima para baixo até o break (quebra)
		// Neste caso não utilizamos o break.
		
		String faixa = "branca"; 
		
		switch (faixa) {
		case ("preta"):
			System.out.println("Sei o Bassai-Dai...");
		case ("marrom"):
			System.out.println("Sei o Tekki Shodan");
		case ("roxa"):
			System.out.println("Sei o Heian Godan");
		case ("laranja"):
			System.out.println("Sei o Heian Yodan");
		case ("verde"):
			System.out.println("Sei o Heian Sandan");
		case ("vermelha"):
			System.out.println("Sei o Heian Nidan");
		case ("amarela"):
			System.out.println("Sei o Heian Shodan");
		default:
			System.out.println("Não sei de nada");
		}

	}

}
