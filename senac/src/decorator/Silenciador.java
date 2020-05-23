package decorator;

public class Silenciador extends AcessorioBase {
	public Silenciador(Arma arma) {
		super(arma);
	}

	public void montar() {
		super.montar();
		System.out.println("Coloquei um silenciador");
	}

}
