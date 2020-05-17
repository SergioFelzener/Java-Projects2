package arrays;

import java.util.Scanner;

public class DesafioArray {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite quantas notas gostaria de calcular : ");
		int array = entrada.nextInt();
		double[] notas = new double [array];
		
		int posicao = 1;
		
		for (int i = 0; i < notas.length; i++) {
			
			System.out.printf("Digite a nota %d : ", posicao);
			Double nota = entrada.nextDouble();
			notas[i] = nota;
			posicao++;
			
		}
		
		entrada.close();
		
		double total = 0;
	
		for (double nota: notas) {
			total += nota;
			System.out.printf("Suas notas foram : %f\n", nota);
			//entrada.netxInt();	
		}
		
		System.out.printf("Total: %f pontos\n", total);
		
		double mediaFinal = (total / notas.length);

		System.out.println("Sua média final foi : " + mediaFinal + " pontos");
		
	}

}
