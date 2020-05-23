package decorator;

public class MiraLazer extends AcessorioBase {
	public MiraLazer(Arma arma) {
		super(arma);
	}

	public void montar() {
		super.montar();
		System.out.println("Coloquei a mira Lazer");
	}

}
