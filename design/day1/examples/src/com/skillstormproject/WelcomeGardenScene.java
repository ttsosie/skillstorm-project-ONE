package com.skillstormproject;

public class WelcomeGardenScene extends Scene {
	public WelcomeGardenScene() {
		super(1, 
				"Welcome Garden",
				"The air is cool, grass is green and you want to try having tea with exciting guests."
				+ "\n3 doors appear in front of you that allow you to teleport to where the guest is. "
				+ "\nChoose a door based who you want to have tea with.\n",
				"Suprise the Queen with a creative brew in her courtyard",
				"Stroll to a party of Cats for fuzzy delights",
				"Take a stroll through the mist to try and have a pot with a mysterious guest");
	}
	
	@Override
    public void handleOption(String input, TeaPlayer player) {
        switch (input) {
            case "1":
                System.out.println("\nThe Queen's courtyard takes some work to get into. \nYou LOST -2 Star Strengths \nYou LOST -1.5 Wisdom for not thinking ahead.");
                player.strength -= 2;
                player.wisdom -= 1.0;
                break;
            case "2":
                System.out.println("\nThe cats party requires some strength to handle their company and it turns out you're allergic. \nYou LOST -3 Star Strengths \nYou LOST -2 Star Health");
                player.strength -= 3;
                player.health -= 2;
                break;
            case "3":
                System.out.println("\nThe mystery guest speaks is introverted, they'll need some magic to even approach them. \nYou LOST -2 Tea Magic Tokens.");
                player.teaMagic -= 2;
                break;
            default:
                System.out.println("\nYou spill your cup in confusion. No effect.");
        }
        
        System.out.println("\nYour updated stats:");
        System.out.println(player);
    }
}
