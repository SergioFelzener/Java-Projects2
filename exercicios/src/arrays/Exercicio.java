package arrays;

import java.util.Arrays;

public class Exercicio {
	
	public static void main(String[] args) {
		
		double[] notasAlunoA = new double [4];
		System.out.println(Arrays.toString(notasAlunoA));
		
		notasAlunoA[0] = 7.9;
		notasAlunoA[1] = 8;
		notasAlunoA[2] = 6.7;
		notasAlunoA[3] = 9.7;
		
		// Imprimindo Array usando util.Arrays.toString
		System.out.println(Arrays.toString(notasAlunoA));
		//buscando o primeiro indice do array
		System.out.println("Primeira Posiçao do array ( refere-se a 1 nota do aluno ): "+ notasAlunoA[0]);
		//buscando a ultima posição do array
		System.out.printf("Ultima Posição : %f \n", notasAlunoA[notasAlunoA.length -1]);
		
		
		
		//Tambem percorre array porem estou somando os double (posicoes do array)
		// na variavel tipo double nome total.
		double totalAlunoA = 0;
		for (int i = 0; i < notasAlunoA.length ; i++) {
			totalAlunoA += notasAlunoA[i];
			System.out.println(notasAlunoA[i]);
		}
		
		System.out.printf("Media do aluno A = %f\n", totalAlunoA / notasAlunoA.length);
		
		final double notaArmazenada = 6.0;
		double[] notasAlunoB = {6.9, 8.9, notaArmazenada, 10 };
		
		double totalAlunoB = 0;
		
		for (int i = 0; i < notasAlunoB.length; i++) {
			totalAlunoB += notasAlunoB[i];
			System.out.println(notasAlunoB[i]);	
		}
		
		double mediaAlunoB = (totalAlunoB / 4);
		
		System.out.println("Média aluno B = " + mediaAlunoB);
		
	}

}
