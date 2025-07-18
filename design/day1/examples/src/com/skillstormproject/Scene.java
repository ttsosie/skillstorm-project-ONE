package com.skillstormproject;

import java.util.Scanner;

//this will be my parent class for the scenes
public abstract class Scene {
	
	protected int id;
	protected String name;
	protected String description;
	protected String option1;
	protected String option2;
	protected String option3;
	
	public Scene(int id, String name, String description, String option1, String option2, String option3) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.option1 = option1;
		this.option2 = option2;
		this.option3 = option3;
	}
	
	public int getId() {
	    return id;
	}
	
	//there's a player for each scene and Scanner for them to choose options from
	public String playScene(TeaPlayer player, Scanner scanner) {
        System.out.println("\n======= SCENE: " + name + " =======\n");
        System.out.println(description);
        System.out.println("-----------------------------");
        System.out.println("\n1: " + option1);
        System.out.println("2: " + option2);
        System.out.println("3: " + option3);
        System.out.print("\nENTER 1 or 2 or 3: ");

        String input = scanner.nextLine().trim();

        if (input.equals("1") || input.equals("2") || input.equals("3")) {
            handleOption(input, player);
        }
        
        return input; //this is where the change to the different scenes from the adventure game
    }

    public abstract void handleOption(String input, TeaPlayer player);

}
