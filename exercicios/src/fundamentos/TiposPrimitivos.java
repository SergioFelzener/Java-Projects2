package fundamentos;

public class TiposPrimitivos {
	
	public static void main(String[] args) {
		
		//Informação de um funcionário 
		
		// Tipos numericos inteiros 
		
		byte anosDeEmpresa = 23;
		short numerosDeVoos = 542;
		int id = 56789;
		//long pontosAcumulados = 3_234_845_223; // literal acima da capacidade do inteiro long.
		long pontosAcumulados = 3_134_845_223L; // Usando L define literal LONG em caixa alta.
		
		
		// tipos numericos com ponto flutuante
		
		float salario = 11_445.44F; // indica um literal float para usar o double dentro do float usa o F em caixa alta.
		double vendasAcumuladas = 2_991_797_103.01;
		
		// Tipo booleano 
		boolean estaDeFerias = false;
		
		//Tipo caractere
		
		char status = 'A'; // Ativo char usa apenas 1 caracter.
		
		// usando variaveis 
		// calculando dias de empresa 
		System.out.println(anosDeEmpresa * 365);
		
		// numero de viagens 
		System.out.println(numerosDeVoos / 2);
		
		//ponto por real 
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		System.out.println(id + ": ganha ->" + salario);
		System.out.println("ferias: " + estaDeFerias);
		System.out.println("Ativo :" + status);
		
		
		
		
		
		
		
		
	}

}
