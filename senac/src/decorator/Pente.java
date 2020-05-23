package decorator;

class Pente extends AcessorioBase {
	public Pente(Arma arma) {
		super(arma);
	}

	public void montar() {
		super.montar();
		System.out.println("Coloquei o pente");
	}
}
