package testing;


public class Card {
	private int count;
	private String suit;
	private String key;
	private int num;
	
	public Card() {
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getSuit() {
		return suit;
	}

	public void setSuit(String suit) {
		this.suit = suit;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}
	
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public void show() {
		System.out.println("Suit is " + this.suit + ". Key is " + this.key + ". number is " + this.num + ".");
	}
	
}
