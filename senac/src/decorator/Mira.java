package decorator;

class Mira extends AcessorioBase {
	public Mira(Arma arma) {
		super(arma);
	}

	public void montar() {
		super.montar();
		System.out.println("Coloquei a mira");
	}
}
