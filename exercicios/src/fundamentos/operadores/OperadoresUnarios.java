package fundamentos.operadores;

public class OperadoresUnarios {
	
	public static void main(String[] args) {
		
		int a = 1;
		int b = 2;
		
		// forma posfixada
		
		a++; // a = a + 1;
		a--; // a = a - 1;
		
		
		// forma prefixada
		
		++b;
		--b;
		
		System.out.println(a);
		System.out.println(b);
	
		System.out.println("Mini Desafio");
		System.out.println(++a == b--);
		System.out.println(a == b);
		System.out.println(a);
		System.out.println(b);
		
		
		
	}

}
