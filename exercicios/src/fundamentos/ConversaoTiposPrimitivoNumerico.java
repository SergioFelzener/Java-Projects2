package fundamentos;

public class ConversaoTiposPrimitivoNumerico {
	
	public static void main(String[] args) {
		
		double a = 1; // implicita
		System.out.println(a);
		
		//fazendo conversao explicita pode se perder informacao porem esta ciente CAST 
		
		float b = (float) 1.1234599987660;
		System.out.println(b);
		
		int c = 340; 
		byte d = (byte) c; // explicita (CAST)
		System.out.println(d);
		
		double e = 1.9999;
		int f = (int)e; // explicita perda de informacao.
		System.out.println(f);
	}

}
