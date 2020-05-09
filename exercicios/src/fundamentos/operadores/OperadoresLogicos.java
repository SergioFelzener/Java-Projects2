package fundamentos.operadores;

public class OperadoresLogicos {
	public static void main(String[] args) {
		
		boolean condicao1 = true;
		boolean condicao2 = 3 > 7;
		
		System.out.println(condicao1 && !condicao2);
		System.out.println(condicao1 || condicao2);
		System.out.println(condicao1 ^ condicao2);
		System.out.println(!!condicao1);
		System.out.println(!condicao2);
		
		
		// tabela verdade E - AND 
		
		System.out.println("Tabela verdade do e (AND)");
		System.out.println(true && true);
		System.out.println(true && false);
		//System.out.println(false && true);
		//System.out.println(false && false);
		
		// tabela verdade OU - OR
		System.out.println("Tabela verdade do ou (OR)");
		//System.out.println(true || true);
		//System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		
		// tabela verdade ou exclusivo - XOR
		System.out.println("Tabela verdade do ou excluisivo (XOR)");
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ true);
		System.out.println(false ^ false);
		
		
		// tabela verdade NOT !
		System.out.println("Tabela verdade do NOT (!)");
		System.out.println(!true);
		System.out.println(!false);
		System.out.println(!!false);
	}

}
