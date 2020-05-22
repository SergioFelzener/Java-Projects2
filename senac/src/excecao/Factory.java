package excecao;

public class Factory {
	public String select(String input) throws Exception {
	    switch (input)
	    {
	        case "a":
	            return "1";
	        case "b":
	            return "2";
	        default:
	            throw new ValorNExisteException(input);
	    }
	  }

}
