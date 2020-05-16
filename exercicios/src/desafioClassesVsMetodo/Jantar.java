package desafioClassesVsMetodo;

public class Jantar {
	
	public static void main(String[] args) {
		
		Comida c1 = new Comida();
		c1.nome = "Arroz";
		c1.peso = 0.250;
		
		Comida c2 = new Comida("Farofa", 0.050);
		
		Pessoa p1 = new Pessoa();
		p1.nome = "Joao";
		p1.peso = 90;
		
		Pessoa p2 = new Pessoa("Mario", 67);

		double pesoComida = c1.peso + c2.peso;
		
		System.out.println(c1.apresentarComida());
		System.out.println(c2.apresentarComida());
		
		System.out.printf("Peso Total da comida = %.3fKg\n", pesoComida);
		
		double pesoFinal = p1.comer(pesoComida);
		
		System.out.printf(p1.apresentarPessoa());
		System.out.printf("%s peso depois de comer = %f\n",p1.nome, pesoFinal );
		
		double pesoFinal2 = p2.comer(pesoComida);
		
		System.out.printf(p2.apresentarPessoa());
		System.out.printf("%s peso depois de comer = %f",p2.nome, pesoFinal2 );
		
		
	}

}
