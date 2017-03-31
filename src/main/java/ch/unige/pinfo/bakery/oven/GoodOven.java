package ch.unige.pinfo.bakery.oven;

import javax.enterprise.inject.Alternative;

import ch.unige.pinfo.bakery.dish.IDish;

@Alternative
public class GoodOven implements IOven {
	
	IDish dish;

	public IDish getDish() {
		return dish;
	}

	public void setDish(IDish dish) {
		this.dish = dish;
		this.dish.setQuality("good");
	}
	
}
