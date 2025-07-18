package com.skillstormproject;

public class CatPartyScene extends Scene {
	public CatPartyScene() {
        super(
            3,
            "Speakeasy Catnip",
            "You've arrived in the land of cats. Mischievous cats dressed in robes sip tea and lounge in velvet chairs. "
            + "\nThey pause as you enter and turn toward you, curious. What do you do to avoid a cat fight?",
            "Impress them by juggling teacups painted with mice",
            "Offer them some rare catnip grown with moonlight dew over a comet's light",
            "Politely observe and sneeze away");
        
	}
	@Override
    public void handleOption(String input, TeaPlayer player) {
        switch (input) {
            case "1":
                if (player.strength >= 6) {
                    System.out.println("You juggle the cups with flair! The cats purr in applause but now you're tired. \nYou GAINED +1 Tea Magic \nYou LOST -3 Star Strength");
                    player.teaMagic += 1;
                    player.strength -= 3;
                } else {
                    System.out.println("You dropped their favorite cups! The cats hiss in disapproval. \nYou LOST -2 Health \nYou LOST -2 Levels of Experience \nYou LOST -3 Star Strength");
                    player.health -= 2;
                    player.experience -=2;
                    player.strength -= 3;
                }
                break;
            case "2":
                System.out.println("They sniff the catnip and break into a synchronized tea dance but hair is everywhere. \nYou LOST -4 Tea Magic \nYou GAIN +1 Star Strength \nYou LOST -2 Star Health");
                player.teaMagic -= 4;
                player.strength += 1;
                player.health -= 2;
                break;
            case "3":
                if (player.experience >= 6) {
                    System.out.println("The head cat bows in acknowledgment but your allergies are acting up again. \nYou GAIN +1 Wisdom \nYou LOST -3 Star Health");
                    player.wisdom += 1.0;
                    player.health -= 3;
                } else {
                    System.out.println("They think you’re just staring awkwardly. No effect.");
                }
                break;
            default:
                System.out.println("You trip on a tail. -1 Star Health.");
                player.health -= 1;
        }

        System.out.println("\nYour updated stats:");
        System.out.println(player);
    }
}
