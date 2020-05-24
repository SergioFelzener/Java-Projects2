package oo.heranca.desafio;

public class Civic extends Carro {
	
	double velocidadeMaxima = 180;
	
	void acelerar () {
		
		
		if (velocidadeAtual <= velocidadeMaxima) {
			velocidadeAtual += 10;	
		} else {
			velocidadeAtual = velocidadeMaxima;	
		}
		
	}
	
	void frear () {
		
		if(velocidadeAtual > 0) {
			velocidadeAtual -= 10;		
		}else {
			velocidadeAtual = velocidadeMinima;
		
		}
	}
	
	

}
