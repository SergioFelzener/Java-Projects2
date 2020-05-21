package colecoes;

import java.util.HashSet;

public class Hash {

	public static void main(String[] args) {
		
		HashSet<Usuario> usuarios = new HashSet<>();
		
		usuarios.add(new Usuario("Pedro"));
		usuarios.add(new Usuario("Ana"));
		usuarios.add(new Usuario("Gilherme"));
		
		boolean resultado = usuarios.contains(new Usuario("Gilherme"));
		System.out.println(resultado);
	}
}
