package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite seu 1 Salário : ");
		String salario1 = entrada.nextLine().replace(",", ".");
		System.out.print("Digite seu 2 Salário : ");
		String salario2 = entrada.nextLine().replace(",", ".");;
		System.out.print("Digite seu 3 Salário : ");
		String salario3 = entrada.nextLine().replace(",", ".");;
		
		entrada.close();
		
		Double sal1 = Double.parseDouble(salario1);
		Double sal2 = Double.parseDouble(salario2);
		Double sal3 = Double.parseDouble(salario3);
		
		double soma = (sal1 + sal2 + sal3);
		
		double mediaSalario = soma / 3;
		
		
		System.out.printf("Sua media de salario é : %.2f", mediaSalario);
		
		
		
	}

}
