package controle;

public class SwitchSemBreak {
	
	public static void main(String[] args) {
		
		
		String faixa = "preta";
		
		
		switch(faixa.toLowerCase()) {
		
		case "preta":
			System.out.println("Sei o Bassai-Dai ...");
		case "marrom":
			System.out.println("Sei o Tekki Shodan");
		case "roxa":
			System.out.println("Sei o Heian Godan");
		case "verde":
			System.out.println("Sei o Heian Yodan");
		case "laranja":
			System.out.println("Sei o Heian Sandan");
		case "vermelha":
			System.out.println("Sei o Heian Nidan");
		case "amarela":
			System.out.println("Sei o Heian Shodan.");
		case "branca":
			System.out.println("...Branca...");
			break;
		default:
			System.out.println("");
		}
		
		System.out.println("FIM !");
		
		int idade = 2;
		
		switch(idade) {
			case 3:
				System.out.println("Sabe Programar");
			case 2:
				System.out.println("Sabe Falar");
			case 1:
				System.out.println("Sabe Andar");
			case 0:
				System.out.println("Sabe Respirar");
		}
		
	}

}
