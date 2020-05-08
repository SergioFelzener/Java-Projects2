package fundamentos;

public class TipoString {
	
	public static void main(String[] args) {
		
		
		System.out.println("Ola pessoal".charAt(0));
		
		String s = "Boa Tarde Pessoal";
		System.out.println(s.concat(" !!!"));
		System.out.println(s + "!!!");
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.startsWith("boa"));
		System.out.println(s.toLowerCase().startsWith("boa"));
		System.out.println(s.endsWith("pessoal"));
		System.out.println(s.toLowerCase().endsWith("pessoal"));
		System.out.println(s.length());
		System.out.println(s.equals("boa tarde"));
		System.out.println(s.equalsIgnoreCase("boa tarde pessoal"));
		
		var nome = "Pedro";
		var sobrenome = "Jose";
		var idade = 33;
		var salario = 12345.987;
		
		// \n = quebra de linha na impressao 
		System.out.println(" Nome : " + nome + "\nSobrenome : " + sobrenome + "\nIdade : " + idade + "\nSalario : " + salario + "\n\n");
		
		System.out.printf("Nome: %s %s\n Idade: %d \n Seu salário é : R$%.2f.\n\n", nome, sobrenome, idade, salario);
		
		String frase = String.format("Nome: %s %s\n Idade: %d \n Seu salário é : R$%.2f.", nome, sobrenome, idade, salario);
		
		System.out.println(frase);
		
		System.out.println("Frase qualquer".contains("qual"));
		System.out.println("Frase qualquer".indexOf("qual"));
		System.out.println("Frase qualquer".substring(6));
		System.out.println("Frase qualquer".substring(6, 8));
		System.out.println("Frase qualquer".substring(6, 10));
		
		
	}

}
