package oo.heranca.desafio;

public class TestDrive {

	public static void main(String[] args) {

		Carro c1 = new Ferrari();

		System.out.println("Teste Drive de Ferrari Acelerando e Freando");
		System.out.println("Velocidade Maxima 240km/h");
		System.out.println("Velocidade Mínima 0km/h");
		System.out.println("___________________________________________");

		double velocidade = c1.velocidadeAtual;

		System.out.printf("\nSua velocidade : %.1fkm/h\n", velocidade);

		c1.acelerar();

		System.out.printf("Velocidade %.1fkm/h\n", c1.velocidadeAtual);

		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();

		System.out.printf("Velocidade %.1fkm/h", c1.velocidadeAtual);

		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();

		System.out.printf("\nVelocidade %.1fkm/h", c1.velocidadeAtual);

		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();

		System.out.printf("Velocidade %.1fkm/h\n", c1.velocidadeAtual);
		System.out.println("___________________________________________");
		System.out.println();

		Carro c2 = new Civic();

		System.out.println("Teste Drive de Civic Acelerando e Freando");
		System.out.println("Velocidade Maxima 180km/h");
		System.out.println("Velocidade Mínima 0km/h");
		System.out.println("___________________________________________");
		System.out.println();
		
		System.out.printf("Velocidade %.1fkm/h\n", c2.velocidadeAtual);	
		
		c2.acelerar();
		
		System.out.printf("Velocidade %.1fkm/h\n", c2.velocidadeAtual);	
		
		c2.acelerar();
		c2.acelerar();
		c2.acelerar();
		c2.acelerar();
		c2.acelerar();
		c2.acelerar();
		c2.acelerar();
		c2.acelerar();
		c2.acelerar();
		
		System.out.printf("Velocidade %.1fkm/h\n", c2.velocidadeAtual);	
		
		c2.acelerar();
		
		System.out.printf("Velocidade %.1fkm/h\n", c2.velocidadeAtual);	
		
		c2.acelerar();
		c2.acelerar();
		c2.acelerar();
		c2.acelerar();
		c2.acelerar();
		c2.acelerar();
		c2.acelerar();
		c2.acelerar();
		c2.acelerar();
		
		System.out.printf("Velocidade %.1fkm/h\n", c2.velocidadeAtual);	
		
		c2.frear();
		System.out.printf("Velocidade %.1fkm/h\n", c2.velocidadeAtual);	
		
		c2.frear();
		c2.frear();
		c2.frear();
		c2.frear();
		c2.frear();
		c2.frear();
		c2.frear();
		c2.frear();
		c2.frear();
		c2.frear();
		c2.frear();
		c2.frear();
		c2.frear();
		c2.frear();
		c2.frear();
		c2.frear();
		c2.frear();
		c2.frear();
		c2.frear();
		c2.frear();
		c2.frear();
		c2.frear();
		c2.frear();
		c2.frear();
		c2.frear();
		c2.frear();
		
		System.out.printf("Velocidade %.1fkm/h\n", c2.velocidadeAtual);	
		
		Carro c3 = new Carro();
		
		c3.acelerar();
		System.out.println(c3.velocidadeAtual);
	}

}
