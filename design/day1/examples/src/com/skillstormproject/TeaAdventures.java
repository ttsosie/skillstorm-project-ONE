package com.skillstormproject;

import java.util.Scanner;

public class TeaAdventures {

	public static void main(String[] args) {
		//Welcome player to the game
		System.out.println("Hello and welcome to your Tea Adventure!");
		System.out.println("Before we begin, let's build your player with 6 properties: ");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("\nEnter your Tea Player's name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your player's Wisdom about tea (1.0 to 10.0): ");
        double wisdom = Double.parseDouble(scanner.nextLine());

        System.out.print("Enter your player's Experience level with herbs or spices (1–10): ");
        int experience = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter your player's Star Health (1–10): ");
        int health = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter your player's Star Strength based on caffeine (1–10): ");
        int strength = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter your player's Tea Magic level (1–10): ");
        int teaMagic = Integer.parseInt(scanner.nextLine());

        TeaPlayer player = new TeaPlayer(name, wisdom, experience, health, strength, teaMagic);
        System.out.println("\n -----Tea Player CREATED!-----\n");
        System.out.println(player);
        
        //Starting Scene
        Scene welcome = new WelcomeGardenScene();
        String choice = welcome.playScene(player, scanner);
        
        Scene nextScene = null; //instantiate as null until player picks one of the scenes from the welcome 

        switch (choice) {
            case "1":
                nextScene = new QueensCourtyardScene();
                break;
            case "2":
                nextScene = new CatPartyScene();
                break;
            case "3":
                nextScene = new MysteryGuestScene();
                break;
        }
        
        if (nextScene != null) { //only play the next scene if the player chooses a valid option
            nextScene.playScene(player, scanner);
        }
        
        //Last scene for the game
        Scene finalScene = new FinalScene();
        finalScene.playScene(player, scanner);
      
        scanner.close();
	}

}
