package ch.unige.pinfo.bakery.oven;

import javax.enterprise.inject.Default;

import ch.unige.pinfo.bakery.dish.IDish;

@Default
public class BadOven implements IOven {
	
	IDish dish;

	public IDish getDish() {
		return dish;
	}

	public void setDish(IDish dish) {
		this.dish = dish;
		dish.setQuality("bad");
	}
	
}
