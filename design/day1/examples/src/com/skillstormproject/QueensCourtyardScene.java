package com.skillstormproject;

public class QueensCourtyardScene extends Scene{
	public QueensCourtyardScene() {
		super(2,
				"Impatient Queen's Courtyard",
				"Well, you arrived at a bad time, the Queen is not happy because her people refuse to pay taxes and " 
				+ "\nyou came without notice so she's fuming. Choose wisely.\n",
				"Brew her a cup with your rarest ingredience",
				"Recite a poem about the make-believe tea parties she had as a child",
				"Skedaddle outta here, politely of course");
	}
	
	@Override
    public void handleOption(String input, TeaPlayer player) {
        switch (input) {
            case "1":
                if (player.experience >= 7) {
                    System.out.println("\nYour rare blend amazes the Queen. She grants you a gold leaf token. \nYou GAINED +2 Tea Magic!");
                    player.teaMagic += 2;
                } else {
                    System.out.println("\nYou're carrying spoiled ingredients. She’s beyond disappointed. \nYou LOST -3.5 Wisdom.");
                    player.wisdom -= 3.5;
                }
                break;
            case "2":
                if (player.wisdom >= 7.0) {
                    System.out.println("\nYour poem moves the Queen to tears but you were nervous. \nYou gain +1 Wisdom \nYou LOST -1 Star Health.");
                    player.wisdom += 1.0;
                    player.health -= 1;
                } else {
                    System.out.println("\nYour poem was boring and didn't rhyme, she's not impressed just annoyed. \nYou LOST -1 Star Strength from embarrassment \nYou LOST -1.5 Wisdom");
                    player.strength -= 1;
                    player.wisdom -= 1.5;
                }
                break;
            case "3":
                System.out.println("\nThe Queen is amused by your cowardice. She sends guards to get retrieve you and brews YOU a cup of tea. \nYou GAINED +2 Star Health.");
                player.health += 2;
                break;
            default:
                System.out.println("\nYou spill your tray. \nYou LOST -5 Star Strength");
                player.strength -= 5;
        }

        System.out.println("\nYour updated stats:");
        System.out.println(player);
    }

}
