package com.epam.training.springcore.domain;

public class HealthAbility extends Ability {

	public HealthAbility(int cost) {
		super(cost);
	}

	@Override
	public void effect(Card card) {
		card.setLives(card.getLives() + cost);
	}

	@Override
	public String toString() {
		return "HealthAbility [cost=" + cost + "]";
	}

}
