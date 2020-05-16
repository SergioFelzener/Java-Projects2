package desafioClassesVsMetodo;

public class Pessoa {
	
	String nome;
	double peso;
	
	Pessoa(){
		
	}
	
	Pessoa(String nome, double peso){
		this.nome = nome;
		this.peso = peso;
	}
	
	
	// minha resposta do desafio 
	double comer(double pesoComida){
		return peso + pesoComida;
		
	}
	
	// resposta do professor
	
	void comer2(Comida comida) {
		if (comida != null) {
			this.peso += comida.peso;
		}
	}
	
	String apresentarPessoa() {
		return String.format("Olá meu nome é %s meu peso antes de comer = %f\n", nome, peso);
	}

}
