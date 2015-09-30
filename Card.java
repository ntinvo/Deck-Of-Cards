public class Card {
	public final static int SPADE = 0;
	public final static int CLUB = 1;
	public final static int DIAMOND = 2;
	public final static int HEART = 3;

	private int suit;
	private int rank;

	public Card(int suit, int rank) {
		this.suit = suit;
		this.rank = rank;
	} 


	public int getSuite() {
		return suit;
	}

	public int getRank() {
		return rank;
	}

	public String toString() {
		String suitString = "", rankString = "";
		
		switch(rank) {
			case 1:
				rankString = "Ace";
				break;
			case 2:
				rankString = "Two";
				break;
			case 3:
				rankString = "Three";
				break;
			case 4:
				rankString = "Four";
				break;
			case 5:
				rankString = "Five";
				break;
			case 6:
				rankString = "Six";
				break;
			case 7:
				rankString = "Seven";
				break;
			case 8:
				rankString = "Eight";
				break;
			case 9:
				rankString = "Nine";
				break;
			case 10:
				rankString = "Ten";
				break;
			case 11:
				rankString = "Jack";
				break;
			case 12:
				rankString = "Queen";
				break;
			case 13:
				rankString = "King";
				break;
		}

		switch(suit) {
			case Card.SPADE:
				suitString = "Spade";
				break;
			case Card.CLUB:
				suitString = "Club";
				break;
			case Card.DIAMOND:
				suitString = "Diamond";
				break;
			case Card.HEART:
				suitString = "Heart";
				break;
		}

		return rankString + " of " + suitString;
	}
}