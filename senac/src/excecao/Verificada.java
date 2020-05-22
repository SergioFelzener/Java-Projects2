package excecao;

import java.util.Scanner;

public class Verificada {
	public static void main(String[] args) {
		Factory factory = new Factory();

		Scanner entrada = new Scanner(System.in);
		System.out.print("Entre com um valor: ");

		try {
			System.out.println("Resultado: " + factory.select(entrada.nextLine()));
		} catch (ValorNExisteException e) {
			System.out.println("Entrei nesse erro");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Entrei nesse segundo erro");
			e.printStackTrace();
		}
		
		entrada.close();

	}

}
