package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Dicionario {
	
	public static void main(String[] args) {
		
		Map<Integer, String> dicionario = new HashMap<>();
		
		dicionario.put(1, "Cebola");
		dicionario.put(2, "Batata");
		dicionario.put(3, "Arroz");
		
		System.out.println("Numero de posiçoes do ArrayMap: ");
		
		for(int chave: dicionario.keySet()) {
			System.out.println(chave);
		}
		
		System.out.println("Imprimindo indices e valores do array: ");
		
		for(Entry<Integer, String> registro: dicionario.entrySet()) {
			System.out.print(registro.getKey() + "->");
			System.out.println(registro.getValue());
			
		}
		
		String novoValor = "Tomate";
		
		System.out.printf("Alterando 1 elemento do ArrayMap .... " + dicionario.get(1) + " ... Trocando para %s\n", novoValor);
		dicionario.put(1, "Tomate");
		
		System.out.println("Reemprimindo array com alteração no 1 elemento : ");
		
		for(Entry<Integer, String> registro: dicionario.entrySet()) {
			System.out.print(registro.getKey() + "->");
			System.out.println(registro.getValue());
			
		}
		
	}

}
