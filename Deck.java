import java.lang.*;

public class Deck {
	private final int MAX_CARD = 52;
	private final int HIGHEAST_RANK = 13;
	private Card[] deck = new Card[MAX_CARD];

	public Deck() {
		int index = 0;
		for(int suit = Card.SPADE; suit <= Card.HEART; suit++) {
			for(int rank = 1; rank <= HIGHEAST_RANK; rank++) {
				Card card = new Card(suit, rank);
				deck[index] = card;
				index++;
			}
		}
	}

	public void shuffle(int numShuffle) {
		int randA, randB;

		for(int index = 0; index < numShuffle; index++) {
			randA = (int) (MAX_CARD * Math.random());
			randB = (int) (MAX_CARD * Math.random());
			Card tempCard = deck[randA];
			deck[randA] = deck[randB];
			deck[randB] = tempCard;
		}
	}

	public String toString() {
		String s = "";
		int index = 0;

		for(int suit = Card.SPADE; suit <= Card.HEART; suit++) {
			for(int rank = 1; rank <= HIGHEAST_RANK; rank++) {
				s += deck[index] + " ";
				s += "\n";
				index++;
			}
		}
		return s;
	}
}