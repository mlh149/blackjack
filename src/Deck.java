import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Deck {
	private ArrayList<Card> cards = new ArrayList<Card>(52);
      
	public Deck() {
		for (int j = 0; j < 4; j++) {
			for (int i = 0; i < 13; i++) {
				cards.add(new Card(i, j));
			}
		}
	}
	
	public void printAllCards() {
		for (Card c : cards) {
			System.out.print(c.toString() + " \t| ");
		}
	}
        
        ArrayList<Card> getCards() {
            return cards;
        }
        
        public void shuffle() {
            Collections.shuffle(cards);
        }
        
        public void sort() {
            Collections.sort(cards);
        }
}
