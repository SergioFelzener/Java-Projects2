package decorator;

class AcessorioBase implements Arma {
	Arma arma;

	public AcessorioBase(Arma arma) {
		this.arma = arma;
	}

	public void montar() {
		this.arma.montar();
	}
}
