package oo.heranca.desafio;

public class Ferrari extends Carro {
	
	public double velocidadeMaxima = 240;
	
	
	public void acelerar () {
		
		
		if (velocidadeAtual <= velocidadeMaxima) {
			velocidadeAtual += 15;	
		} else {
			velocidadeAtual = velocidadeMaxima;	
		}
		
	}
	
	public void frear () {
		
		if(velocidadeAtual > 0) {
			velocidadeAtual -= 15;		
		}else {
			velocidadeAtual = velocidadeMinima;
		
		}
	}
	


}