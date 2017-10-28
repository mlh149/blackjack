
public class Card implements Comparable<Card> {
	private int value;
	private int suit;
        
        private String[] cardSuit = {"Clubs", "Spades", "Diamonds", "Hearts"};
        private String[] cardValue = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
	
	public Card(int faceValue, int suit) {
		this.value = faceValue;
		this.suit = suit;
	}
	
	void setFaceValue(int faceValue) {
		this.value = faceValue;
	}
	
	public void setSuit(int suit) {
		this.suit = suit;
	}

	int getFaceValue() {
		return value;
	}
	
	String getSuit() {
		return cardSuit[suit];
	}
        
        int getSuitValue() {
            return suit;
        }

	@Override
	public String toString() {
		String cardInfo = cardValue[value] + cardSuit[suit] + " ";
                return cardInfo;
	}
        
        String getImage() {
            return cardValue[value] + cardSuit[suit] + ".png";
        }

    @Override
    public int compareTo(Card o) {
        int compareSuit = ((Card) o).getSuitValue();
        int compareValue=((Card) o).getFaceValue();
        
        if(this.suit == compareSuit) {
            /* For Ascending order of values */
            return this.value - compareValue;
         }
        
        /* For Ascending order of suits */
        else return this.suit - compareSuit; 

    }
}
