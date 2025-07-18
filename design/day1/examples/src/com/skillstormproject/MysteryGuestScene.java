package com.skillstormproject;

public class MysteryGuestScene extends Scene {
	public MysteryGuestScene() {
        super(
            4,
            "Back Alley Reunion",
            "A hooded figure sits alone at a small table in the mist by a wall. How strange their tea is cold. \nThey motion for you to join them. What do you do?",
            "Accept the cold tea but stay standing",
            "Ask if they want their tea reheated",
            "Refuse the tea and walk away");
    }
	@Override
    public void handleOption(String input, TeaPlayer player) {
        switch (input) {
            case "1":
                System.out.println("You sip quietly. The tea is icy but you're afraid to offend them \nYou LOST -2 Star Health \nYou LOST -2.5 Wisdom");
                player.health -= 2;
                player.wisdom -= 1.0;
                break;

            case "2":
                if (player.wisdom >= 6.0) {
                    System.out.println("They pause... then share an ancient secret because of your generousity \nYou GAIN +3.5 Wisdom \nYou LOST -3 Tea Magic Tokens");
                    player.wisdom += 3.0;
                    player.teaMagic -= 3;
                } else {
                    System.out.println("You forgot the magic chant! The stranger vanishes and a sharp ringing fills your ears. \nYou LOST -3 Star Health \nYou LOST -4.5 Wisdom");
                    player.health -= 3;
                    player.wisdom -= 4.5;
                }
                break;

            case "3":
                System.out.println("You bow slightly and leave with goosebumps. The stranger remains still.\nNo stat changes, but you feel like they're still watching");
                break;

            default:
                System.out.println("The mist confuses you. You lose your footing.\nYou LOST -2 Health.");
                player.health -= 2;
        }

        System.out.println("\nYour updated stats:");
        System.out.println(player);
    }

}
