package classe;

public class AreaCirc {
	
	double raio;
	final static double PI = 3.141592;
	
	
	AreaCirc(double raioInicial){
		// PI = 3.14;
		raio = raioInicial;
		
	}
	
	double area() {
		// return raio * raio * pi; ou // 
		return PI * Math.pow(raio, 2);
		
	}
	
	static double area(double raio) {
		return PI * Math.pow(raio, 2);
		
	}


}
