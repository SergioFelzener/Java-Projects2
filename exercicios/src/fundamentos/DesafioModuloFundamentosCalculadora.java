package fundamentos;

import java.util.Scanner;

public class DesafioModuloFundamentosCalculadora {
	
	public static void main(String[] args) {
		
		// Minha solução para o desafio nao era para usar estruturas de controle mas nao tive como fazer sem vamos ver a resposta do professor.
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um número : ");
		String num1 = entrada.nextLine();
		System.out.println("Digite um número : ");
		String num2 = entrada.nextLine();
		System.out.println("Digite a operação desejada + - * / : ");
		String operacao = entrada.nextLine();
		
		entrada.close();
		
		double valor1 = Double.parseDouble(num1);
		double valor2 = Double.parseDouble(num2);
		
		
		if (operacao.equals("+")){
			System.out.println("Soma dos valores : " + (valor1 + valor2));
		}else if (operacao.equals("-")){
			System.out.println("Subtração dos valores : " + (valor1 - valor2));
		}else if (operacao.equals("*")) {
			System.out.println("Multiplicação dos valores : " + (valor1 * valor2));
		}else if (operacao.equals("/")) {
			System.out.println("Divisão dos valores é : " + (valor1 / valor2));
		}else if (operacao.equals("%")) {
			System.out.println("Módulo dos valores é : " + (valor1 % valor2));
		}else {
			System.out.println("Operação não realizada, método não confere com : + / - / * / / / % .");
		}		
		
	}

}
