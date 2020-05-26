package gamerpg;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Play {

	public static void main(String[] args) {
		
		// Criando os Players
		String player1 = JOptionPane.showInputDialog("digite o nome do Player 1");
		String player2 = JOptionPane.showInputDialog("digite o nome do Player 2");

		FactoryCombatente fac = new FactoryCombatente();

		fac.createCards();

		Scanner entrada = new Scanner(System.in);

		Map<Integer, Combatente> deck1 = new HashMap<>();

		int cardsPlayer1 = 0;

		while (cardsPlayer1 < 5) {
			System.out.printf("Jogador %s escolha a " + (cardsPlayer1 + 1) + "˚ carta\n", player1);
			System.out.println("-------------------------------");
			
			fac.listar();
		

			System.out.println("-------------------------------");
			System.out.println("Digite o número da carta");
			int num = entrada.nextInt();
			System.out.println("-------------------------------");

			Combatente comb = fac.selectCombatente(num);
			deck1.put(cardsPlayer1, comb);
			cardsPlayer1++;

		}

		
		Map<Integer, Combatente> deck2 = new HashMap<>();
		
		int cardsPlayer2 = 0;

		while (cardsPlayer2 < 5) {
			System.out.printf("Jogador %s escolha a " + (cardsPlayer2 + 1) + "˚ carta\n", player2);
			System.out.println("-------------------------------");
			
			fac.listar();
		

			System.out.println("-------------------------------");
			System.out.println("Digite o número da carta");
			int num = entrada.nextInt();
			System.out.println("-------------------------------");

			Combatente comb = fac.selectCombatente(num);
			deck2.put(cardsPlayer2, comb);
			cardsPlayer2++;

		}
		
		System.out.printf("%s Selecione a carta para o combate\n", player1 );
		
		System.out.println(deck1.values());
		
		
		
		
		entrada.close();
		
		
		
//		System.out.println("-------------------------------");
//		System.out.printf("Deck %s", player1);
//		System.out.println(deck1.values());
//		System.out.println("-------------------------------");
//		System.out.printf("Deck %s", player2);
//		System.out.println(deck2.values());
//		
//		deck1.get(1).attackDamage();
//		deck1.get(1).attackDamage();
//		
//
//		System.out.println("-------------------------------");
//		System.out.printf("Deck %s", player1);
//		System.out.println(deck1.values());
//		System.out.println("-------------------------------");

	}

}

