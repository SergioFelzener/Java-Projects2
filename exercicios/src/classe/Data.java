package classe;

public class Data {
	
	int dia;
	int mes;
	int ano;
	
	
	// criando contrutores Data 
	
	// Contrutor padrao recebendo data padrao.
	
	Data(){
		//dia = 01;
		//mes = 01;
		//ano = 1970;
		this(1,1,1970);
	}
	
	Data (int dia, int mes, int ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	
	String obterDataFormatada() {
		
		//return dia + "/" + mes + "/" + ano;
		String formatoData = "%d/%d/%d";
		return String.format(formatoData, this.dia, mes, ano);
		
	}
	
	void imprimirDataFormatada() {
		System.out.printf("%d/%d/%d\n", dia, mes, ano);
	}

}
