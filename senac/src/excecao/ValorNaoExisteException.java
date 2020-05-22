package excecao;

@SuppressWarnings("serial")
public class ValorNaoExisteException extends RuntimeException {
	public ValorNaoExisteException(int quant) {
		super("Adicionou mais itens do que deveria, o máximo é " + quant);
	}

}
