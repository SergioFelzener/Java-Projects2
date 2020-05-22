package excecao;

@SuppressWarnings("serial")
public class ValorNExisteException extends Exception {
	public ValorNExisteException(String message){
	    super("Não existe a opção " + message);
	  }

}
