package testing;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
	private ArrayList <Card> cards;
	private String[] suits = {"Hearts", "Diamonds", "Spades", "Clubs"};
	private String[] rate = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
	private int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
	private int count = 0;
	
	public Deck() {
	}
	
	public ArrayList<Card> getCards() {
		return cards;
	}



	public void setCards(ArrayList<Card> cards) {
		this.cards = cards;
	}



	public String[] getSuits() {
		return suits;
	}



	public void setSuits(String[] suits) {
		this.suits = suits;
	}



	public String[] getRate() {
		return rate;
	}



	public void setRate(String[] rate) {
		this.rate = rate;
	}



	public int[] getNums() {
		return nums;
	}



	public void setNums(int[] nums) {
		this.nums = nums;
	}



	public int getCount() {
		return count;
	}



	public void setCount(int count) {
		this.count = count;
	}



	public void initialize() {
		for (int i = 0; i < nums.length; i++) {
			for(int j = 0; j < suits.length; j++) {
				this.setCount(this.getCount() + 1);
				Card temp = new Card();
				temp.setCount(count);
				temp.setSuit(suits[j]);
				temp.setNum(nums[i]);
				temp.setKey(rate[i]);
				ArrayList<Card> z = this.getCards();
				if(z == null) {
					z = new ArrayList<Card>();
					z.add(temp);
					this.setCards(z);
				}
				else {
					z.add(temp);
					this.setCards(z);
				}
			}
		}
	}
	
	public void shuffle() {
		Collections.shuffle(this.getCards());
	}
	
	public Card deal() {
		ArrayList<Card> z = this.getCards();
		Card y = z.remove(z.size()-1);
		this.setCards(z);
		this.setCount(this.getCount()-1);
		System.out.println(y.getKey());
		return y;
	}
	
	public void reset() {
		Deck tempDeck = new Deck();
		tempDeck.initialize();
		this.setCards(tempDeck.getCards());
		this.setCount(tempDeck.getCount());
	}
	
}
