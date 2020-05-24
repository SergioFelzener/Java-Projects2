package oo.heranca;

public class Heroi extends Jogador {
	
	public Heroi (int x, int y){
		super(x, y);
	}
	
	// reescrevendo metodo atacar de jogado para se comporta como Heroi
	public int vida = 100;
	
	public boolean atacar(Jogador oponente) {

		int deltaX = Math.abs(x - oponente.x);
		int deltaY = Math.abs(y - oponente.y);

		if (deltaX == 0 && deltaY == 1) {
			oponente.vida -= 20;
			return true;
		} else if (deltaX == 1 && deltaY == 0) {
			oponente.vida -= 20;
			return true;

		}else {
			return false;
		}


	}
	// Utilizando metodo da super e realizando 2 ataques ataque 2x - 20 sendo que ataque é 10 da super.
//	boolean atacar(Jogador oponente) {
//		boolean ataque1 = super.atacar(oponente);
//		boolean ataque2 = super.atacar(oponente);
//		return ataque1 || ataque2;
//	}
	
	
	
	

}
