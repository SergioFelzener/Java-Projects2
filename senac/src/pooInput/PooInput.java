package pooInput;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PooInput {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		List<Letra> lista = new ArrayList<Letra>();
		Factory factory = new Factory();

		while (true) {
			System.out.print("insira o valor: ");
			int valor = entrada.nextInt();
			System.out.printf("Valor escolhido: %d \n", valor);
			Letra letra = factory.escolherClasse(valor);

			if (letra == null) {
				break;
			}
			lista.add(letra);
		}
		
		for(Letra item: lista) {
			System.out.println(item);
		}

		entrada.close();

	}

}
