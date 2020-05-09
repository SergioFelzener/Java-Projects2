package fundamentos.operadores;

public class DesafioOperadoresAritmeticos {
	
	public static void main(String[] args) {
		
		int a =  3 * 4 - 10;
		int b = (int)Math.pow(a, 3);
		double c = Math.pow(a, 3);
		
		System.out.println(b);
		System.out.println(c);
		
		
		int a1 = (6 * 3) + (6 * 2);
		int a2 = (int)Math.pow(a1, 2);
		int b1 = 3 * 2;
		int abResult = a2 / b1;
		System.out.println(a1);
		
		System.out.println(abResult);
		
		int c1 = 1 - 5;
		int c2 = 2 - 7; 
		int c3 = (c1 * c2) / 2;
		int c4 = (int)Math.pow(c3, 2);
		
		System.out.println(c4);
		
		int d1 = abResult - c4;
		int d2 = (int)Math.pow(d1, 3);
		
		int e1 = (int)Math.pow(10, 3);
		
		double resultado = (double) d2 / e1;
		
		System.out.println("resultado da expressão : " + resultado);
	
	}

}
