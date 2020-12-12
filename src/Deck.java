import java.util.ArrayList;
import java.util.Collections;

public class Deck {
	
	private ArrayList<Card> theDeck = new ArrayList<Card>();
	
	public Deck() {
		//stock the deck with 108 UNO cards
		
		//values 1 - 12 first
		for(int i = 1; i <= 12; i++) {
			for (int j = 1; j <= 2; j++) {
				theDeck.add(new Card(0, i));
				theDeck.add(new Card(1, i));
				theDeck.add(new Card(2, i));
				theDeck.add(new Card(3, i));
			}
		}
	}
	
	public void shuffle() {
		Collections.shuffle(theDeck);
	}
	
	public boolean isEmpty() {
		if(theDeck.isEmpty()) return true;
		else return false;
	}

	public Card dealCard() {
		//deck must not be empty
		
		//get the card at the tail of the deck
		Card c = theDeck.remove(theDeck.size()-1);
		return c;
	}
	
	@Override
	public String toString() {
		return "[" + theDeck + "]";
	}
	

}
