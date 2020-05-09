package fundamentos.operadores;

public class DesafioLogicos {
	
	public static void main(String[] args) {
		
		
		// minha resposta
		
		System.out.println("Minha solução do desafio:");
		boolean trabalho1 = false;
		boolean trabalho2 = false;
		
		String tv50 = "TV 50 polegadas";
		String tv32 ="TV 32 Polegadas";
		String sorvete = "Sorvete";
		
		if (trabalho1 && trabalho2) {
			System.out.printf("Comprei a %s e tomei %s", tv50, sorvete);
		}else if (trabalho1 || trabalho2){
			System.out.printf("Comprei a %s e tomei %s", tv32, sorvete);
		}else {
			System.out.println("Não compramos tv e nem fomos tomar sorvete");
		}
		
		//resposta do professor 
		
		System.out.println("\n\n");
		System.out.println("Solução do professor\n");
		
		boolean comprouTV50 = trabalho1 && trabalho2;
		boolean comprouTV32 = trabalho1 ^ trabalho2;
		boolean comprouSorvete = trabalho1 || trabalho2;
		boolean maisSaudavel = !comprouSorvete;
		
		// usando /" para incluir aspas duplas dentro do texto que é impresso no console
		
		System.out.println("Comprou TV 50\"?" + comprouTV50);
		System.out.println("Comprou TV 32\"?" + comprouTV32);
		System.out.println("Comprou Sorvete ?" + comprouSorvete);
		System.out.println("Mais Saudavel ?" + maisSaudavel);
		
		
		
	}

}
