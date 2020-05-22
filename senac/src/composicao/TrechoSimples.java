package composicao;

public class TrechoSimples implements TrechoAereo {
	private String origem;
	private String destino;
	double valor;

	public TrechoSimples(String origem, String destino, double valor) {
		this.origem = origem;
		this.destino = destino;
		this.valor = valor;
	}

	public String getOrigem() {
		return this.origem;
	}

	public String getDestino() {
		return this.destino;
	}

	public double getPreco() {
		return this.valor;
	}

	public String toString() {
		return getOrigem() + " - " + getDestino() + ": " + getPreco();
	}
}
