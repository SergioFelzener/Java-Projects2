package decorator;

public class CoronhaPlus extends AcessorioBase {
	public CoronhaPlus (Arma arma) {
		super(arma);
	}
	
	public void montar() {
		super.montar();
		System.out.println("Coloquei coronha MegaBlaster");
	}

}
