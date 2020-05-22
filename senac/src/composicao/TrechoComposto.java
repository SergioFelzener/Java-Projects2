package composicao;

public class TrechoComposto implements TrechoAereo {
	  TrechoAereo t1;
	  TrechoAereo t2;
	  double desconto;

	  //TrechoComposto tc1	=	new	TrechoComposto(ts2,	ts3, 30);
	  public TrechoComposto(TrechoAereo t1, TrechoAereo t2, double desconto) {
	    this.t1 = t1;
	    this.t2 = t2;
	    this.desconto = desconto;
	  }

	  public String getOrigem(){
	    return this.t1.getOrigem();
	  };

	  public String getDestino(){
	    return this.t2.getDestino();
	  };

	  public double getPreco(){
	    return (t1.getPreco() + t2.getPreco()) - this.desconto;
	  };
	  
	  public String toString() {
	    return getOrigem() + " - " + getDestino() + ": " + getPreco();
	  }
	}