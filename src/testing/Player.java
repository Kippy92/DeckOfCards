package testing;

import java.util.ArrayList;

public class Player {
	private String name;
	private ArrayList <Card> hand;
	
	public Player() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Card> getHand() {
		return hand;
	}

	public void setHand(ArrayList<Card> hand) {
		this.hand = hand;
	}
	public void draw(Deck deck) {
		ArrayList <Card> x = this.getHand();
		if (x == null) {
			x = new ArrayList<Card>();
			x.add(deck.deal());
			this.setHand(x);
		}
		else {
			x.add(deck.deal());
			this.setHand(x);
		}
	}
	public void remove(int i) {
		this.hand.remove(i);
	}
	public void showHand() {
		System.out.println(this.getName());
		for (int i = 0; i < this.getHand().size(); i++) {
			this.getHand().get(i).show();
		}
	}
}
