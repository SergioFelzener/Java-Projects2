package decorator;

public class Decorator {
	public static void main(String[] args) {

		ArmaBase armaBase = new ArmaBase();

		Mira mira = new Mira(armaBase);
		Pente pente = new Pente(mira);
		pente.montar();

		System.out.println("----------------");

		ArmaBase armaBase2 = new ArmaBase();
		Pente pente2 = new Pente(armaBase2);
		pente2.montar();

		System.out.println("----------------");

		ArmaBase armaBase3 = new ArmaBase();
		armaBase3.montar();

		System.out.println("----------------");

		ArmaBase armaBase4 = new ArmaBase();
		MiraLazer miraLazer = new MiraLazer(armaBase4);
		CoronhaPlus coronhaPlus = new CoronhaPlus(miraLazer);
		Silenciador silenciador = new Silenciador(coronhaPlus);
		silenciador.montar();

		System.out.println("----------------");
		
		ArmaBase armaBase5 = new ArmaBase();
		MiraLazer miraLazer2 = new MiraLazer(armaBase5);
		Silenciador silenciador2 = new Silenciador(miraLazer2);
		Pente pente3 = new Pente(silenciador2);
		pente3.montar();

		System.out.println("----------------");

		System.out.println("----------------");
	}

}
