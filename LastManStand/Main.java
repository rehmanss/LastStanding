
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        //the objects for the systems which will go here
        
        Scanner in = new Scanner (System.in);
        Random rand = new Random();
    
        //Game items will go here the game is like dungon game
        
        String[] enemies = { "Kratos", "Ninja", "Ezio", "Assassin", "Spartan", "Zombie", "Hunter", "Giant", "Bomber" };
        int maxEnemyHealth =100;
        int enemyAttackDamage = 30;
        
        //Player information
        int health = 100;
        int attackDamage = 30;
        int numHealthPotions = 3;
        int healthPotionHealAmount = 25;
        int healthPotionDropChance = 25;
        
        boolean running = true;
        
        System.out.println("Welcome to the Last Man Standing Game!");
        
        GAME:
            while(running) {
                System.out.println("___________________________________________");
                int enemyHealth = rand.nextInt(maxEnemyHealth);
                String enemy = enemies[rand.nextInt(enemies.length)];
                System.out.println("\t# " + enemy + " has arrived! Get Ready! #\n");
                
                
                while(enemyHealth > 0) {
                    System.out.println("\t Your HP:" + health);
                    System.out.println("\t" + enemy + "'s HP: " + enemyHealth);
                    System.out.println("\n\tWhat Would You like to do?");
                    System.out.println("\t1. Attack");
                    System.out.println("\t2. Drink Health Potion");
                    System.out.println("\t3. Run! or you will Die!");
                    
                    String input = in.nextLine(); {
                    if(input.equals("1")) {
                        
                        int damageDelt = rand.nextInt(attackDamage);
                        int damageTaken = rand.nextInt(enemyAttackDamage);
                        
                        enemyHealth -= damageDelt;
                        health -= damageTaken;
                        
                        
                        System.out.println("\t> You strike the" + enemy + " for " + damageDelt + " damage.");
                        System.out.println("\t> You Recieve " + damageTaken + " in Return!");
                        
                    if(health  < 1) {
                        System.out.println("\t> You have taken too much damage, you are too weak to go further!");
                        break;
                       }
                    }
                    
                    else if (input.equals("2")) {
                        if (numHealthPotions > 0) {
                           health += healthPotionHealAmount;
                           numHealthPotions--;
                           System.out.println("\t> Drink a health potion, to survive " + healthPotionHealAmount + "."
                           + "\n\t> You now have" + health + " HP."
                           + "\n\t> You have " + numHealthPotions + " Health Potions left.\n");
                        
                }
        else {
            System.out.println("\t> You have no health potions left! Defeat enemy to get a health potion!\n");
            
        }
    }
    
    else if(input.equals("3")) {
        System.out.println("\tYou run away from the " + enemy + "!");
        continue GAME;
        
       }
       
       else {
            System.out.println("\tInvalid Command Detected!");
           
       }
}

        if(health < 1) {
            System.out.println("You are kicked out of the Game, too weak to play the game.");
            break;
}   
            System.out.println("_______________________________________________");
            System.out.println(" # " + enemy + "was defeated! # ");
            System.out.println(" #  You have " + health + " HP left. #");
            numHealthPotions++;
            System.out.println("# The " + enemy + " Dropped a health Potion! # ");
            System.out.println("# You now have " + numHealthPotions + "Health Potion(s). # ");
}

            System.out.println("_________________________________________________");
			System.out.println("What Would You Like To Do Now?");
			System.out.println("1. Continue Fighting");
			System.out.println("2. Exit Last Man Standing Game!");
			
			String input = in.nextLine();
			
			while(!input.equals("1") && !input.equals("2")) {
				System.out.println("Invalid Command Detected!");
				input = in.nextLine();
            }
        
			if(input.equals("1")) {
				System.out.println("Continue The Adventure!");
			}
			else if(input.equals("2")); {
				System.out.println("You Have Exited The Last Man Standing! Succesfully");
				break;
			}
    }
        System.out.println("#########################################");
        System.out.println("# THANKS FOR PLAYING LAST MAN STANDING! #");
        System.out.println("#########################################");
    }
    
}
        
