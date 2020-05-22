package aula13;

public class TipoEnum {
	
	
	
	public static void main(String[] args) {
		
		
		Ataque ataque = new Ataque(100.0,Tipo.FOGO);
		Defesa defesa = new Defesa(80.0,Tipo.GELO);
		Ataque ataque2 = new Ataque(50.0,Tipo.TERRA);
		Defesa defesa2 = new Defesa(30.0,Tipo.AGUA);
		
		System.out.println(Tipo.AGUA.ordinal());
		System.out.println(Tipo.TERRA.ordinal());
		System.out.println(defesa.defender(ataque));
		System.out.println(defesa2.defender(ataque2));
		
	}

}
