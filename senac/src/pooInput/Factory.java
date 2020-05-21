package pooInput;

import java.util.HashMap;
import java.util.Map;

public class Factory {
	
	Map<Integer, Letra> classesMap = new HashMap<>();
	
	public Factory() {
		classesMap.put(1, new A());
		classesMap.put(2, new B());
		classesMap.put(3, new C());
		classesMap.put(4, new D());
	}
	
	public Letra escolherClasse(int valor) {
		return classesMap.get(valor);
		
	}

}
