import java.util.Collections;
import java.util.HashMap;

public class Deck extends Hand{

    private static HashMap< int[] , Card> cardHashMap;

    public Deck(){
        super();
        generateDeck();
    }

    public void generateDeck() {
        this.clear();
        for (Suit suit: Suit.values()){
            for (CardRank rank: CardRank.values()){
                Card card = new Card(suit,rank);
                this.add(card);
            }
        }
    }

    public void shuffleDeck(){
        Collections.shuffle(this.handOfCards);
    }

    public static void main(String[ ] args) {
        Deck deck = new Deck();
        deck.shuffleDeck();
        System.out.println(deck.toString());
    }
}


