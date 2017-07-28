package textBasedGame;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// System objects

		Scanner in = new Scanner(System.in);
		Random rand = new Random();

		// Game variables

		String[] enemies = { "Zombie", "Skeleton", "The Joker" };
		int maxEnemyHealth = 100;
		int enemyAttackDamage = 25;

		// Player variables

		int health = 100;
		int attackDamage = 50;
		int healthPotions = 3;
		int healthPotionHealAmount = 30;
		int healthPotionDropChance = 50;

		// The game starts

		boolean running = true;
		System.out.println("Welcome to The Adventure of The Barren Moor");

		GAME: while (running) {
			System.out.println("---------------------------------------------");
			int enemyHealth = rand.nextInt(maxEnemyHealth);
			String enemy = enemies[rand.nextInt(enemies.length)];
			System.out.println("\t# " + enemy + " has appeared! #\n");

			while (enemyHealth > 0) {
				System.out.println("\tYour HP: " + health);
				System.out.println("\t" + enemy + "'s HP:" + enemyHealth);
				System.out.println("\n\t What would you like to do?");
				System.out.println("\t1 Attack");
				System.out.println("\t2 Drink health juice");
				System.out.println("\t3 Run!!!!!");

				String input = in.nextLine();

				// Press 1 to attack

				if (input.equals("1")) {
					int damageDealt = rand.nextInt(attackDamage);
					int damageTaken = rand.nextInt(enemyAttackDamage);

					enemyHealth -= damageDealt;
					health -= damageTaken;

					// When 1 is pressed, the system prints out a message

					System.out.println(
							"\t> You hit the " + enemy + " with a combination for " + damageDealt + " damage: ");
					System.out.println("\t> You get hit for a damage of " + damageTaken);

					if (health < 1) {
						System.out.println("\t>You have taken too much damage.");
						break;

					}
						
					// When 2 is pressed, health potion is drank
					
				} else if (input.equals("2")) {
					if (healthPotions > 0) {					// If there is no health potion left, message to confirm 
						health += healthPotionHealAmount;
						healthPotions--;
						System.out.println("You sip health juice, for the heal amount of " + healthPotionHealAmount
								+ "\n\t> You now have " + health + "HP" + "\n\t> You have" + healthPotions
								+ " health potions left. \n");

					} else {
						System.out.println("\t> You have no health ");
					}

				} else if (input.equals("3")) {

				} else {

				}
			}
		}

	}
}
