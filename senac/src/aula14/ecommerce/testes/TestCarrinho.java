package aula14.ecommerce.testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import aula14.ecommerce.Carrinho;

class TestCarrinho {

	@Test
	public void addProduct() {
		
		Carrinho carrinho = new Carrinho();
		
		carrinho.addProduct("Batata", 1, 500);
		
		assertTrue(carrinho.haveProduct("Batata"));
		
		
	}

}
