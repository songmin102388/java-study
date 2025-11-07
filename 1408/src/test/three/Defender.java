package test.three;

public class Defender extends AbstractMonster{

	protected Defender(String name, int hp, int attack, int defense) {
		super(name, hp, attack, defense);
		this.name = "Defenser";
		this.hp = 20;
		this.attack =13;
		this.defense = 25;
		
	}

	@Override
	public void attack() {
		System.out.println("Defender - Attack");
		
	}
	

}
