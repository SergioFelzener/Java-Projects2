package fundamentos.operadores;

public class OperadoresTernarios {

	public static void main(String[] args) {

		double media = 8.6;

		String resultadoFinal = media >= 7 ? "Aprovado" : "Recuperação";

		System.out.println("o aluno está : " + resultadoFinal);

		

		boolean bomComportamento = true;
		boolean passouPorMedia = media >= 7;

		boolean temDesconto = bomComportamento && passouPorMedia;
		String resultado = temDesconto ? "Sim." : "Não.";

		System.out.println("Tem desconto ? " + resultado);

	}

}
