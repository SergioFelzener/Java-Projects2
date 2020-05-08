package fundamentos;

import java.util.Scanner;

public class Console {
	
	public static void main(String[] args) {
		
		//imprimindo no console na mesma linha 
		System.out.print("Bom");
		System.out.print(" dia\n");//quebrando linha 
		
		System.out.println("Bom");// ln quebra linha 
		System.out.println("dia");
		
		System.out.printf("Megasena : %d %d %d %d %d %d %n",
				1, 2, 3, 4, 5, 6);
		
		System.out.printf("Salário: %.1f%n",
				1234.5678);
		
		// %s = String 
		// %d = Valores Inteiros
		// %f = Valores Flutuantes .1 .2 .3 etc
		// %n = quebra linha 
		
		
		//pegando dados do usuario via console System.in entrada de informacao no teclado
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite seu nome : ");
		String nome = entrada.nextLine();
		System.out.print("Digite seu Sobrenome : ");
		String sobrenome = entrada.nextLine();
		System.out.print("Digite sua idade : ");
		int idade = entrada.nextInt();
		System.out.println("\n\nSeu nome é : " + nome + "\nSeu sobrenome é : " + sobrenome + "\nSua Idade é : " + idade + "\n\n");
		
		System.out.printf("%s %s tem %d anos.%n", nome, sobrenome, idade);
		
		
		
		entrada.close();
		
	
		
		
	}

}
