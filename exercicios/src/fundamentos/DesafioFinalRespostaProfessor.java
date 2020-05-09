package fundamentos;

import java.util.Scanner;

public class DesafioFinalRespostaProfessor {

	public static void main(String[] args) {
		
		Scanner entrada2 = new Scanner(System.in);

		System.out.print("Informe o número: ");
		double numero1 = entrada2.nextDouble();
		System.out.print("Informe o número: ");
		double numero2 = entrada2.nextDouble();
		System.out.print("Informe a operação: ");
		String op = entrada2.next();

		entrada2.close();
		
		//Logica sem estruturas de controle apenas usando operadores ternarios:
		double resultado = "+".equals(op) ? numero1 + numero2 : 0;
		resultado = "-".equals(op) ? numero1 - numero2 : resultado;
		resultado = "*".equals(op) ? numero1 * numero2 : resultado;
		resultado = "/".equals(op) ? numero1 / numero2 : resultado;
		resultado = "%".equals(op) ? numero1 % numero2 : resultado;
		

		System.out.printf("%.2f %s %.2f = %.2f ", numero1, op, numero2, resultado);

	}

}
