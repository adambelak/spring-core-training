package com.epam.training.springcore.domain;

public class Card {

	private String name;
	private int damage;
	private int lives;
	private int mana;
	private Ability abality;
	
	public Card(String name, int damage, int lives, int mana, Ability ability) {
		this.name = name;
		this.damage = damage;
		this.lives = lives;
		this.mana = mana;
		this.abality = ability;
	}

	public int getLives() {
		return lives;
	}

	public void setLives(int lives) {
		this.lives = lives;
	}

	@Override
	public String toString() {
		return "Card [name=" + name + ", damage=" + damage + ", lives=" + lives + ", mana=" + mana + ", abality="
				+ abality + "]";
	}
	
}
