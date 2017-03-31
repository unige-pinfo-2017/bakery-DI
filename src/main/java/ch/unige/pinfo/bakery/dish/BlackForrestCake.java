package ch.unige.pinfo.bakery.dish;

public class BlackForrestCake implements IDish {

	private String quality;

	@Override
	public String toString() {
		return quality + " BlackForrestCake";
	}

	@Override
	public void setQuality(String string) {
		this.quality = string;
	}
}
