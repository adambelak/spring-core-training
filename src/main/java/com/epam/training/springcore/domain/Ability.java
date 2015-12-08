package com.epam.training.springcore.domain;

public abstract class Ability {

	protected final int cost;

	public Ability(int cost) {
		this.cost = cost;
	}

	public abstract void effect(Card card);
	
}
