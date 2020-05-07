package fundamentos;

public class Temperatura {
	
	public static void main(String[] args) {
		
		// (F - 32) x 5/9 = C
		
		// USAR EM CAIXA ALTA toda constante sabendo-se que ela nao muda.
		
		final double SUBTRAIFAHRENHEIT = 32;
		final double MULTIPLICAFAHRENHEIT = 5.0 / 9.0;
		
		double fahrenheit = 86;
		double celsius = 0;
		
		celsius = (fahrenheit - SUBTRAIFAHRENHEIT) * MULTIPLICAFAHRENHEIT;
		
		// colocar ˚ -> usando alt+K no mac.
		System.out.println("Temperatura em graus Celsius = " + celsius + "˚C.");
		
		fahrenheit = 150;
		celsius = (fahrenheit - SUBTRAIFAHRENHEIT) * MULTIPLICAFAHRENHEIT;
		
		
		System.out.println("Temperatura em graus Celsius = " + celsius + "˚C.");
		
		
		
	}

}
