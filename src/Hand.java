import java.util.ArrayList;

public class Hand {
	
	private ArrayList<Card> playerHand = new ArrayList<Card>();
	private String name;
	
	public Hand(String n) {
		name = n;
		playerHand = new ArrayList<Card>();
		
		
	}
	
	void takeCard(Card c) {
		playerHand.add(c);
	}
	//play Card
	public Card playCard(Card rhs) {
		Card c;
		for(int i = 0; i < playerHand.size(); i++) {
			if(playerHand.get(i).isMatch(rhs)) {
				c = playerHand.get(i);
				playerHand.remove(1);
				return c;
			}
		}
		//should not happen
		return null;
		
	}

	@Override
	public String toString() {
		return "" + name + "," + playerHand + "";
	}
	
	
	
	
	
}

