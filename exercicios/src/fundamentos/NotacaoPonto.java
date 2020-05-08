package fundamentos;

public class NotacaoPonto {
	
	public static void main(String[] args) {
		
		//double a = 2.3;
		String s = "Bom dia X !!!";
		
		s = s.replace("X", "Sr.");
		s = s.toUpperCase();
		s = s.concat("!!!");
		
		System.out.println(s);
		
		System.out.println("leo".toUpperCase());
		
		String x = "leonardo".toUpperCase();
		System.out.println(x);
		
		
		String y = "Bom dia X".replace("X", "Sergio").toUpperCase();
		System.out.println(y);
		
		
		//tipos primitivos nao tem operador Ponto "." .toUpperCase().replace(),
		//nao se usa notacao ponto em tipos primitivos
	}

}
