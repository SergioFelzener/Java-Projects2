package classe;

public class Produto {
	
	String nome;
	double preco;
	static double desconto = 0.25;
	
	//varios construtores com o mesmo nome mas nao tema mesma assinatura,
	//lembrabdo se colocar void na frente do construtor vira um método.
	
	Produto() {

	}

	Produto(String nomeInicial){
		nome = nomeInicial;	
	}
	
	Produto(String nomeInicial, double precoInicial){
		nome = nomeInicial;	
		preco = precoInicial;	
	}
	
	//Produto(String nomeInicial, double precoInicial, double descontoInicial){
	//	nome = nomeInicial;	
	//	preco = precoInicial;
	//	desconto = descontoInicial;
	//}
	
	
	double precoComDesconto () {
		return preco * (1 - desconto);
	}
	double precoComDesconto (double descontoDoGerente) {
		return preco * (1 - (desconto + descontoDoGerente));
	}

}
