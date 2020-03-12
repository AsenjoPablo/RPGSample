import java.util.Scanner;

public class Event {
	
	public static void Battle(Character user, Character enemy) {
		
		//BATTLE EVENT!
		boolean isCharAlive = true;
		boolean isGoblinAlive = true;
		do {
			
			//HP BAR
			System.out.println("***********************");
			System.out.println(user.charName + "'s HP: " + user.charHP);
			System.out.println("Enemy's HP: " + enemy.charHP);
			System.out.println("***********************");
			
			
			//Player's turn
			Event.YourTurn(user, enemy);	
			isGoblinAlive = Event.checkAlive(enemy.charHP);				
				if (isGoblinAlive == false) {
					System.out.println("We have a winner!");
					System.out.println(user.charName + " is the winner");
					System.out.println("");
					Event.ExpGain(user, enemy);								
					break;
				}
			
			//Enemy's turn
			Event.EnemyTurn(enemy, user);
			isCharAlive = Event.checkAlive(user.charHP);			
				if (isCharAlive == false) {
					System.out.println("You fainted...");
					break;
				}
			
		} while (isCharAlive == true & isGoblinAlive == true);
		
		MatchOver(user, enemy);
		
	}

	public static int ChooseAction() {
		Scanner in = new Scanner (System.in);
		
		System.out.println("***********************");
		System.out.println("What do you want to do?");
		System.out.println("1. Attack!");
		System.out.println("2. Heal");
		System.out.println("***********************");
		System.out.println("");
		int chosenAction = in.nextInt();
		
		return chosenAction;		
		
	}
		
	public static void YourTurn (Character user, Character target) {
		
		int action = ChooseAction();
		
		if (action == 1) {
			Roll (user, target);
		} else if (action == 2) {
			Heal(user);
		}
		System.out.println("-------------------------");
		
	}
	
	public static void EnemyTurn (Character user, Character target) {
		
		int preRoll = (int) Math.random() * 3 + 1;
		
		if (preRoll == 1 & user.charHP < user.maxHP / 3) {
				Heal(user);
			} else {
				Roll(user, target);
			}
		
		}

	
	private static void Roll (Character user, Character target) {
		
		int roll = (int) (Math.random()*10 + user.luck);
		
		if (roll >=9) {
			CriticalAttack (user, target);
		} else if (roll >=2) {
			Attack(user, target);
		} else if (roll <2) {
			System.out.println(user.charName + "'s attack missed!");
		}
		
	}
	
	private static void Attack(Character user, Character target) {
		
		int damage = (int) ((Math.random() * 20) + user.strength);
		
		System.out.println(user.getName() + " attacked " + target.getName() + " for " + damage);
		target.charHP = decreaseHealth (target.charHP, damage);
		System.out.println(target.getName() + "'s health is now " + target.getHP());
		
	}
	
	private static void CriticalAttack(Character user, Character target) {
		
		int damage = (int) (((Math.random() * 20) + 15) * 2);
		
		System.out.println("CRITICAL ATTACK!!!!!!!!!!");
		System.out.println(user.getName() + " attacked " + target.getName() + " for " + damage);
		target.charHP = decreaseHealth (target.charHP, damage);
		System.out.println(target.getName() + "'s health is now " + target.getHP());
		System.out.println("");
		
	}
	
	private static void Heal(Character user) {
		int heal = (int) (Math.random() * 30 + user.intel);
		user.charHP += heal;
		
		System.out.println(user.charName + " chooses to heal");
		System.out.println("Total heal: " + heal);
		
		if (user.charHP > user.maxHP) {
			user.charHP = user.maxHP;
		}
		
	}
	
	
	private static int decreaseHealth (int HP, int damage) {
		
		HP = HP - damage;	
		
		if (HP < 0) {
			HP = 0;
		} 	
		
		return HP;
		
	}
	
	public static boolean checkAlive (int HP) {
		
		boolean checkAlive = true;
		
		if (HP == 0) {
			checkAlive = false;
		}
		
		return checkAlive;
		
	}
	
	private static void MatchOver(Character user, Character enemy) {
		
		//HP restoration
		System.out.println("HP is restored");
		user.charHP = user.maxHP;
		System.out.println("Current HP: " + user.charHP);
		enemy.charHP = enemy.maxHP;
		System.out.println("Current XP: " + user.exp + "/" + (user.level * 50));
		
		}

	public static void ExpGain(Character user, Character enemy) {
		
		int expGain = (int) ((Math.random() + enemy.maxHP + 30));
		
		System.out.println("You gained " + expGain + " points of experience");
		System.out.println("");
		
		user.exp += expGain;
		
		if(user.exp > user.level * 50) {
			LevelUp(user, enemy);
		}

	}
	
	private static void LevelUp (Character user, Character enemy) {
				
		//USER boost
		user.exp = 0;
		user.level += 1;
		user.maxHP += (int) (Math.random() * 50) + 25;
		user.strength += (int) (Math.random() * 15) + 10;
		user.intel += (int) (Math.random() * 15) + 10;
		user.luck += (int) (Math.random() * 2);
		
		//ENEMY boost
		enemy.maxHP += (int) (Math.random() * 100) + 25;
		enemy.charHP = enemy.maxHP; //this heals up enemy
		enemy.strength += (int) (Math.random() * 15) + 10;
		enemy.intel += (int) (Math.random() * 15) + 10;

		System.out.println("Level up!!!");
		System.out.println("-----------");
		System.out.println("Stats");
		System.out.println("Max HP: " + user.maxHP);
		System.out.println("Strength: " + user.strength);
		System.out.println("Intel: " + user.intel);
		System.out.println("Luck: " + user.luck);
		System.out.println("New level: " + user.level);
		
	}

	public static int ChooseOption() {
		Scanner in = new Scanner (System.in);
		
		int chosenOption = in.nextInt();
						
		return chosenOption;
	}

	public static void LeaveGame() {
		System.out.println("Leaving the game...");
		System.out.println("Disconnected");
	} 

	

	
	
}
