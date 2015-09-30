import java.util.*;

public class Test {
	public static void main(String[] args) {
		Deck deck = new Deck();
		deck.shuffle(100);
		System.out.println(deck);
	}
}