//defines an UNO card object

public class Card {

	private int color;
	private int value;
	private String face;
	
	//color dictionary
	//R == 0
	//Y == 1
	//B == 2
	//G == 3
	//No color == 4
	//value dictionary
	//10 == skip
	//11 == reverse
	//12 == draw2
	//13 == wild
	//14 == w4
	public Card(int c, int v) {
		color = c;
		value = v;
	}

	public void setColor(int c) {
		color = c;
	}
	
	public void setValue(int v) {
		value = v;
	}
	
	public boolean isMatch(Card c2) {
		//see if this card is wild
		if(this.value == 13 || this.value == 14) {
			return true;
		}
		else if(this.color == c2.color) {
			return true;
		}
		else if(this.value == c2.value) {
			return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		String c;
		if(color == 0)
			c = "R";
		else if(color == 1)
			c = "Y";
		else if(color == 2)
			c = "B";
		else
			c = "G";
		return "[" + c + ", " + value + "]";
	}
	
	
	
}

