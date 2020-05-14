
/*
 * Criar um programa que receba um número e verifique se ele está
 * entre 0 e 10 e é par;
 * 
 */


package exerciciosEstruturaDeControle;

import java.util.Scanner;

public class Exercicio1 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Digite um numero entre 0-10 : ");
		int numero = entrada.nextInt();
		
		if(numero % 2 == 0 && (numero >=0 && numero <=10)) { 
			System.out.println("seu numero é Par e esta dentre 0-10");
		}else if (numero % 2 == 1 && (numero >=0 && numero <=10)) {
			System.out.println("Numero Impar, dentro do intervalo 0-10");
		}else {
			System.out.println("Número não calculado, fora do intevalo 0-10");
		}
		
		entrada.close();
		
		System.out.printf("Seu numero é: %d", numero);
		
	}
	
	

}
