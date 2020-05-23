package aula13;

public class Defesa {

	double defesa;
	Tipo tipo;

	public Defesa(double defesa, Tipo tipo) {
		this.defesa = defesa;
		this.tipo = tipo;

	}

	public double defender(Ataque ataque) {
		double valorAtaque = ataque.ataque - defesa;

		if (ataque.tipo == Tipo.FOGO && tipo == Tipo.GELO) {
			valorAtaque = ataque.ataque * 1.1 - defesa;
		} else if (ataque.tipo == Tipo.GELO && tipo == Tipo.FOGO) {
			valorAtaque = ataque.ataque - defesa * 1.1;
		} else if (ataque.tipo == Tipo.TERRA && tipo == Tipo.AGUA) {
			valorAtaque = ataque.ataque - defesa * 1.3;
		} else if (ataque.tipo == Tipo.AGUA && tipo == Tipo.TERRA) {
			valorAtaque += valorAtaque;
		}

		if (valorAtaque > 0) {
			return valorAtaque;

		} else {
			return 0.0;
		}
	}

}