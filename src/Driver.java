
public class Driver {

	public static void main(String[] args) {
		
		Deck d = new Deck();
		d.shuffle();
		Hand [] thePlayers = new Hand[4];
		thePlayers[0] = new Hand("Nick");
		thePlayers[1] = new Hand("Noah");
		thePlayers[2] = new Hand("Julio");
		thePlayers[3] = new Hand("Jr");
		
		//do for all players
		for(int i = 0; i < 7; i++) {
			thePlayers[0].takeCard(d.dealCard());
			thePlayers[1].takeCard(d.dealCard());
			thePlayers[2].takeCard(d.dealCard());
			thePlayers[3].takeCard(d.dealCard());
		}
		System.out.println(thePlayers[0]);
		System.out.println(thePlayers[1]);
		System.out.println(thePlayers[2]);
		System.out.println(thePlayers[3]);
		
		
		boolean winner = false;
		while(!winner) {
			//get current player
			//player plays
			//see if this player one
			//update winner
		}
			
		
		System.out.println(d);
		d.shuffle();
		System.out.println(d);
		
		if(!d.isEmpty()) {
			System.out.println(d.dealCard());
		}

	}

}
