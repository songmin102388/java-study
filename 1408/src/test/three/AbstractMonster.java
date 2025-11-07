package test.three;

public abstract class AbstractMonster {
	protected String name;
	protected int hp;
	protected int attack;
	protected int defense;
	
	protected AbstractMonster(String name, int hp, int attack, int defense) {
		this.name = name;
		this.hp = hp;
		this.attack = attack;
		this.defense= defense;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	public int getDefense() {
		return defense;
	}

	public void setDefense(int defense) {
		this.defense = defense;
	}
	
	public void defense(int attack) {
		if(defense > attack) {
			
		}
		else if(defense < attack) {
			int a = attack -defense;
			
		}
	}
	
	
	
	
	
	

	public abstract void attack();

}
