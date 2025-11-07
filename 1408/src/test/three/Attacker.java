package test.three;

public class Attacker extends AbstractMonster{

	protected Attacker(String name, int hp, int attack, int defense) {
		super(name, hp, attack, defense);
		this.name = "Attacker";
		this.hp = 30;
		this.attack = 20;
		this.defense = 10;
	}

	@Override
	public void attack() {
		System.out.println("");
		
	}

}
