
public class Driver {

	public static void main(String[] args) {
		
		Deck d = new Deck();
		System.out.println(d);
		d.shuffle();
		System.out.println(d);
		
		if(!d.isEmpty()) {
			System.out.println(d.dealCard());
		}

	}

}
