package controle;

public class DesafioFor {
	
	public static void main(String[] args) {
	
		String valor = "#";
		
		for(int i = 1; i <=5; i++) {
			System.out.println(valor);
			//valor = valor + "#";
			valor += "#";
		}
		
		// Desafio consiste em gerar o mesmo resultado do 
		// FOR acima sem usar numeros na estrutura de controle 
		
		for (String v = "#"; !v.equals("######"); v += "#") {
			System.out.println(v);
		}
	
	}
}
