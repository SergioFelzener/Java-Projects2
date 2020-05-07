package fundamentos;

public class Inferencia {
	
	public static void main(String[] args) {
		
		double a = 4.5;
		System.out.println(a);
		
		// Java infere o tipo da variavel pelo valor colocado
		//Caso abaixo java vai inferir que é uma variável tipo Number
		
		var b = 4.5;
		System.out.println(b);
		
		//Caso abaixo Java vai inferir e entender que a var e do tipo string
		
		var c = "texto";
		System.out.println(c);
		
		c = "Outro texto";
		System.out.println(c);
		
		// como java ja inferiu no tipo da variavel nao é possivel passar para number da erro 
		
		// c = 4;
		// System.out.println(c);
		
		double d; // variavel declarada
		d = 123.65; // variavel inicializada
		System.out.println(d); // usando var para impressao no console
		
		//nao pode usar var e inicializar a var em outra linha tem que inicialzar na mesma
		
		//var e;
		//e = 123.45;
		
		var e = 125.45;
		System.out.println(e);
		
		var f = 12; // valor inteiro 
		
		// f = 12.01; // valor inteiro nao recebe casas decimais 
		System.out.println(f);
		
		
		//JAVA tipos fortes linguagem fortemente tipada
	}

}
