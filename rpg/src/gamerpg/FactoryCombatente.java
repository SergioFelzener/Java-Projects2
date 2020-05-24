package gamerpg;

import java.util.HashMap;
import java.util.Map;

public class FactoryCombatente {
	
	public Map<Integer, Combatente> board = new HashMap<>();
	
	public void createCombatente() {
		board.put(1, new OrcAssassino());
		board.put(2, new OrcBarbaro());
		board.put(3, new OrcDaMontanha());

		for(int chave: board.keySet()) {
			System.out.println(chave);
		}
	}
	
	public Combatente selectCombatente(int id) {
		this.createCombatente();
		return board.get(id);
	}
	

	

}
