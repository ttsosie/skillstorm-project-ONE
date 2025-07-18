package com.skillstormproject;

public class TeaPlayer {
	
	public String name;
	public double wisdom;
	public int experience;
	public int health;
	public int strength;
	public int teaMagic;
	
	public TeaPlayer(String name, double wisdom, int experience, int health, int strength, int teaMagic) {
		this.name = name;
		this.wisdom = wisdom;
		this.experience = experience;
		this.health = health;
		this.strength = strength;
		this.teaMagic = teaMagic;
	}
	
	//To show the player's stats back to them after each scene
	@Override
	public String toString() {
		return "Tea Player: " + name +
				"\nWisdom: " + wisdom +
				"\nHerbal Level of Experience: " + experience +
				"\nStar Health: " + "* ".repeat(health) +
				"\nStar Strength: " + "* ".repeat(strength) +
				"\nAvailable Tea Magic Tokens: " + teaMagic;
	}

}
