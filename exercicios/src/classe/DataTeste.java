package classe;

public class DataTeste {
	
	public static void main(String[] args) {
		
		Data data1 = new Data();
		data1.ano = 1998;
		//data1.dia = 12;
		//data1.mes = 1;
		
		var data2 = new Data();
		data2.ano = 2020;
		data2.dia = 15;
		data2.mes = 05;
		
		Data data3 = new Data(16,05,2020);
		
		String dataFormatada1 = data1.obterDataFormatada();
		
		String data = (data1.dia + "/" + data1.mes + "/" + data1.ano);
		
		System.out.println("Data 1 = " + dataFormatada1);
		
		System.out.printf("Data 2 = %d/%d/%d\n", data2.dia, data2.mes, data2.ano);
		
		System.out.printf("Data 3 = %d/%d/%d\n", data3.dia, data3.mes, data3.ano);
		
		data1.imprimirDataFormatada();
		
		data2.imprimirDataFormatada();
		
		data3.imprimirDataFormatada();
		
			
		
	}

}
