package excecao;

import java.util.ArrayList;
import java.util.List;

public class Container {
	List<String> items = new ArrayList<String>();

	public void addItem(String input) {
		if (items.size() != 3) {
			items.add(input);
		} else {
			throw new ValorNaoExisteException(3);
		}
	}

	public int qtdItens() {
		return items.size();

	}
}
