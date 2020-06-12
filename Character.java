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

	// constructor
	public Character(final String name, final int HP, final int HPMax, final int strength, final int exp,
			final int level, final int intel, final int luck) {
		this.charName = name;
		this.charHP = HP;
		this.maxHP = HPMax;
		this.strength = strength;
		this.exp = exp;
		this.level = level;
		this.intel = intel;
		this.luck = luck;
	}

	// set name function
	public void setName(final String name) {

		charName = name;

	}

	// getFunctions
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

	// strength indicator
	// depending on roll, player gets a quick definition of their kind of character
	public static void strengthIndicator(final int HP, final int strength) {

		if (HP > 120 && strength > 12) {
			System.out.println("You look like a very strong character!");
		} else if (HP > 90 && strength > 12) {
			System.out.println("Your character doesn't seem to be weak nor strong, to be honest...");
		} else if (HP < 90 && strength > 12) {
			System.out.println("Wow, that's a glass cannon!");
		} else if (HP < 90 && strength < 9) {
			System.out.println("Oops, your character is really weak, be careful out there!");
		} else {
			System.out.println("OK, let's go!");
		}

	}

	public static String CreateCharacter() {

		final Scanner in = new Scanner(System.in);

		// setting name for the character
		System.out.println("What is your name?");
		final String name = in.next();
		System.out.println("Oh, so your name is " + name + "!");
		System.out.println("");

		return name;

	}

	public static Character EnemyGeneration() {

		// enemy creation
		int HPMax = (int) (Math.random() * (100) + 50);
		int HP = HPMax;
		int strength = (int) (Math.random() * (15) + 5);
		HPMax = (int) (Math.random() * (30) + 15);
		HP = HPMax;
		strength = (int) (Math.random() * (10));

		final Character goblin = new Character("Goblin", HP, HPMax, strength, 1, 1, 5, 0);

		return goblin;

	}

	public static Character BossEnemyGeneration() {

		// enemy creation
		final int HPMax = (int) (Math.random() * (300) + 450);
		final int HP = HPMax;
		final int strength = (int) (Math.random() + 50);

		final Character goblin = new Character("Superior Goblin", HP, HPMax, strength, 1, 1, 15, -2);

		return goblin;

	}

}
