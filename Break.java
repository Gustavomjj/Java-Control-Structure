package Controle;

public class Break {
	
	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
			
			if (i == 5) {
				break;					// Quando ele encontra o 5, ele ativa o BREAK. 
			}
			
			System.out.println(i);			
		}
		
		System.out.println("FIM!!");
	}

}

// O break é bom para quando temos uma lista de 1000 usuários, por exemplo, e quando acha o que está procurando, 
// quebra a repetição. 
