
public class Game {

	//main method
		public static void main(String[] args) {
			
			String name = Character.CreateCharacter();
			
			//setting HP for character
			int HPMax = (int) (Math.random() * (100) + 50);
			int HP = HPMax;
			int strength = (int) (Math.random() * (20) + 5);
			Character.strengthIndicator(HPMax, strength);
			
			//char creation
			Character myChar = new Character (name, HP, HPMax, strength, 0, 1, 20, 1);			
	
			//battle simulation
			System.out.println("");
			System.out.println("Hey, you found an enemy!");
			System.out.println("Let's fight!");
			System.out.println("");
			
			Character goblin = Character.EnemyGeneration();
			Character bossGoblin = Character.BossEnemyGeneration();
			
			Event.Battle (myChar, goblin);
			
			//Re-match	
			int nextOption;
			
			do {
				System.out.println("***********************");
				System.out.println("What do you want to do now?");
				System.out.println("1. Fight again");
				System.out.println("2. Leave the game");
				System.out.println("***********************");
				nextOption = Event.ChooseOption();	
				
				if (nextOption == 1) {	
					int roll = (int) (Math.random() * 10);
					if (roll > 5) {
						System.out.println("OH NO!! The boss goblin!!");
						System.out.println("Should we attack him?");
						System.out.println("1. Yes!!!");
						System.out.println("2. Not yet");
						nextOption = Event.ChooseOption();
						
						if (nextOption == 1) {
							Event.Battle(myChar, bossGoblin);
						} else {
							System.out.println("A passing goblin decides to attack us");
							Event.Battle(myChar, goblin);
							nextOption = 0;
						}
					} else {
						nextOption = 0;
						Event.Battle(myChar, goblin);						
					}
				}
		
			} while (nextOption != 2);
			
			Event.LeaveGame();
				
		}
	
}
