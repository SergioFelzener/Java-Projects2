package fundamentos.operadores;

public class OperadoresRelacionais {
	
	public static void main(String[] args) {
		
		int a = 97;
		int b = 'a'; //recebendo valor de um caracter da tabela UNICODE cada letra tem a posicao da tabela unicode 
		
		
		System.out.println(a == b);
		System.out.println(3 > 4);
		System.out.println(3 >= 3);
		System.out.println(3 < 7);
		System.out.println(30 < 7);
		System.out.println(30 != 8);
		
		double nota = 7.3;
		
		
		boolean bomComportamento = true;
		boolean passouPorMedia = nota >= 7;
		
		boolean temDesconto = bomComportamento && passouPorMedia;
		
		System.out.println("Tem desconto ? " + temDesconto);
		
		
	}

}
