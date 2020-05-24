package oo.heranca.teste;

import oo.heranca.desafio.professor.Carro;
import oo.heranca.desafio.professor.Civic;
import oo.heranca.desafio.professor.Ferrari;

public class CarroTeste {
	
	public static void main(String[] args) {
		
		
		Carro c = new Civic();
		
		c.acelerar();
		System.out.println(c);
		c.acelerar();
		System.out.println(c);
		c.acelerar();
		System.out.println(c);
		c.acelerar();
		System.out.println(c);
		
		
		Ferrari c2 = new Ferrari(280);
		
		c2.ligarTurbo();
		
		c2.acelerar();
		System.out.println(c2);
		c2.acelerar();
		System.out.println(c2);
		c2.acelerar();
		System.out.println(c2);
		c2.acelerar();
		System.out.println(c2);
		
		
	}
	
	

}
