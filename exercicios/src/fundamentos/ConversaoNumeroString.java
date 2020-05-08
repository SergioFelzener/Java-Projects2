package fundamentos;

public class ConversaoNumeroString {

	public static void main(String[] args) {
		
		Integer num1 = 10000;
		System.out.println(num1.toString().length()); // transformando em string e depois usando notacao ponto length
		
		int num2 = 1000000;
		System.out.println(Integer.toString(num2).length());
		
		System.out.println(("" + num2).length()); // nao aconselhavem concatenar com string vazia para transformar em string
			
		
	}
}
