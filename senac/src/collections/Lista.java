package collections;

import java.util.ArrayList;
import java.util.List;

public class Lista {
	
	public static void main(String[] args) {
		
		List<Combatente> lista = new ArrayList<>();
		
		// criando combatente antes de adicionar a lista(ArrayList)
		Combatente c1 = new Combatente("Dragão");
		// Adicionando a Lista 1 elemento indice 0
		lista.add(c1);
		
		// Adicionando e criando juntos 2 elemento indice 1 
		lista.add(new Combatente("Morcego"));
		lista.add(new Combatente("Orc"));
		
		for(Combatente c : lista) { 
			System.out.println(c);
		}
		
		int totalLista = lista.size();
		
		System.out.printf("A lista tem %d combatentes\n", totalLista);
		
		System.out.println("O segundo elemento da lista é : " + lista.get(1));
		
		System.out.print("Removendo 2 elemento da lista ...\n");
		
		lista.remove(1);
		
		totalLista = lista.size();
		
		System.out.println("Lista Atualizada \n" + lista);
		System.out.printf("A lista tem %d combatentes\n", totalLista);
		
		c1.nome = "Monstro do Pantano";
		
		System.out.println(lista);
		
		System.out.println("Primeiro elemento é: " + lista.get(0));
			
		
	}

}
