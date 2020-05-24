package oo.encapsulamento;

public class PessoaTeste {
	
	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa("Pedro" , "Jose", -30);
		p1.setIdade(-30);// alterar valor da variavel 
		
		System.out.println(p1.getIdade()); // lemos o valor da variavel 
		System.out.println(p1); // lemos o valor da variavel 
		System.out.println(p1.getNomeCompleto());
	}
	
	

}
