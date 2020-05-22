package excecao;

import java.util.Scanner;

public class NaoVerificada {
	public static void main(String[] args) {
	    Container container = new Container();
	    @SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
	    System.out.println("Digite qualquer texto, \"sair\" para terminar...");

	    while(true){
	      System.out.print("Próximo item: ");
	      String item = entrada.nextLine();
	      if(item.contains("sair")){
	        System.out.println("Tchau! 👋");
	        System.exit(0);
	      } else {
	        container.addItem(item);
	        System.out.println("Total: " + container.qtdItens());
	      }
	      
	    }
	  }

}
