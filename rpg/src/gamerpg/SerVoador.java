package gamerpg;

import java.util.Random;

public interface SerVoador {
	
	default boolean desviaVoador(int num) {
		Random random = new Random();
		return random.nextInt(num) == 1;
	}

}
