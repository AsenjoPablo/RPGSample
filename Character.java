import java.util.Scanner;

public class Character {

	String charName;
	int charHP;
	int maxHP;
	int exp;
	int level;
	int strength;
	int intel;
	int luck;
	
	//constructor
	public Character (String name, int HP, int HPMax, int strength, int exp, int level, int intel, int luck) {
		this.charName = name;
		this.charHP = HP;
		this.maxHP = HPMax;
		this.strength = strength;
		this.exp = exp;
		this.level = level;
		this.intel = intel;
		this.luck = luck;
	}
	
	
	//set name function
	public void setName (String name) {
		
		charName = name;
		
	}
	
	//getFunctions
	public String getName() {
		return charName;
	}
	
	public int getHP() {
		return charHP;
	}
	
	public int getHPMax() {
		return maxHP;
	}
	public int getLevel() {
		return level;
	}
	
	
	//strength indicator	
	public static void strengthIndicator (int HP, int strength) {
		
		if (HP >120 & strength > 12) {
			System.out.println("You look like a very strong character!");
		} else if (HP >90 & strength > 12) {
			System.out.println("Your character doesn't seem to be weak nor strong, to be honest...");
		} else if (HP <90 & strength > 12) {
			System.out.println("Wow, that's a glass cannon!");
		} else if (HP < 90 & strength < 9){
			System.out.println("Oops, your character is really weak, be careful out there!");
		} else {
			System.out.println("OK, let's go!");
		}
		
	}
	
	public static String CreateCharacter() {
		
		Scanner in = new Scanner (System.in);
		
		//setting name for the character
		System.out.println("What is your name?");
		String name = in.next();
		System.out.println("Oh, so your name is " + name + "!");
		System.out.println("");
		
		return name;
		
	}
	
	public static Character EnemyGeneration() {
		
		//enemy creation
		int HPMax = (int) (Math.random() * (100) + 50);
		int HP = HPMax;
		int strength = (int) (Math.random() * (15) + 5);
		HPMax = (int) (Math.random() * (30) + 15);
		HP = HPMax;
		strength = (int) (Math.random() * (10));
		
		Character goblin = new Character ("Goblin", HP, HPMax, strength, 1, 1, 5, 0);
		
		return goblin;
		
	}
	
	public static Character BossEnemyGeneration() {
		
		//enemy creation
		int HPMax = (int) (Math.random() * (300) + 450);
		int HP = HPMax;
		int strength = (int) (Math.random() + 50);
		
		Character goblin = new Character ("Superior Goblin", HP, HPMax, strength, 1, 1, 15, -2);
		
		return goblin;
		
	}
	
	
	
	
}
