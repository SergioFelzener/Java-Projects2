package controle;

public class WhileDeterminado {
	
	public static void main(String[] args) {
		
		int contador = 1;
		
		while(contador <= 10) {
			System.out.println("LooP While");
			contador++;
		}
		
		System.out.println("\n");
		
		int contador2 = 1;
		while(contador2 <= 10) {
			System.out.printf("contador = %d", contador2);
			contador2++;
		}
		System.out.println("\n");
		
		int contador3 = 1;
		while(contador3 <= 10) {
			System.out.printf("contador = %d\n", contador3);
			contador3 += 2;
		}
	}

}
