package oo.heranca.desafio;

public class Carro {
	
	Carro(){
		
	}
	
	Carro(String nome){
		this.nome = nome;
	}
	
	
	double velocidadeMinima = 0;
	double velocidadeAtual = 0;
	String nome;
	
	
	void acelerar () {
		velocidadeAtual += 5;	
	}
	
	void frear () {
		velocidadeAtual -= 5;
	}
	
	

}
