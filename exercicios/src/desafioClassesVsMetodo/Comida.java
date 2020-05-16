package desafioClassesVsMetodo;

public class Comida {
	
	String nome;
	double peso;
	
	Comida(){
		
	}
	
	Comida(String nome, double peso){
		this.nome = nome;
		this.peso = peso;
	}
	
	String apresentarComida() {
		return String.format("Comida - %s peso %.3fg", nome, peso);
	}
	

}
