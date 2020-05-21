package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	
	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		
		//Offer e Add -> Adicionam elementos na fila 
		//Diferença comportamento quando a fila esta cheia;
		
		fila.add("Ana"); // retorna false
		fila.offer("Bia"); // lan
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.offer("Gui");
		
		// Peek e Element -> obtem proximo da fila sem remover
		//
		// comportamento de peek e element se comportam de formas diferentes conforme a fila vazia 
		System.out.println(fila.peek());
		System.out.println(fila.peek());
		System.out.println(fila.element());
		System.out.println(fila.element());
		
		
		
		
		System.out.println(fila.poll()); // retorna falso mesmo se a fila esta vazia 
		System.out.println(fila.remove()); // caso fila esteja vazia da um erro 
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		
//		fila.size();
//		fila.clear();
//		fila.isEmpty();
//		fila.contains("!");
		
		
	}

}
