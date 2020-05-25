package gamerpg;

import java.util.Random;

public abstract class Combatente {
	
	public String name;
	public int life;
	public int power;
	boolean alive;
	
	public Combatente(String name, int life, int power) {
		this.name = name;
		this.life = life;
		this.power = power;
	}
	
	public int totalLife() {
		return this.life;	
	}
	
	public boolean alive() {
		if(totalLife() > 0) {
			return true;
		}else {
			return false;
		}
	}
	
	public int attackDamage() {
		Random random = new Random();
		int damage = random.nextInt(10);
		this.life = life - (damage + power - 10);
		return life;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name + "\n" + "vida:" + life + "\n" + "força:" + power;
	}
	
	
	
	
	
}
