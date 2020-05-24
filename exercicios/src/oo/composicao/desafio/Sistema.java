package oo.composicao.desafio;

public class Sistema {
	
	public static void main(String[] args) {
		
		Cliente c1 = new Cliente("Joao");
		Cliente c2 = new Cliente("Maria");
		Cliente c3 = new Cliente("Jaime");
	
		
		Compra compra1 = new Compra(c1.nome);
		compra1.adicionarItem("Caneta", 9.67, 100);
		compra1.adicionarItem(new Produto("NotBook", 1897.88), 2);
		
		Compra compra2 = new Compra(c1.nome);
		compra2.adicionarItem("Caderno", 10.00, 10);
		compra2.adicionarItem(new Produto("Impressora", 1998.90), 1);
		
		c1.compras.add(compra1);
		c1.adicionarCompra(compra2);
		
		
		System.out.println(c1.getValorTotal());
		
		
		
		
		
		
	}

}
