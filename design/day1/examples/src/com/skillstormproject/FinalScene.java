package com.skillstormproject;

public class FinalScene extends Scene {
	public FinalScene() {
        super(
            5,
            "The Steeping Stone of Reflection back in the Garden",
            "After your adventure, you return to the Garden and see the Steeping Stone of Reflection."
            + " It's a quiet place where you can reflect on the chaotic tea events \nand "
            + "a final cup waits for you before the sun sets. \nWhat do you choose to do with it?\n",
            
            "Take a sip then sit on the grass with your back leaning on the stone while staring at the sky",
            "Offer the tea back to the garden in respect",
            "Toss the tea behind your back and walk away");
    }
	@Override
    public void handleOption(String input, TeaPlayer player) {
        switch (input) {
            case "1":
                System.out.println("\nYou sip the tea. It’s warm and calming but you're falling asleep too fast, you look back at the cup "
                		+ "\nand see the cross skull bones. The garden has poisoned you to keep you as fertilizer for more brews!!!"
                		+ "\nYou LOST ALL remaining Star Strength before using the Tea Magic Tokens and now your Star Health is gone.");
               player.strength = 0; //just reset to 0 since they got poisoned
               player.health = 0; //reset to 0 since they died from being poisoned
                break;
            case "2":
                System.out.println("\nYou pour the tea into the roots of the garden. The grass turns brown and you see a faint sizzle."
                		+ "\nYou narrowly avoided being poisoned by the Garden! You're shaken in fear... "
                		+ "\nYou GAIN one last level of experience +1 \nYou LOST 2 Strength Stars \nYou GAIN some wisdom +1.5");
                player.experience += 1;
                player.strength -= 2;
                player.wisdom += 1.5;
                break;
            case "3":
                System.out.println("\nYou walk away without touching the tea because this world is too unpredictable. "
                		+ "\nYou just want to go home.");
                break;
        }

        System.out.println("\nThank you for playing your Tea Adventure, " + player.name + "!");
        System.out.println("\nFinal stats:");
        System.out.println(player);
    }

}
