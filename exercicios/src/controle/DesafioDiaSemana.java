package controle;

import java.util.Scanner;

public class DesafioDiaSemana {
	
	//informar o dia da semana e retornar o valor
	//varias formas de ter o mesmo resultado.
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um dia da semana: ");
		
		String dia = entrada.next();
		
		dia = dia.toLowerCase();
		
		if (dia.equals("domingo")) {
			System.out.println(1);
		}else if (dia.equals("terça") || (dia.equals("terca"))) {
			System.out.println("2");
		}else if ("quarta".equals(dia)) {
			System.out.println("3");
		}else if (dia.contentEquals("quarta")) {
			System.out.println(4);
		}else if (dia.equals("quinta")) {
			System.out.println("5");
		}else if (dia.equals("sexta")) {
			System.out.println(6);
		}else if (dia.equals("sabado") || ("sábado".contentEquals(dia))) {
			System.out.println("Sabadão");
		}else {
			System.out.println("Dia da Semana Invalido");
		}
		entrada.close();
		
		
	}

}
