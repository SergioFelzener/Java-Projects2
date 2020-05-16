package classe;

public class ProdutoTeste {
	
	public static void main(String[] args) {
		
		Produto p1 = new Produto("Notebook");
		// p1.nome = "Notebook";
		p1.preco = 100.00;
		//p1.desconto = 0.25;
		
		var p2 = new Produto();
		p2.nome = "Caneta Preta";
		p2.preco = 5.00;
		//p2.desconto = 0.29;
		
		//mudando desconto de produto na classe para 50%
		Produto.desconto = 0.4;
		
		System.out.println(p1.nome);
		System.out.println(p2.nome);
		
		//adicionando desconto maior 
		
		double precoFinal1 = p1.precoComDesconto(0.1);
		double precoFinal2 = p2.precoComDesconto(0.1);
		
		double precoTotal = precoFinal1 + precoFinal2;
		double media = (precoTotal / 2);
		
		
		System.out.printf("Preço do %s é 	= R$%.2f.\n", p1.nome, precoFinal1);
		System.out.printf("Preço da %s é = R$%.2f.\n", p2.nome, precoFinal2);
		
		
		System.out.printf("Preço Total       	= R$%.2f.\n", precoTotal);
		System.out.printf("Media do carrinho 	= R$%.2f.\n", media);
		
	}

}
