package gamerpg;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import gamerpg.combatentes.DragaoDoFogo;
import gamerpg.combatentes.Elfo;
import gamerpg.combatentes.OrcAssassino;
import gamerpg.combatentes.OrcBarbaro;
import gamerpg.combatentes.OrcDaMontanha;

public class FactoryCombatente {
	
	public Map<Integer, Combatente> board = new HashMap<>();
	
	public void createCards() {
		board.put(1, new OrcAssassino());
		board.put(2, new OrcBarbaro());
		board.put(3, new OrcDaMontanha());
		board.put(4, new DragaoDoFogo());
		board.put(5, new Elfo());
			

	}
	
	public Combatente selectCombatente(int id) {
		this.createCards();
		return board.get(id);
	}

	
	public void listar() {
		for(Entry<Integer, Combatente> registro: board.entrySet()) {
			System.out.print(registro.getKey() + "-");
			System.out.println(registro.getValue());
			
		}
		
	}
	
}
